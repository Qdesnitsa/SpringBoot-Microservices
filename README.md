1. To add new instance of microservice:
from cmd root project directory: java -jar -Dserver.port=8084 department-service/target/department-service-0.0.1-SNAPSHOT.jar
2. After editing config settings in config-server-repo on github:
2.1 restart config-server
2.2 call POST http://localhost:8080/actuator/refresh

