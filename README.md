# 📌 UC4: Mobile Number Validation

## 🎯 Goal

Validate the user's **Mobile Number** using Regular Expression (Regex).

The mobile number must:

- Start with a **Country Code**
- Followed by a **single space**
- End with a **10-digit mobile number**

Example:

```text
91 9919819801
```

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters the mobile number.
2. System validates the mobile number using Regex.
3. If the mobile number is valid, a success message is displayed.
4. Otherwise, an invalid message is displayed.

---

## 💡 Java Concepts Covered

- Regular Expressions (Regex)
- String `matches()` Method
- User Input using `Scanner`
- If-Else Statement

---

## 📋 Functional Requirements

- Read the mobile number from the user.
- Validate the mobile number using Regex.
- Country code should come first.
- There must be one space after the country code.
- Mobile number should contain exactly 10 digits.
- Display whether the mobile number is valid or invalid.

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
Enter Mobile Number: 91 9919819801

Valid Mobile Number
```

### Invalid Input

```text
Enter Mobile Number: 919919819801

Invalid Mobile Number
```

---

## 📈 Learning Outcome

After completing UC4, you will understand:

- How to validate mobile numbers using Regex
- How to use the `matches()` method
- How to validate user input in Java
- How to enforce a predefined mobile number format
- How to create reusable validation methods

---

## 🌿 Git Branch

```text
feature/uc4-mobile-number-validation
```

---

## 💬 Commit Message

```text
feat(UC4): validate mobile number using regex
```

---

## 🚀 Project Status

- ✅ UC1 Completed
- ✅ UC2 Completed
- ✅ UC3 Completed
- ✅ UC4 Completed
```