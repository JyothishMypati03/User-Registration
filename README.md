#  UC1: First Name Validation

##  Goal

Validate the user's **First Name** using Regular Expression (Regex).

The first name must:

- Start with a **Capital Letter**
- Have a **minimum of 3 characters**

---

##  Flow

1. User enters the first name.
2. System validates the first name using Regex.
3. If the first name is valid, a success message is displayed.
4. Otherwise, an invalid message is displayed.

---

##  Package Structure

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

## Sample Output

### Valid Input

```text
Enter First Name: Jyothish

Valid First Name
```

### Invalid Input

```text
Enter First Name: jy

Invalid First Name
```

---

##  Learning Outcome

After completing UC1, you will understand:

- What is Regex
- How to validate user input
- How to use `matches()` in Java
- How to read user input using `Scanner`
- How to apply simple validation rules

---

##  Git Branch

```text
feature/uc1-first-name-validation
```

---

## Commit Message

```text
feat(UC1): validate first name using regex
```

---

##  Project Status

- ✅ UC1 Completed
