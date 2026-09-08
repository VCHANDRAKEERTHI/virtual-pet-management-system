# virtual-pet-management-system
A Core Java console application for managing and caring for virtual pets using OOP, collections, interfaces, and exception handling.
# 🐾 Virtual Pet Management System
A Java-based console application that simulates caring for a virtual pet. 
The application allows users to create a pet and perform different activities 
such as feeding, playing, sleeping, and giving medicine while monitoring the 
pet's current condition.

## Project Overview

The Virtual Pet Management System is developed using Core Java and Object-Oriented Programming concepts.

The user can:
- Select a pet type
- Give the pet a nickname
- Feed the pet
- Play with the pet
- Make the pet sleep
- Give medicine
- View the pet's current status
- Exit the application

The pet's condition is represented using four parameters:

- Hunger
- Happiness
- Energy
- Health

All status values are maintained between 0% and 100%.

## 🎯 Objectives

- To build a simple real-world application using Java.
- To understand and implement Object-Oriented Programming concepts.
- To practice inheritance, polymorphism, abstraction, and encapsulation.
- To use Java interfaces and the Collection Framework.
- To implement exception handling and custom exceptions.
- To understand how different classes interact in a Java application.

## 🛠️ Technologies Used

- Java
- Core Java
- Object-Oriented Programming
- Collections Framework
- Exception Handling
- Eclipse IDE

## 🧠 Java Concepts Used

### Object-Oriented Programming

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

### Other Java Concepts

- Interfaces
- ArrayList / Collections
- Set
- Exception Handling
- Custom Exceptions
- Switch Statement
- Loops
- Conditional Statements

## 🐶 Pet Types

The application supports the following pet types:

1. Dog
2. Cat
3. Hamster
4. Rabbit

## 🎮 Available Operations

| Option | Operation | Description |
|---|---|---|
| 1 | Feed | Reduces hunger and improves other conditions |
| 2 | Play | Increases happiness but consumes energy |
| 3 | Sleep | Restores energy |
| 4 | Give Medicine | Improves health |
| 5 | Show Status | Displays the current pet condition |
| 6 | Exit | Closes the application |

## 📊 Pet Status

Each pet has the following status values:

| Status | Initial Value |
|---|---:|
| Hunger | 50% |
| Happiness | 50% |
| Energy | 50% |
| Health | 100% |

## ⚙️ Business Rules

- All pet status values remain between 0% and 100%.
- If health reaches 0%, only medicine can be given.
- If energy reaches 0%, the pet cannot play.
- If hunger reaches 0%, the pet must be fed before playing.
- Playing increases happiness.
- Giving medicine improves health.

## 📂 Project Structure

```text
src
│
├── entity
│   ├── PetActions.java
│   ├── Pet.java
│   ├── Dog.java
│   ├── Cat.java
│   ├── Hamster.java
│   └── Rabbit.java
│
├── service
│   ├── PetService.java
│   └── PetServiceImpl.java
│
├── exception
│   ├── PetNotFoundException.java
│   ├── DuplicatePetException.java
│   └── InvalidPetException.java
│
└── main
    └── PetApplication.java
