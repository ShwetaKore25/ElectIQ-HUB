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

# ElectIQ-HUB
│
├── src/                           
│   └── main/                       
│       └── java/                   
│           └── com/                
│               └── electiqhub/     # Package for the main code
│                   ├── controller/   # REST controllers for API endpoints
│                   │   └── CandidateController.java
│                   ├── dao/          # Data Access Object (DAO) classes
│                   │   └── CandidateDAO.java
│                   ├── entity/       # Entity classes representing database tables
│                   │   └── Candidate.java
│                   ├── service/      # Service classes for business logic
│                   │   └── CandidateService.java
│                   └── ElectIQHubApplication.java  # Main Spring Boot application class
│
├── src/main/resources/                     
│   ├── application.properties           # Spring Boot application properties
│   ├── static/                          # Static files (HTML, CSS, JS)
│   ├── templates/                       # Templates (if using Thymeleaf or similar)
│
├── src/test/java/com/electiqhub/        # Test classes
│   └── ElectIQHubApplicationTests.java  # Integration test for the Spring Boot application
│
├── pom.xml                             # Maven build file with Spring Boot, Hibernate, and other dependencies
├── README.md                           # Project documentation
└── target/                             # Compiled project files
