# Spring Boot Environment Profiles API

A professional Spring Boot REST API demonstrating the implementation of multi-environment configurations (Development & Production) and clean architectural patterns.

## 🚀 Key Features
- **Profile-Specific Config:** Seamless switching between Dev and Prod profiles using `application.properties`.
- **Clean Architecture:** Separated Controller, Service, DTO, and Exception layers.
- **Global Exception Handling:** Centralized error management for professional API responses.
- **Generic API Wrapper:** Unified response format for all endpoints.

## 🛠️ Tech Stack
- Java 17
- Spring Boot 3.x
- Maven
- Lombok

## 📖 How to Run
1. Clone the repo: `git clone <repo-url>`
2. Run Dev Profile: `mvn spring-boot:run`
3. Run Prod Profile: `mvn spring-boot:run -Dspring-boot.run.profiles=prod`

## 🔗 Endpoint
- **URL:** `http://localhost:8080/api/status`
