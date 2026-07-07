# 📌 UC3: Email Validation

## 🎯 Goal

Validate the user's **Email Address** using Regular Expression (Regex).

The email must:

- Contain a valid username
- Contain the **@** symbol
- Contain a valid domain name
- Contain a valid domain extension (such as `.com`, `.in`, `.org`)

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters an email address.
2. System validates the email using Regex.
3. If the email is valid, a success message is displayed.
4. Otherwise, an invalid message is displayed.

---

## 💡 Java Concepts Covered

- Regular Expressions (Regex)
- String `matches()` Method
- User Input using `Scanner`
- If-Else Statement

---

## 📋 Functional Requirements

- Read the email address from the user.
- Validate the email using Regex.
- Email should contain:
    - Username
    - `@` symbol
    - Domain name
    - Domain extension
- Display whether the email is valid or invalid.

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
│   │   └── java
│   │       └── com
│   │           └── bridgelabz
│   │               └── userregistration
│   │                   ├── app
│   │                   │   └── UserRegistrationApplication.java
│   │                   │
│   │                   └── service
│   │                       └── UserRegistrationValidator.java
│   │
│   └── resources
│
└── test
```

---

## 🏗 Package Structure

```text
com.bridgelabz.userregistration
│
├── app
│   └── UserRegistrationApplication.java
│
└── service
    └── UserRegistrationValidator.java
```

---

## ▶️ Sample Output

### Valid Input

```text
Enter Email: jyothish@gmail.com

Valid Email
```

### Invalid Input

```text
Enter Email: jyothish@gmail

Invalid Email
```

---

## 📈 Learning Outcome

After completing UC3, you will understand:

- What is Email Validation
- How to validate emails using Regex
- How to use the `matches()` method
- How to validate user input in Java
- How to create reusable validation methods

---

## 🌿 Git Branch

```text
feature/uc3-email-validation
```

---

## 💬 Commit Message

```text
feat(UC3): validate email using regex
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed