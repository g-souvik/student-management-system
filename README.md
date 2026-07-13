# 🎓 Student Management System

A role-based backend **Student Management System** developed using **Spring Boot** and **Spring Security**. The project provides secure authentication and authorization for **Admin** and **Student** users and exposes RESTful APIs for managing academic data.

---

## 🚀 Features

### 👨‍💼 Admin
- ➕ Create, update, view and delete student records.
- 📚 Manage semester-wise subjects.
- 📝 Add, update and view student marks.
- 👥 View students by department and semester.

### 👨‍🎓 Student
- 👤 View personal profile.
- 📱 Update phone number and password.
- 📊 View semester-wise results.

### 🔐 Security
- 🔑 Authentication and role-based authorization using **Spring Security**.
- 🔒 Secure password encryption with **BCrypt**.
- 👨‍💻 Automatic creation of a default Admin account using **CommandLineRunner**.

---

## 🛠️ Technologies Used
- **Language:** Java
- **Framework:** Spring Boot
- **Security:** Spring Security, BCrypt
- **Persistence:** Spring Data JPA, Hibernate
- **Database:** MySQL
- **Build Tool:** Maven
- **API Testing:** Swagger UI

---

## 🏗️ Project Architecture
The application follows a **layered architecture** for better code organization and maintainability.

- 🎮 **Controller** - Handles HTTP requests and responses.
- ⚙️ **Service** - Contains business logic.
- 🗃️ **Repository** - Performs database operations using Spring Data JPA
- 🐬 **Database** - Stores application data in MySQL.

---

## ⚙️ Run the Application

1. Clone the repository.
2. Configure the database in `application.properties`.
3. Run the Spring Boot application.
4. Open **Swagger UI** to test the APIs.

**🔗 Swagger UI:** `http://localhost:8080/swagger-ui/index.html`
