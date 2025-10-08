# Java_P
# 🟡 Java Fundamentals Project — Point & Point3D

## 📘 Overview
This project is a simple Java application created to **learn and practice the fundamentals of Object-Oriented Programming (OOP)** in Java.  
It focuses on building two classes:
- `Point` (for 2D coordinates)
- `Point3D` (for 3D coordinates, which extends `Point`)

Through this project, I practiced **constructors, inheritance, static vs non-static methods, encapsulation, method overriding, and simple geometric logic**.

---

## 🧩 Features and Methods

### 🔹 Class: `Point`
Represents a point in 2D space `(x, y)`.

**Main methods:**
- `equals(Point p)` → checks if two points have the same coordinates.  
- `translate(double dx, double dy)` → moves the point by a given offset.  
- `milieu(Point p)` → returns the midpoint between two points.  
- `affiche()` → displays the coordinates of the point.  

**Constructors:**
- Default constructor → initializes to `(0,0)`
- Parameterized constructor → initializes with given `x` and `y`
- Copy constructor → creates a new point identical to another

---

### 🔹 Class: `Point3D`
Extends `Point` by adding a third coordinate `z`.

**Main methods:**
- `equals(Point3D p)` → checks if two 3D points are equal.  
- `translate(double dx, double dy, double dz)` → moves the point in 3D space.  
- `milieu(Point3D p)` → returns the midpoint between two 3D points.  
- `affiche()` → displays the 3D coordinates.  

**Constructors:**
- Default, parameterized, and copy constructors.

---

## ⚙️ Static vs Non-Static Access
The project demonstrates both:
- **Static method calls:** e.g. `Point.affiche(p1);`  
- **Instance method calls:** e.g. `p1.affiche();`  

This helps to understand how static and instance contexts differ in Java.

---

## 🚀 How to Run

1. **Compile:**
   ```bash
   javac Point.java Point3D.java Point.java
