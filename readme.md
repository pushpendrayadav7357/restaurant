# Restaurant Management System

## Frameworks and Language Used
- Spring Boot for the backend
- Java for programming
- Spring Initializr
- Maven for dependency management

## Data Flow
- The client sends HTTP requests to the server.
- The server processes the requests through controllers.
- Controllers communicate with services to handle business logic.
- Services interact with the repository to perform database operations.
- Data is retrieved from or stored in the database.

## Functions Used

### Controller
- `RestaurantController`: Handles incoming HTTP requests and manages the flow of data.

### Services
- `RestaurantService`: Contains business logic for restaurant-related operations.

### Repository
- `RestaurantRepository`: Performs CRUD operations on the database.

## Database Design
- The database contains a table named `restaurant` with fields such as `id`, `name`, `address`, `phoneNumber`, `specialty`, and `totalStaffs`.

## Data Structure Used
- For data storage and retrieval, we use a relational database management system (RDBMS) like MySQL or PostgreSQL.

## Project Summary

This Restaurant Management System is built using Spring Boot and Java, with Maven for dependency management. It allows users to manage restaurant data, including adding, updating, retrieving, and deleting restaurant records.

- The application follows a structured data flow from the client to the server, through controllers, services, and the repository layer.
- Controllers handle HTTP requests, services contain business logic, and the repository performs database operations.
- The database design includes a table for restaurants, storing essential information like name, address, phone number, specialty, and total staff.
- Relational database management systems are used for efficient data storage and retrieval.


