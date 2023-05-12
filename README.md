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

## find process we need to stop by port (run powershell as admin): netstat -ao | findstr :{port}
## stop process: taskkill -PID {process ID} -F

