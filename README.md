# ElectIQ-HUB

# Description
ElectIQ-HUB is a Spring Boot-based application designed to handle various functionalities with a focus on core Java, REST API development, and entity management. The project follows a clean and modular architecture with clear separation of concerns into layers: entity, dao, service, and controller. It implements CRUD operations for the Candidate entity.

# Features
Layered Architecture: Separates the application into distinct layers: entity, dao, service, and controller.

RESTful API: Provides endpoints to manage the Candidate entity.

Spring Boot Integration: Leverages Spring Boot for application management, dependency injection, and auto-configuration.

MySQL Database: Uses MySQL for persistent storage (can be swapped with other relational databases).

Hibernate ORM: Handles object-relational mapping (ORM) for entities.

# Technologies Used
Java 8+

Spring Boot: For building and managing the application.

Hibernate ORM: For managing entity persistence.

MySQL: As the database (can be swapped with another relational database).

Maven: For project dependency management.

# Key Packages and Classes
1) controller/: Contains REST API controllers to handle incoming HTTP requests.

 - CandidateController.java: REST controller for performing CRUD operations on the Candidate entity via API endpoints.

2) dao/: Data Access Object (DAO) classes responsible for database interaction.

 - CandidateDAO.java: Manages database operations (CRUD) for the Candidate entity.

3) entity/: Entity classes representing database tables.

 - Candidate.java: Represents the Candidate entity, with fields such as id, name, party, constituency, etc.

4) service/: Service classes that implement business logic for interacting with entities.

 - CandidateService.java: Contains logic for managing Candidate entities, including validation, processing, and interaction with the DAO.

5) exception/: Custom exceptions for handling specific application errors.

 - CustomException.java: Handles errors related to entity validation or other business logic issues.

6) config/: Configuration classes for setting up Spring Boot and Hibernate.

 - AppConfig.java: Contains Spring Boot configuration settings like Hibernate configurations, entity scanning, etc.

  
