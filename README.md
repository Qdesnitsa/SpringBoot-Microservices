1. To add new instance of microservice:
from cmd root project directory: java -jar -Dserver.port=8084 department-service/target/department-service-0.0.1-SNAPSHOT.jar

2. After editing config settings in config-server-repo on github:
2.1 restart config-server;
2.2 For department-service if there are any config changes call:
POST http://localhost:8080/actuator/refresh; 
2.3 For employee-service if there are any config changes call:
POST http://localhost:8082/actuator/refresh;

3. We can use Spring Cloud Bus & Message Broker to avoid calling /refresh for each microservice
docker pull rabbitmq:3.11.15
docker run --rm -it -p 5672:5672 rabbitmq:3.11.15
After editing config settings in config-server-repo on github call:
POST http://localhost:{port}/actuator/busrefresh for any only 1 microservice

4. Start Zipkin server gather for timing data needed to troubleshoot latency problems in service architectures.
- download jar file and execute: java -jar zipkin-server-2.24.2-exec.jar
OR
- run as a docker container: docker run --rm -it --name zipkin -p 9411:9411 openzipkin/zipkin
Go to http://127.0.0.1:9411/zipkin/

5. The Circuit Breaker pattern has a different purpose than the "Retry pattern". 
The "Retry pattern" enables an application to retry an operation with the expectation that the operation will eventually succeed. 
The Circuit Breaker pattern prevents an application from performing an operation that's likely to fail.
- Use the Retry pattern when the dependent microservice is temporarily down and after a few retries, it is a chance that it return success response (Once it is up)
- Circuit Breaker pattern is useful in scenarios of long-lasting faults. Consider a loss of connectivity or the failure of a service that takes some time to repair itself. 
In such cases, it may not be of much use to keep retrying often if it is indeed going to take a while to hear back from the server. 
The Circuit Breaker pattern wants to prevent an application from performing an operation that is likely to fail. 
Circuit Breaker pattern reduces the number of calls by maintaining the states and this leads to saving resources.

6. To create react frontend quickly type in VS Code terminal:
   npx create-react-app my-app
   cd my-app
   npm start
## find process we need to stop by port (run powershell as admin): netstat -ao | findstr :{port}
## stop process: taskkill -PID {process ID} -F

