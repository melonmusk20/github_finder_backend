# GitHub Finder Backend

Backend service for the GitHub Profile Finder application built using Java, Spring Boot, PostgreSQL, and REST APIs.

This backend fetches live GitHub user data using the GitHub Public API and stores recent searches in a PostgreSQL database.

---

# Live Deployment

## Backend API

:contentReference[oaicite:0]{index=0}

---

# Features

- REST API built with Spring Boot
- Fetch GitHub user profile data
- Store recent searches in PostgreSQL
- JPA & Hibernate integration
- CORS configuration for frontend communication
- Dockerized backend deployment
- Environment variable support
- Production deployment on Render

---

# Tech Stack

## Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate

## Database
- PostgreSQL (Supabase)

## Deployment
- Render
- Docker

---

# Project Structure

```bash
github_finder_backend/
│
├── src/main/java/com/github_finder/backend/
│   ├── Controller.java
│   ├── Model.java
│   ├── Repository.java
│   ├── BackendApplication.java
│   └── config/
│       └── CorsConfig.java
│
├── src/main/resources/
│   └── application.properties
│
├── Dockerfile
├── pom.xml
└── README.md
```

---

# API Endpoints

## Get GitHub Profile

```bash
GET /github/{username}
```

Example:

```bash
https://github-finder-backend-ldkq.onrender.com/github/octocat
```

---

## Get Recent Search History

```bash
GET /github/history
```

---

# API Used

GitHub Public API

```bash
https://api.github.com/users/{username}
```

---

# Environment Variables

Add these in `application.properties` or deployment environment:

```properties
spring.datasource.url=YOUR_DATABASE_URL
spring.datasource.username=YOUR_DATABASE_USERNAME
spring.datasource.password=YOUR_DATABASE_PASSWORD
```

---

# Local Setup

## Clone Repository

```bash
git clone https://github.com/melonmusk20/github_finder_backend.git
```

---

## Run Backend

Go inside backend folder:

```bash
cd github_finder_backend
```

Run application:

```bash
./mvnw spring-boot:run
```

Runs on:

```bash
http://localhost:8080
```

---

# Docker Setup

## Build Docker Image

```bash
docker build -t github-finder-backend .
```

## Run Docker Container

```bash
docker run -p 8080:8080 github-finder-backend
```

---

# Database

This project uses PostgreSQL hosted on Supabase.

Data stored:
- Recent GitHub searches

---

# CORS Configuration

CORS is configured using:

```bash
CorsConfig.java
```

to allow frontend communication from deployed frontend applications.

---

# Future Improvements

- Authentication
- JWT Security
- Repository listing endpoint
- Search analytics
- Rate limiting
- Caching

---

# Author

Purbasa Maharana

GitHub:
https://github.com/melonmusk20
