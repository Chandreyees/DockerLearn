# DockerLearn

# Overview
This project demonstrates how to use Docker and Docker Compose to containerize a Spring Boot application with a MySQL database. The application is a simple Spring Boot service connected to a MySQL database. This README provides instructions on how to set up, build, and run the application using Docker and Docker Compose.

Prerequisites
Docker: Ensure Docker is installed on your machine. Follow the Docker installation guide.
Docker Compose: Ensure Docker Compose is installed. Follow the Docker Compose installation guide.

Getting Started
Clone the Repository
bash
Copy code
git clone https://github.com/your-username/docker-learn.git
cd docker-learn
Build the Docker Image
Navigate to the root directory of your Spring Boot project (where the Dockerfile is located).

Build the Docker image:

docker build -t spring-boot-app .
docker-compose up --build
This command builds the Docker image and starts the application and database services.

Verify the application by opening your browser and navigating to http://localhost:8080. 

Manage Docker Containers
List running containers:
docker ps
Stop the containers:
docker-compose down
Remove stopped containers and volumes:
docker-compose rm -v
Push Docker Image to a Registry
Tag the Docker image (replace your-dockerhub-username with your Docker Hub username):
docker tag spring-boot-app your-dockerhub-username/spring-boot-app
Push the Docker image to Docker Hub:
docker push your-dockerhub-username/spring-boot-app
Pull Docker Image from a Registry
Pull the Docker image from Docker Hub:
docker pull your-dockerhub-username/spring-boot-app

Run the Docker image locally:
docker run -d -p 8080:8080 username/spring-boot-app
Troubleshooting
Database Initialization Errors: Ensure that the MySQL database container is running and the environment variables are correctly set in docker-compose.yml.







