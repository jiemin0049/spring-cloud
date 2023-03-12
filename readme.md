Limits Service 8080, 8081 ...

Spring Cloud Config Server 8888

Currency Exchange Service 8000, 8001, 8002

Currency Conversion Service 8100, 8101, 8102

Netflix Eureka Naming Server 8761

Netflix Zuul API Gateway Server 8765

Zipkin Distributed Tracing Server 9411

--------------------------------------------------------
"limits-service" gets config from git-localconfig-repo through "config-server"

## URL

naming-server/Eureka: localhost:8761

currency-conversion: localhost:8100/currency-converter/from/AUD/to/CNY/quantity/10

currency-exchange: localhost:8000/currency-exchange/from/USD/to/CNY

api-gateway exchange:
http://localhost:8765/CURRENCY-EXCHANGE-SERVICE/currency-exchange/from/USD/to/CNY

api-gateway converter:
http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-converter/from/AUD/to/CNY/quantity/10

--------------------------------------------------------

use maven to create docker:
1. add

   <build>
       <plugins>
           <plugin>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-maven-plugin</artifactId>
               <configuration>
                   <image>
                       <name>santan/mm-${project.artifactId}:${project.version}</name>
                   </image>
                   <pullPolicy>IF_NOT_PRESENT</pullPolicy>
               </configuration>
           </plugin>
       </plugins>
   </build>

2. open edit configuration and add maven:
  run field: spring-boot:build-image -DskipTests
  working directory field: service folder
3. run maven

