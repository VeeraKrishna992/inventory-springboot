# Inventory Spring Boot Demo

A ready-to-import Maven Spring Boot 3.5.7 application packaged as WAR. Java 17+; compatible with Tomcat 10.1+ (not Tomcat 9).

## Run in Eclipse / STS
1. Extract ZIP.
2. File > Import > Maven > Existing Maven Projects; select the `inventory-springboot` directory.
3. Wait for Maven dependencies to download (internet required first time).
4. Right-click `InventoryApplication.java` > Run As > Java Application (or Spring Boot App in STS).
5. Open http://localhost:8080/ and http://localhost:8080/api/inventory

## Build WAR
Run `mvn clean package` in the project directory. Output: `target/inventory-springboot.war`.

## Deploy to external Tomcat
Copy WAR to Tomcat 10.1+ `webapps/`, start server, visit http://localhost:8080/inventory-springboot/ and /inventory-springboot/api/inventory.

## OpenShift
Build a container image containing the WAR and a compatible Tomcat 10.1+ runtime, push the image to a registry accessible by OpenShift, then deploy the image. This ZIP alone is not a container image.

No database is required; inventory records are in-memory sample data.
