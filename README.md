# Patient Management System

Microservices-based Patient Management System build with Spring Boot using a distributed architecture.  The system is 
composed of multiple microservices that communicate with each other synchronously via gRPC and REST, and asynchronously 
via Kafka. The API Gateway serves as the single entry point for the client.

## Tech Stack 
*   **Backend Framework**: Spring Boot 3.4.5 (Java 21)
*   **Build Tool**: Maven
*   **Containerization**: Docker
*   **Inter-service Communication**:
    *   gRPC with Protocol Buffers
    *   RESTful APIs
*   **Asynchronous Communication**: Apache Kafka (via Spring Kafka)
*   **API Gateway**: Spring Cloud Gateway
*   **Database**: PostgreSQL (with Spring Data JPA)
*   **Authentication & Authorization**: Spring Security, JSON Web Tokens (JWT)
*   **Local Cloud Development**: LocalStack, AWS CDK

## Microservices

### 1. Analytics Service (`analytics-service`)

*  Responsible for handling and processing analytical data. It consumes events from the patient service via Kafka.

### 2. API Gateway (`api-gateway`)

*   The main entry point for all incoming client requests. It routes requests to the appropriate microservices.

### 3. Authentication Service (`auth-service`)

*   Manages user authentication, registration, and token generation (JWT). It interacts with a PostgreSQL database.

### 4. Billing Service (`billing-service`)

*   Handles all billing, communicates with patient-service via gRPC.

### 5. Patient Service (`patient-service`)

*   Manages patient information, including CRUD operations. It interacts with a PostgreSQL database, communicates via gRPC, and publishes events to Kafka.

### 6. Infrastructure (`infrastructure`)

*   Contains the AWS Cloud Development Kit (CDK) code to define and provision the necessary cloud infrastructure for the application. Includes a script for deploying to LocalStack for local development, can be modified for AWS.

### 7. Integration Tests (`integration-tests`)

*   Integration tests that verify the correct interaction and collaboration between the different microservices in the system.