# 🛁 Pet Wash Machine Simulator

A simple Java console application that simulates a pet washing machine. This interactive system allows users to perform operations like placing a pet inside the machine, adding water and shampoo, giving the pet a shower, and checking machine status.

This project was developed as part of the **Santander Backend Java Bootcamp**, specifically during the **"Java and the Art of Abstraction with Classes and Encapsulation"** module.

## 🎯 Objective

Apply the principles of **abstraction** and **encapsulation** in Java through the construction of an object-oriented simulation project.

## 📌 Key Features

- Add and remove a pet from the machine
- Check if a pet is currently in the machine
- Refill shampoo and water
- Verify current levels of shampoo and water
- Clean the machine
- Bathe the pet if all conditions are met

## 🧰 Technologies

- Java 21+
- Object-Oriented Programming (OOP)
- Encapsulation and Abstraction
- Scanner API for user input
- CLI (Command Line Interface)

## 📂 Project Structure
pet-wash-machine-java/
├── src/
│ ├── Main.java # Application entry point with user menu
│ ├── Pet.java # Class representing the Pet entity
│ └── PetMachine.java # Class representing the machine's logic


## 🚀 How to Use

### 1. Clone the repository
```bash
git clone https://github.com/juliocsantos2504/pet-wash-machine-java.git
cd pet-wash-machine-java/src

### 2. Compile the Java files
javac *.java

### 3. Run the program
java Main

### 4. Available Menu Options
1 - Give pet a shower
2 - Add water
3 - Add shampoo
4 - Check water level
5 - Check shampoo level
6 - Check if a pet is inside
7 - Put a pet in the machine
8 - Remove pet from machine
9 - Clean the machine
0 - Exit
