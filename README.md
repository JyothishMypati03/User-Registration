#  User Registration Problem

##  Project Overview

The **User Registration Problem** is a console-based Java application developed using **Core Java** and **Maven**. The project validates user registration details using **Regular Expressions (Regex)** by applying a series of validation rules.

The application is implemented incrementally through multiple use cases (UCs). Each use case introduces a new validation rule and helps understand Java programming concepts such as Regular Expressions, Exception Handling, Functional Interfaces, Lambda Expressions, and Unit Testing.

---

##  Project Objectives

The application validates the following user registration fields:

- First Name
- Last Name
- Email Address
- Mobile Number
- Password

Each validation follows predefined business rules to ensure that only valid user information is accepted.

---

##  Use Cases

| Use Case | Description |
|----------|-------------|
| UC1 | Validate First Name |
| UC2 | Validate Last Name |
| UC3 | Validate Email Address |
| UC4 | Validate Mobile Number |
| UC5 | Validate Password Rule 1 |
| UC6 | Validate Password Rule 2 |
| UC7 | Validate Password Rule 3 |
| UC8 | Validate Password Rule 4 |
| UC9 | Validate Multiple Email Samples |

---

## Technologies Used

- Java
- Maven
- Regular Expressions (Regex)
- IntelliJ IDEA
- Git & GitHub

---

## 📂 Maven Project Structure

```text
UserRegistrationProblem
│
├── pom.xml
├── README.md
├── .gitignore
│
├── src
│   ├── main
│   │   ├── java
│   │   │
│   │   └── com
│   │       └── bridgelabz
│   │           └── userregistration
│   │               ├── app
│   │               │   └── UserRegistrationApplication.java
│   │               │
│   │               ├── service
│   │               │   └── UserRegistrationValidator.java
│   │               │
│   │               ├── util
│   │               │   └── RegexPattern.java
│   │               │
│   │               └── exception
│   │                   └── UserRegistrationException.java
│   │
│   └── resources
│
└── test
    └── java
```

---

## 🏗 Package Structure

```text
com.bridgelabz.userRegistration
│
├── app
│   └── UserRegistrationApplication.java
│
├── service
│   └── UserRegistrationValidator.java
│
├── util
│   └── RegexPattern.java
│
└── exception
    └── UserRegistrationException.java
```

---

##  Git Branch Strategy

```text
main
│
└── dev
     │
     ├── feature/uc1-first-name-validation
     ├── feature/uc2-last-name-validation
     ├── feature/uc3-email-validation
     ├── feature/uc4-mobile-number-validation
     ├── feature/uc5-password-rule1
     ├── feature/uc6-password-rule2
     ├── feature/uc7-password-rule3
     ├── feature/uc8-password-rule4
     └── feature/uc9-email-validation-samples
```

---

##  Development Workflow

1. Initialize the Maven project on the **main** branch.
2. Create the **dev** branch from **main**.
3. Create a separate **feature** branch for every use case.
4. Develop and test each feature independently.
5. Merge completed feature branches into **dev**.
6. After completing all use cases, merge **dev** into **main**.

---

##  Java Concepts Covered

- Regular Expressions (Regex)
- Pattern & Matcher
- Lambda Expressions
- Functional Interfaces
- Exception Handling
- Custom Exceptions
- Unit Testing (JUnit)
- Maven Project Structure
- Git Branching Strategy

---

## 💬 Initial Commit Message

```text
initialize User Registration Maven project setup
```

---

## 🚀 Project Status

```text
✅ Project Setup Completed
⏳ UC1 - First Name Validation
⏳ UC2 - Last Name Validation
⏳ UC3 - Email Validation
⏳ UC4 - Mobile Number Validation
⏳ UC5 - Password Rule 1
⏳ UC6 - Password Rule 2
⏳ UC7 - Password Rule 3
⏳ UC8 - Password Rule 4
⏳ UC9 - Email Validation Samples
```