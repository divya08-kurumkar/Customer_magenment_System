# Customer Management System


## Introduction

The Customer Management System  is a web application designed to manage customer information efficiently. 
It provides a user-friendly interface for adding, updating, deleting, and viewing 
customer details, along with a secure authentication mechanism.
It is build using Spring Boot, Spring MVC, Thymeleaf, Spring Data JPA, and MySQL database.

#Tools and Technologies Used
Java 
Spring Boot 
Spring MVC
Spring Data JPA 
MySQL
Thymeleaf
Eclipse 

1. Create Spring Boot Project-
    --create a Spring boot project in Eclipse select New -> Spring Starter Project.
    --Selected below dependencies while creating spring boot project using spring initializr:
	- Spring Web
	- Thymeleaf
	- Spring Data JPA
	- MySQL Driver
	- Spring Boot Devtools

2.  Create Spring Boot Project Structure
	Let's create the below packages in our Spring boot project:
		- controller
		- service
		- repository
		- entity

3. Create Student JPA Entity-
	Let's create a Customer JPA entity under the entity package and add the  content to it

4. Create JPA CustomerRepository-
	Let's create a CustomerRepository interface under the repository package and add the content it.

5. Configure MySQL Database-
	Before configuring the MySQL database configuration in our Spring boot project, first, create a database named customer in MySQL workbench:
	create database customer;
	
	open the application.properties file and add following content to it:
	spring.datasource.url=jdbc:mysql://localhost:3306/customer
	spring.datasource.username=root
	spring.datasource.password=divya

	#Hibernate
	spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect

	#Hibernate auto ddl
	spring.jpa.hibernate.ddl-auto=update

6.Creating Service Layer-
	CustomerService Interface
	Let's create a CustomerService interface under the service package and add the  content to it

	-CustomerServiceImpl Class-
		Let's create a new package called impl inside the service package. Let's create class CustomerServiceImpl  and add the content to it:
	
7. Controller Layer-
	Let's create a CustomerController class and add the content to it

8. View Layer
	-resources/templates/customer.html
	-resources/templates/CreateCustomerstudent.html
	-resources/templates/EditCustomer.html

9. Run Spring Boot Application
	Run the Spring boot application with the main class

10. Demo
	Once the Spring boot application is up and running then use the below URL to access this application:
	URL: http://localhost:8080/customers

