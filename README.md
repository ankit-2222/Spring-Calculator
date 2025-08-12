# 🧮 Spring Calculator - Web-Based Calculator 🚀

A simple and responsive calculator web application built using **Spring Boot**, **Thymeleaf**, and **Java**.
Follows the **MVC architecture** with a clean separation of concerns, and supports basic arithmetic operations.

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Java](https://img.shields.io/badge/Java-17+-blue)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-yellow)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-orange)
![Contributions Welcome](https://img.shields.io/badge/Contributions-Welcome-ff69b4)

---

## 📌 Overview

A **Spring Boot Calculator** web app that provides:

* ➕ Addition
* ➖ Subtraction
* ✖ Multiplication
* ➗ Division

---

## ✨ Features

* ✅ MVC Architecture (Controller, Service, View)
* ✅ User-friendly UI using **HTML + CSS**
* ✅ Backend powered by **Spring Boot**
* ✅ Template rendering with **Thymeleaf**
* ✅ Lightweight and fast

---

## 🧰 Tech Stack

| Tech            | Role                               |
| --------------- | ---------------------------------- |
| **Java**        | Core programming language          |
| **Spring Boot** | Backend framework                  |
| **Thymeleaf**   | Server-side templating engine      |
| **Maven**       | Dependency management & build tool |
| **HTML, CSS**   | Frontend styling and layout        |

---

## 📁 Folder Structure

```
calculator/
├── src/
│   ├── main/
│   │   ├── java/com/example/calculator/
│   │   │   ├── CalculatorApplication.java        # Main Spring Boot application
│   │   │   ├── controller/CalculatorController.java  # Request handling
│   │   │   ├── service/CalculatorService.java    # Business logic
│   │   ├── resources/
│   │   │   ├── templates/calculator.html         # Frontend UI
│   │   │   └── application.properties            # Config
│   └── test/java/com/example/calculator/         # Unit tests
├── pom.xml                                        # Maven dependencies
└── README.md
```


## ⚙️ Getting Started

1. **Clone the Repository**

```bash
git clone https://github.com/ankit-2222/Spring-Calculator.git
cd Spring-Calculator/calculator
```

2. **Build the Project**

```bash
mvn clean install
```

3. **Run the Application**

```bash
mvn spring-boot:run
```

or

```bash
java -jar target/calculator-0.0.1-SNAPSHOT.jar
```

4. **Access in Browser**

```
http://localhost:8080
```


## 🧪 Key Routes

| Method | Route        | Description               |
| ------ | ------------ | ------------------------- |
| GET    | `/`          | Home page with calculator |
| POST   | `/calculate` | Process calculation       |



## 🔮 Upcoming Improvements

* 🎨 Better responsive UI
* 🧮 Scientific calculator features
* 💾 Calculation history


## 🤝 Contributing

Found a bug or have a cool feature idea?

**Fork → Star → Code → PR**

Let’s make this calculator smarter! 💡


> Built with 💚 using Spring Boot, Java, and Thymeleaf
