# tcd-netflix
tcd

How to setup
Import Maven Projet
Root File -> Properties -> Java Build Path -> Libraries -> Add Library -> JRE -> Alternate

Click on root file
Run As...
Maven Install
Run As...
Spring Boot App

How to run docker

docker run --name=netflixdb -e MYSQL_PASSWORD=senha -e MYSQL_USER=usuario -e MYSQL_ROOT_PASSWORD=admin123 -e MYSQL_DATABASE=netflix -p 3306:3306 -d mysql/mysql-server

How to access the API

http://localhost:8080/swagger-ui.html
