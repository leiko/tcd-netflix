# tcd-netflix

Nexflix microservices use case project using Spring Boot and Spring Cloud.

<h2>Netflix Microservices</h2>
<img src="https://user-images.githubusercontent.com/29177721/67609251-2b7d5300-f762-11e9-8fcd-2fda2a4ee03e.jpg" alt="modeling">

ContentService: service with content (movies, series..) endpoints. 

ProfileService: service with profile preferences endpoints. 

SupportService: service with support endpoints. 

EurekaServer: service discovery for all the services. 

ConfigurationServer: all services configuration is located in this server.

<h2>How to setup development environment</h2>

Import Maven Projet
Root File -> Properties -> Java Build Path -> Libraries -> Add Library -> JRE -> Alternate

<h2>How to run docker</h2>

docker run --name=netflixdb -e MYSQL_PASSWORD=senha -e MYSQL_USER=usuario -e MYSQL_ROOT_PASSWORD=admin123 -e MYSQL_DATABASE=netflix -h localhost -p 3306:3306 -d mysql/mysql-server

<h2>How to access the database</h2>

docker exec -it netflixdb mysql -h localhost -u root -p

Use the password: admin123

<h2>How to run the application from Eclipse</h2>

Configurar e instalar requirements para menssaging with kafka
- Apache ZooKeeper
- Apache Kafka
- Criar tópico ticketChangeTopic

Click on root file
Run As...
Maven Install
Run As...
Spring Boot App

Start in the following Order:

1. MySQL Docker
2. EurekaServer
3. ConfigurationServer
4. ContentService
5. ProfileService
6. SupportService

<h2>How to access the APIs</h2>

ContentService
http://localhost:8080/swagger-ui.html

ProfileService
http://localhost:8090/swagger-ui.html

SupportService
http://localhost:8888/swagger-ui.html

EurekaServer
http://localhost:8761 

ConfigurationServer
http://localhost:8888 

