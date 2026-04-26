# 🎓 Student Grade Calculator (Java)

A professional console-based application built to automate academic grading. This project was developed as part of a weekly university challenge focused on mastering Java fundamentals, control flow, and clean code principles without the use of AI-generated snippets.

---

## 🎯 Project Objective
The goal of this project was to transition from basic "Hello World" concepts to functional logic. By manually implementing the grading algorithm, I focused on:
- **Input Stream Management:** Utilizing `java.util.Scanner` for interactive data entry.
- **Conditional Logic:** Building robust `if-else` branches to handle multiple grade thresholds.
- **Data Precision:** Using the `double` data type to ensure accurate calculations for non-integer marks.

---

## 🚀 Features
- **Dynamic User Greeting:** Captures the student's name for a personalized output.
- **Immediate Feedback:** Instant conversion of numerical scores to letter grades.
- **Boundary Handling:** Uses inclusive operators (`>=`) to ensure students at the exact cutoff (e.g., 90.0) are graded fairly.

---

## 🛠️ Tech Stack & Concepts
- **Language:** Java
- **Library:** `java.util.Scanner`
- **Logic:** Conditional Branching (if-else if-else)
- **Paradigm:** Procedural logic moving toward Object-Oriented structures.

---

## 📋 Grading Logic Table

| Mark Range | Grade |
| :--- | :--- |
| **90.0 and above** | **A** |
| **80.0 - 89.9** | **B** |
| **70.0 - 79.9** | **C** |
| **60.0 - 69.9** | **D** |
| **Below 60.0** | **F** |

---

## 💻 Code Structure
The program follows a clean, four-step lifecycle:
1. **Initialize:** Setting up the input listener.
2. **Capture:** Collecting the `userName` and the `mark`.
3. **Evaluate:** Processing the mark through the logic engine.
4. **Result:** Displaying a personalized grade report.

---

## 📈 Future Roadmap (OOP Evolution)
This is the **v1.0 (Basic Logic)** version. Upcoming iterations for this semester will include:
- [ ] **Encapsulation:** Moving data into a dedicated `Student` class.
- [ ] **Inheritance:** Creating specialized student types (e.g., Regular vs. Honors).
- [ ] **Polymorphism:** Overriding grading methods for different course requirements.

---

## 👤 Author
**Dagim Yosef** *Aspiring Software Engineer* "Building deep understanding, one line at a time."
