# Spring Boot on Docker connecting to MySQL Docker container

We can easily run the whole with only a single command:

docker-compose up
Docker will pull the MySQL and Spring Boot images (if our machine does not have it before).

The services can be run on the background with command:
docker-compose up -d

Stopping all the running containers is also simple with a single command:
docker-compose down

If you need to stop and remove all containers, networks, and all images used by any service in docker-compose.yml file, use below command:
docker-compose down --rmi all

#Endpoint urls

http://localhost:8083/all/

http://localhost:8083/all/create
Below is the json request for above endpoint
{
"id":1,
"name":"test",
"salary":2000,
"teamName":"xyz"
}