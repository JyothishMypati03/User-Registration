# 📌 UC5: Password Validation - Rule 1

## 🎯 Goal

Validate the user's **Password** using Regular Expression (Regex).

**Rule 1:**

- Password must contain **at least 8 characters**.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters the password.
2. System validates the password using Regex.
3. If the password contains at least 8 characters, a success message is displayed.
4. Otherwise, an invalid message is displayed.

---

## 💡 Java Concepts Covered

- Regular Expressions (Regex)
- String `matches()` Method
- User Input using `Scanner`
- If-Else Statement

---

## 📋 Functional Requirements

- Read the password from the user.
- Validate the password using Regex.
- Password must contain **at least 8 characters**.
- Display whether the password is valid or invalid.

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
Enter Password: abc12345

Valid Password
```

### Invalid Input

```text
Enter Password: abc12

Invalid Password
```

---

## 📈 Learning Outcome

After completing UC5, you will understand:

- How to validate passwords using Regex
- How to enforce a minimum password length
- How to use the `matches()` method
- How to validate user input in Java
- How to build reusable validation methods

---

## 🌿 Git Branch

```text
feature/uc5-password-rule1
```

---

## 💬 Commit Message

```text
feat(UC5): validate password with minimum 8 characters
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
- ✅ UC4 Completed
- ✅ UC5 Completed
