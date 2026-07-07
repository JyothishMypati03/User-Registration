# 📌 UC7: Password Validation - Rule 3

## 🎯 Goal

Validate the user's **Password** using Regular Expression (Regex).

**Rule 3:**

- Password must contain **at least one numeric digit (0-9)**.

> **Note:** All previous password rules must also be satisfied.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters the password.
2. System validates the password using Regex.
3. If the password contains at least one numeric digit, a success message is displayed.
4. Otherwise, an invalid message is displayed.

---

## 💡 Java Concepts Covered

- Regular Expressions (Regex)
- Positive Lookahead
- String `matches()` Method
- User Input using `Scanner`
- If-Else Statement

---

## 📋 Functional Requirements

- Read the password from the user.
- Validate the password using Regex.
- Password must contain **at least one numeric digit (0-9)**.
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
Enter Password: Abcdef12

Valid Password
```

### Invalid Input

```text
Enter Password: Abcdefgh

Invalid Password
```

---

## 📈 Learning Outcome

After completing UC7, you will understand:

- How to validate passwords using Regex
- How to use a **positive lookahead** in Regex
- How to check whether a password contains at least one numeric digit
- How to use the `matches()` method
- How to build reusable validation methods

---

## 🌿 Git Branch

```text
feature/uc7-password-rule3
```

---

## 💬 Commit Message

```text
feat(UC7): validate password with at least one numeric digit
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
- ✅ UC4 Completed
- ✅ UC5 Completed
- ✅ UC6 Completed
- ✅ UC7 Completed
