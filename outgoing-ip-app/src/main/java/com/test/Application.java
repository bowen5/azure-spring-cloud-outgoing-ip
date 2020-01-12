package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String [] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/outgoing-ip")
    public String getOutgoingIp() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject(new URI("http://checkip.dyndns.org/"), String.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Exception occurred.";
    }
}
