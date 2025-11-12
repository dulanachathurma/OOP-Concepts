🚗 Vehicle Management System (Java OOP Project)
📘 Overview
This Vehicle Management System is a Java-based object-oriented programming (OOP) project designed to manage different types of vehicles and simulate leasing payments using various payment methods.
It demonstrates the use of:
Abstract classes
Interfaces
Polymorphism
Packages
Composition and Encapsulation
🧩 Features
✅ Supports multiple vehicle types:
🚘 Car
🚛 Truck
🏍️ Motorcycle
✅ Supports multiple payment methods:
💳 Credit Card
🏦 Bank Transfer
💻 PayPal
✅ Simulates lease contracts and checkout payments.
🧠 Concepts Used
Concept	Description
Abstract Class	Used for defining shared properties and behaviours of all vehicles (Vehicle class).
Interface	Used for defining payment behaviour (PaymentMethod).
Inheritance	Car, Truck, and Motorcycle inherit from Vehicle.
Polymorphism	Different vehicle and payment types are processed through common interfaces.
Encapsulation	Data fields are kept private/protected and accessed via constructors/methods.
Packages	Organized code into vehicles and payments packages for modularity.
🗂️ Project Structure
src/
 └── Task03/
      ├── Vehicle/
      │    ├── Vehicle.java
      │    ├── Car.java
      │    ├── Truck.java
      │    └── Motorcycle.java
      │
      ├── payments/
      │    ├── PaymentMethod.java
      │    ├── CreditCard.java
      │    ├── PayPal.java
      │    └── BankTransfer.java
      │
      ├── Checkout.java
      ├── LeaseContract.java
      └── Main.java
⚙️ How to Run
Open this project in IntelliJ IDEA or NetBeans.
Make sure your folder structure matches the src/Task03/... format.
Compile and run the file:
Main.java
The program will display different outputs based on vehicle and payment method types.
💻 Example Output
=== Processing Lease Contract ===
Car Details:
Make: Toyota, Model: Corolla, Year: 2022
Doors: 4
Fuel Efficiency: 15.0 km/l
Processing payment...
Paid $250000.0 using Credit Card (****3456)
Lease processed successfully!

=== Processing Lease Contract ===
Truck Details:
Make: Volvo, Model: FH16, Year: 2020
Load Capacity: 18.5 tons
Fuel Efficiency: 8.0 km/l
Processing payment...
Paid $800000.0 via PayPal account: user@example.com
Lease processed successfully!

=== Processing Lease Contract ===
Motorcycle Details:
Make: Honda, Model: CBR500R, Year: 2023
Has Sidecar: No
Fuel Efficiency: 35.0 km/l
Processing payment...
Paid $120000.0 via Bank Transfer to account: SL-0011223344
Lease processed successfully!
🧑‍💻 Technologies Used
Java (JDK 8+)
OOP Principles
Packages & Interfaces
✨ Author
👨‍🎓 Dulana Chathurma
BSc (Hons) in Software Engineering
University of Kelaniya, Sri Lanka 🇱🇰
📅 Year: 2025

# 🚗 Vehicle Management System
[![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)](...)
[![OOP](https://img.shields.io/badge/OOP-Principles-blue?style=for-the-badge)](...)

