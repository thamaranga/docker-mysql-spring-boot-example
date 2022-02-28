# Spring Boot on Docker connecting to MySQL Docker container

We can easily run the whole with only a single command:

docker-compose up
Docker will pull the MySQL and Spring Boot images (if our machine does not have it before).

The services can be run on the background with command:

docker-compose up -d

Stopping all the running containers is also simple with a single command:

docker-compose down
If you need to stop and remove all containers, networks, and all images used by any service in docker-compose.yml file, use the command:

docker-compose down --rmi all

## Useful Docker commands
- `docker images`
- `docker container ls`
- `docker logs <container_name>`
- `docker container rm <container_name`
- `docker image rm <image_name`
