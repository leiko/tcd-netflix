# tcd-netflix
tcd

<h2>How to setup</h2>

Import Maven Projet
Root File -> Properties -> Java Build Path -> Libraries -> Add Library -> JRE -> Alternate

<h2>How to run docker</h2>

docker run --name=netflixdb -e MYSQL_PASSWORD=senha -e MYSQL_USER=usuario -e MYSQL_ROOT_PASSWORD=admin123 -e MYSQL_DATABASE=netflix -p 3306:3306 -d mysql/mysql-server

<h2>How to run the application</h2>
Click on root file
Run As...
Maven Install
Run As...
Spring Boot App

<h2>How to access the API</h2>

http://localhost:8080/swagger-ui.html
