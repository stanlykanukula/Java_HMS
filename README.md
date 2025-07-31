# 🏥 Hospital Management System 

A Java console application that models hospital personnel and demonstrates foundational OOP concepts:  
**Encapsulation**, **Inheritance**, **Method Overriding**, **Upcasting**, and **Downcasting**.

---

## 🎯 Objective
Build a straightforward Hospital Management System in Java where different roles share common structure but expose role-specific behavior, illustrating how object-oriented design maps to real-world entities.

---

## ✅ Requirements

### 1. 🔒 Encapsulation  
- Base class `Person` with private fields:
  - `name` (String)  
  - `age` (int)  
  - `gender` (String)  
- Accessible through public getters and setters.

### 2. 🧬 Inheritance  
- Four subclasses extending `Person`:
  - `Doctor` → adds `specialization` (String)  
  - `Nurse` → adds `qualification` (String)  
  - `Patient` → adds `disease` (String)  
  - `Receptionist` → adds `shift` (String)  

### 3. 🔁 Method Overriding  
- Each subclass overrides a `details()` method to print its own information.

### 4. 🔼🔽 Upcasting & Downcasting  
- **Upcasting:** Treat `Doctor`, `Nurse`, `Patient`, and `Receptionist` as `Person` references to demonstrate polymorphism.  
- **Downcasting:** Safely revert to subclasses (with `instanceof` checks) to access their specific fields.

---

## 📁 Project Structure
```

├── src/
│ └── Hms/
│ ├── Person.java
│ ├── Doctor.java
│ ├── Nurse.java
│ ├── Patient.java
│ ├── Receptionist.java
│ ├── Main.java # entry point
│ └── module-info.java
├── .classpath
├── .project
├── .gitignore
└── README.md
```
---
## 💻 Sample Output 
```bash
name: Dr. Alekhya, age: 33, gender: Female
Doctor Specialization :Neuro
----------------------------------
name: Ravi, age: 60, gender: Male
Patient disease :Braintumor
----------------------------------
name: Mamatha, age: 32, gender: Female
Reciptionist Shift :night
----------------------------------
name: Ramu, age: 29, gender: Male
Nurse Qualification :nursing
----------------------------------
```
---
## 🛠️ Technologies Used
- Java (OOP Concepts)
- Eclipse IDE (or any preferred Java IDE)
---
