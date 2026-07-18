# 📦 Products API

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white">
  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge">
  <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white">
  <img src="https://img.shields.io/badge/H2_Database-003057?style=for-the-badge">
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white">
</p>

<p align="center">
  A RESTful API built with <strong>Java</strong> and <strong>Spring Boot</strong> for managing a product catalog.
</p>

---

## 🚀 About

This project was developed to practice backend development using Spring Boot.

The API follows REST principles and implements a complete CRUD for product management while applying concepts such as layered architecture, dependency injection, entity mapping, and data persistence with Spring Data JPA.

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

---

## ✨ Features

- ✅ Create products
- ✅ Retrieve all products
- ✅ Retrieve a product by ID
- ✅ Update existing products
- ✅ Delete products
- ✅ RESTful architecture
- ✅ Layered architecture (Controller, Service and Repository)

---

## 📁 Project Structure

```text
src
├── controller
├── model
├── repository
├── service
└── ProdutosApiApplication
```

---

## 📷 API Preview

<p align="center">
  <img src="https://github.com/user-attachments/assets/402fe6e5-bdf3-4f29-8695-819bf791b188" alt="Products API Preview" width="100%">
</p>

<p align="center">
  <em>Creating a new product using the REST API with Postman.</em>
</p>

---

## 📌 Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/produtos` | Retrieve all products |
| GET | `/produtos/{id}` | Retrieve a product by ID |
| POST | `/produtos` | Create a new product |
| PUT | `/produtos/{id}` | Update a product |
| DELETE | `/produtos/{id}` | Delete a product |

---

## ▶️ Running the Project

### Prerequisites

- Java 17 or higher
- Maven

### Clone the repository

```bash
git clone https://github.com/thurdass/produtosapi.git
```

### Enter the project folder

```bash
cd produtosapi
```

### Run the application

```bash
mvn spring-boot:run
```

The application will be available at:

```text
http://localhost:8080
```

---

## 📚 What I Learned

During the development of this project I practiced:

- Building REST APIs with Spring Boot
- CRUD operations
- Spring Data JPA
- Hibernate
- Dependency Injection
- Layered Architecture
- Entity Mapping
- HTTP Methods and Status Codes
- Maven

---

## 📄 License

This project was developed for educational purposes as part of my backend development studies.
