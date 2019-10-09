# tcd-netflix
tcd

<h2>How to setup development environment</h2>

Import Maven Projet
Root File -> Properties -> Java Build Path -> Libraries -> Add Library -> JRE -> Alternate

<h2>How to run docker</h2>

docker run --name=netflixdb -e MYSQL_PASSWORD=senha -e MYSQL_USER=usuario -e MYSQL_ROOT_PASSWORD=admin123 -e MYSQL_DATABASE=netflix -h localhost -p 3306:3306 -d mysql/mysql-server

<h2>How to access the database</h2>

docker exec -it netflixdb mysql -h localhost -u root -p

Use the password: admin123

<h2>How to run the application from Eclipse</h2>

Click on root file
Run As...
Maven Install
Run As...
Spring Boot App

Start in the following Order:

1. Docker
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
