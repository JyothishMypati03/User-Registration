# 📌 UC9: Validate Multiple Email Samples

## 🎯 Goal

Validate multiple email addresses using **Regular Expression (Regex)**.

The system should check each email sample individually and display whether it is **Valid** or **Invalid**.

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. System stores multiple email samples.
2. System validates each email using Regex.
3. Each email is checked one by one.
4. The validation result (Valid/Invalid) is displayed.
5. Program continues until all email samples are validated.

---

## 💡 Java Concepts Covered

- Regular Expressions (Regex)
- String `matches()` Method
- Arrays
- Enhanced `for` Loop
- If-Else Statement

---

## 📋 Functional Requirements

- Store multiple email samples in an array.
- Validate each email using Regex.
- Display whether each email is valid or invalid.
- Process all email samples without stopping.

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

```text
=====================================
    User Registration System
=====================================

jyothish@gmail.com      -> Valid
abc@yahoo.com           -> Valid
abc-100@yahoo.com       -> Valid
abc.100@yahoo.com       -> Valid
abc111@abc.com          -> Valid
abc+100@gmail.com       -> Valid

abc                     -> Invalid
abc@.com.my             -> Invalid
abc123@gmail.a          -> Invalid
abc123@.com             -> Invalid
abc123@.com.com         -> Invalid
```

---

## 📈 Learning Outcome

After completing UC9, you will understand:

- How to validate multiple email addresses
- How to reuse the same Regex for multiple inputs
- How to iterate through an array using a `for-each` loop
- How to display validation results for multiple records
- How to build reusable validation logic

---

## 🌿 Git Branch

```text
feature/uc9-email-validation-samples
```

---

## 💬 Commit Message

```text
feat(UC9): validate multiple email samples using regex
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
- ✅ UC9 Completed
- 🎉 **User Registration Problem Project Completed**