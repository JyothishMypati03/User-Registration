# 📌 UC8: Password Validation - Rule 4

## 🎯 Goal

Validate the user's **Password** using Regular Expression (Regex).

**Rule 4:**

- Password must contain **exactly one special character**.

> **Note:** All previous password rules must also be satisfied.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters the password.
2. System validates the password using Regex.
3. System checks whether the password contains exactly one special character.
4. If all password rules are satisfied, a success message is displayed.
5. Otherwise, an invalid message is displayed.

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
- Password must contain:
    - Minimum **8 characters**
    - At least **one uppercase letter**
    - At least **one numeric digit**
    - **Exactly one special character**
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
Enter Password: Abcd@1234

Valid Password
```

### Invalid Input (No Special Character)

```text
Enter Password: Abcd1234

Invalid Password
```

### Invalid Input (More Than One Special Character)

```text
Enter Password: Abcd@@1234

Invalid Password
```

---

## 📈 Learning Outcome

After completing UC8, you will understand:

- How to validate passwords using Regex
- How to combine multiple validation rules
- How to check for exactly one special character
- How to use positive lookaheads in Regex
- How to create reusable validation methods in Java

---

## 🌿 Git Branch

```text
feature/uc8-password-rule4
```

---

## 💬 Commit Message

```text
feat(UC8): validate password with exactly one special character
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
- ✅ UC8 Completed
