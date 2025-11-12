# 🚗 Vehicle Management System (Java OOP Project)

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![OOP](https://img.shields.io/badge/Object%20Oriented%20Programming-blue?style=for-the-badge)
![University](https://img.shields.io/badge/University%20of%20Kelaniya-Sri%20Lanka-9cf?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 📘 Overview
This **Vehicle Management System** is a Java-based OOP project designed to manage different types of vehicles and simulate lease payments using multiple payment methods.

It demonstrates:
- **Abstract classes**
- **Interfaces**
- **Inheritance and Polymorphism**
- **Encapsulation**
- **Package organization**

---

## 🧩 Features

✅ Manage multiple vehicle types:
- 🚘 **Car**
- 🚛 **Truck**
- 🏍️ **Motorcycle**

✅ Support multiple payment methods:
- 💳 **Credit Card**
- 💻 **PayPal**
- 🏦 **Bank Transfer**

✅ Simulate **lease contracts** and **checkout payments**.

---

## 🗂️ Code Structure
src/
└── Task03/
├── Vehicle/
│ ├── Vehicle.java // Abstract base class
│ ├── Car.java // Subclass: Car
│ ├── Truck.java // Subclass: Truck
│ └── Motorcycle.java // Subclass: Motorcycle
│
├── payments/
│ ├── PaymentMethod.java // Interface
│ ├── CreditCard.java // Implementation
│ ├── PayPal.java // Implementation
│ └── BankTransfer.java // Implementation
│
├── Checkout.java // Handles payments
├── LeaseContract.java // Combines Vehicle + PaymentMethod
└── Main.java // Entry point

---

## ⚙️ How to Run

1. Open the project in **IntelliJ IDEA**, **Eclipse**, or **NetBeans**.  
2. Make sure your folder structure matches the one shown above.  
3. Run the file `Main.java`.  
4. The console will display different outputs depending on the vehicle type and payment method.

---

## 💻 Example Output

---

## 🧠 Concepts Used

| Concept | Description |
|----------|-------------|
| **Abstract Class** | Defines common vehicle structure (`Vehicle` class). |
| **Interface** | Defines payment contract (`PaymentMethod`). |
| **Inheritance** | `Car`, `Truck`, and `Motorcycle` extend `Vehicle`. |
| **Polymorphism** | Different `PaymentMethod` implementations behave differently. |
| **Encapsulation** | Fields kept private/protected with proper access. |
| **Composition** | `LeaseContract` combines a `Vehicle` and a `PaymentMethod`. |

---

## 🧑‍💻 Author

**👨‍🎓 Dulana Chathurma**  
BSc (Hons) in Software Engineering  
University of Kelaniya, Sri Lanka 🇱🇰  
📅 Year: 2025  

[![GitHub](https://img.shields.io/badge/GitHub-Dulana--Chathurma-black?style=for-the-badge&logo=github)](https://github.com/)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin)](https://www.linkedin.com)

---

## 🏷️ Tags
`#Java` `#OOP` `#UniversityProject` `#VehicleManagementSystem` `#Inheritance` `#Polymorphism` `#Interface`

---

⭐ **If you like this project, don’t forget to give it a star on GitHub!**
