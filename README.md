
# 📌 UC2: Last Name Validation

## 🎯 Goal

Validate the user's **Last Name** using Regular Expression (Regex).

The last name must:

- Start with a **Capital Letter**
- Have a **minimum of 3 characters**

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters the last name.
2. System validates the last name using Regex.
3. If the last name is valid, a success message is displayed.
4. Otherwise, an invalid message is displayed.

---

## 💡 Java Concepts Covered

- Regular Expressions (Regex)
- String `matches()` Method
- User Input using `Scanner`
- If-Else Statement

---

## 📋 Functional Requirements

- Read the last name from the user.
- Validate using Regex.
- First letter should be uppercase.
- Last name should contain at least 3 letters.
- Display whether the last name is valid or invalid.

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
Enter Last Name: Mypati

Valid Last Name
```

### Invalid Input

```text
Enter Last Name: my

Invalid Last Name
```

---

## 📈 Learning Outcome

After completing UC2, you will understand:

- How to validate the last name using Regex
- How to use the `matches()` method
- How to validate user input in Java
- How to apply basic validation rules using Regular Expressions

---

## 🌿 Git Branch

```text
feature/uc2-last-name-validation
```

---

## 💬 Commit Message

```text
feat(UC2): validate last name using regex
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
```

