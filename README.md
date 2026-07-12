# 🎓 Student Management System

A role-based backend **Student Management System** developed using **Spring Boot** and **Spring Security**. The project provides secure authentication and authorization for **Admin** and **Student** users and exposes RESTful APIs for managing academic data.

---

## 🚀 Features

### 👨‍💼 Admin
- ➕ Add, update, view, and delete students.
- 📚 Manage subjects for different semesters.
- 📝 Add, update, and view student marks.
- 👥 View students by department and semester.

### 👨‍🎓 Student
- 👤 View personal profile.
- 📱 Update phone number and password.
- 📊 View semester-wise results.

### 🔐 Security
- 🔑 Role-based authentication and authorization using **Spring Security**.
- 🔒 Password encryption using **BCrypt**.
- 👨‍💻 Automatic creation of a default Admin account using **CommandLineRunner**.

---

## 🛠️ Technologies Used
- **Language:** Java
- **Backend Framework:** Spring Boot
- **Security:** Spring Security
- **ORM:** Spring Data JPA, Hibernate
- **Database:** MySQL
- **Build Tool:** Maven
- **API Testing:** Swagger UI

---

## 🏗️ Project Architecture
The application follows a layered architecture to keep the code clean and maintainable.

- 🎮 **Controller** - Handles HTTP requests and responses.
- ⚙️ **Service** - Contains business logic.
- 🗃️ **Repository** - Performs database operations using Spring Data JPA
- 🐬 **Database** - Stores application data in MySQL.

---

## ⚙️ Run the Application

1. Clone the repository.
2. Configure the database in `application.properties`.
3. Run the application.
4. Test the APIs using **Swagger UI**.

🔗 Access in browser → http://localhost:8080/swagger-ui/index.html
