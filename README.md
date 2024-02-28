# Airline Booking System  
Airline Booking System using Java Full Stack. The airline web application where user can having specified CRUD operations with the ability to search for flights, make bookings, and manage their reservations.  

## Technology Stack  
**The application is built using the following technologies:**  


Java  
Spring Framework  
Spring Boot  
Spring Data JPA  
MySQL  


## Application Modules  
The application consists of the following modules:
Login
Registration


## Features  
**Flight Search:** Users can search for flights based on various criteria such as origin, destination, date, and class.  
**Booking Management:** Users can create, modify, and cancel their bookings  


## Setup & Execution  
Clone the repository to your local machine.  
Import the project into your preferred Java IDE.  
Configure the database connection properties in application.properties.  
Run the application.  


_Before running the API server, ensure to update the database configuration in the application.properties file. Adjust the port number, username, and password according to your local database configuration._

_server.port=8080_  

spring.datasource.url=jdbc:mysql://localhost:3306/springProject  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
spring.datasource.username=root  
spring.datasource.password=******  
Once the application is running, you can access it at http://localhost:8080.  
