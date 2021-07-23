web-api-demo
============

A Web API demo version to demonstrate a functionality of a Web service.

Requirements:
-------------
* OpenJDK 8+
* Spring Boot
* Gradle

Build
-----
On Windows:

`.\gradlew build`

On UNIX:

`./gradlew build`

Usage
-----
1.  _cd_ to the directory of the JAR file and start the __Draft Ticket Price Service__.
    
    On Windows:
    ```powershell
    cd ${PROJECT_ROOT}\build\libs
    java -jar .\dummy-tax-service-x.y.z[-SNAPSHOT].jar
    ```
    
    On UNIX:
    ```shell
    cd ${PROJECT_ROOT}/build/libs
    java -jar dummy-tax-service-x.y.z[-SNAPSHOT].jar
    ```

1. To test a functionality, open a browser and type `http://localhost:9091/baseprice/Vilnius` for getting a base price
   for a bus ticket to Vilnius or type `http://localhost:9091/taxes` for getting a list of applicable tax rates.
   
    A server port of this application has been defined in __application.properties__.