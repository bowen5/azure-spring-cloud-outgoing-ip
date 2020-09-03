# azure-spring-cloud-outgoing-ip
This app is to get outgoing ip for Azure Spring Cloud Apps.

Please use the following command to build

```
cd outgoing-ip-app
mvn clean package -DskipTests
```

And then follow https://docs.microsoft.com/en-us/azure/spring-cloud/spring-cloud-quickstart?tabs=Azure-CLI#build-and-deploy-the-app to deploy the application on your Azure Spring Cloud service instance.

After that, you can open `https://<service instance name>-<application name>.azuremicroservices.io/outgoing-ip` to get the outgoing ip of **the whole service instance**.
