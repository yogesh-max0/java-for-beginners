# Java for Beginners

A beginner-friendly Java learning repository covering the **fundamentals, core concepts, object-oriented programming, exception handling, collections, file handling, lambda expressions, and multithreading**.

This repository is designed for **freshers and beginners** who want to build a strong Java foundation before moving into **DSA, Spring Boot, backend development, or full-stack development**.

---

## Learning Order

Follow the topics in this order rather than studying them randomly.

### 1. Print Method in Java

Learn the basic Java program structure and how to display output.

Topics:

* `System.out.print()`
* `System.out.println()`
* Basic Java program structure

### 2. Variables

Learn how to store and use data.

Topics:

* Variables
* Data types
* `int`, `double`, `char`, `boolean`, `String`
* Type conversion
* Parsing

### 3. Operators

Learn how Java performs operations.

Topics:

* Arithmetic operators
* Assignment operators
* Relational operators
* Logical operators
* Increment and decrement
* Bitwise operators

### 4. If Else

Learn decision-making in Java.

Topics:

* `if`
* `if-else`
* `else-if`
* Nested conditions
* Comparison and logical conditions

### 5. Loops

Learn how to execute code repeatedly.

Topics:

* `for`
* `while`
* `do-while`
* Nested loops
* `break`
* `continue`

### 6. User Input

Learn how to take input from the user.

Topics:

* `Scanner`
* `nextInt()`
* `nextDouble()`
* `nextLine()`
* `next()`

### 7. Arrays

Learn how to store multiple values of the same type.

Topics:

* One-dimensional arrays
* Two-dimensional arrays
* Array traversal
* Searching
* Updating array elements

### 8. Methods (Functions)

Learn how to divide a program into reusable blocks.

Topics:

* Method declaration
* Parameters
* Arguments
* Return values
* Method overloading
* Recursion

### 9. Classes and Objects

Understand the basic foundation of Java OOP.

Topics:

* Class
* Object
* Fields
* Methods
* Creating objects
* Calling methods

### 10. Constructors

Learn how objects are initialized.

Topics:

* Default constructor
* Parameterized constructor
* Constructor overloading
* `this` keyword

### 11. Access Modifiers

Understand access control.

Topics:

* `public`
* `private`
* `protected`
* Default access

### 12. OOP

Learn the main Object-Oriented Programming concepts.

Topics:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Abstract classes
* Method overriding
* `this`
* `super`

### 13. Keywords

Understand commonly used Java keywords.

Examples:

* `static`
* `final`
* `this`
* `super`
* `new`
* `extends`
* `implements`

### 14. Exception Handling

Learn how to handle errors that occur during program execution.

Topics:

* `try`
* `catch`
* `finally`
* `throw`
* `throws`
* Checked exceptions
* Unchecked exceptions
* Common exceptions

Examples:

* `ArithmeticException`
* `ArrayIndexOutOfBoundsException`
* `NullPointerException`
* `NumberFormatException`
* `InputMismatchException`

### 15. File Handling

Learn how Java works with files.

Topics:

* Create files
* Read files
* Write files
* Append data
* `File`
* `FileWriter`
* `FileReader`
* `IOException`

### 16. Collections

Learn how to store and manage dynamic collections of data.

Start with:

* `ArrayList`
* `HashSet`
* `HashMap`

Then learn the basics of:

* `LinkedList`
* `Queue`
* `Deque`

### 17. Lambda Expressions

Learn how to write shorter implementations of functional interfaces.

Topics:

* Lambda syntax
* Parameters
* Functional interfaces
* `Runnable`
* Lambda with collections

Example:

```java
name -> System.out.println(name);
```

### 18. Threads and Multithreading

Learn the basics of executing multiple tasks concurrently.

Topics:

* `Thread`
* `Runnable`
* `run()`
* `start()`
* `synchronized`
* Race conditions
* Basic thread creation

### 19. Generics

Learn how to specify the type of data used by classes, collections, and methods.

Examples:

```java
ArrayList<String>
HashSet<Integer>
HashMap<Integer, String>
```

Generics provide better type safety and help prevent invalid data types from being added to collections.

---

# Recommended Study Method

Do not try to memorize Java syntax without understanding what each part does.

For every topic:

**1. Understand the concept**

First understand:

* What is it?
* Why is it used?
* Where is it used?

**2. Run a basic program**

Start with the smallest possible example.

**3. Change the program**

Change:

* Values
* Variables
* Conditions
* Method names
* Input
* Number of objects
* Collection elements

This helps you understand how the code actually works.

**4. Write the program again without looking**

After understanding the example, try to write it yourself.

**5. Create one small problem**

For example:

```text
Variables → store student details
Loops → print numbers from 1 to 100
Arrays → find the largest number
Methods → create an addition method
OOP → create a Student class
Collections → store and search names
Exception Handling → handle invalid input
```

---

# Important Tips and Tricks

### Learn the "why", not only the syntax

Instead of memorizing:

```java
ArrayList<String> names = new ArrayList<>();
```

understand:

```text
ArrayList → collection
<String>  → allowed data type
names     → reference variable
new       → creates the object
```

This makes the syntax easier to remember.

### Start with one program

Do not immediately build large projects.

For a new concept, first create:

```text
Class
   ↓
Object
   ↓
Method
   ↓
Output
```

Once that works, add more features.

### Make mistakes intentionally

Change the code and see what happens.

For example:

```java
int age = "22";
```

See the compiler error.

Then fix it:

```java
int age = 22;
```

Understanding errors is an important part of learning Java.

### Practice typing the code

Do not depend completely on copy-paste.

First understand the example, then type it yourself.

### Keep concepts separated

Learn the concepts one by one.

For example:

```text
Variables
   ↓
Operators
   ↓
Conditions
   ↓
Loops
   ↓
Arrays
   ↓
Methods
   ↓
OOP
```

This prevents confusion between different topics.

### Use small examples

A 10-line program that you completely understand is more useful than a 200-line program that you cannot explain.

---

# How to Execute Java Programs

## Method 1: Run the Java file directly

With modern Java versions, a single source file can be executed directly:

```powershell
java filename.java
```

Example:

```powershell
java variables.java
```

For a file inside a folder:

```powershell
java .\variables\variables.java
```

---

## Method 2: Compile and Run

Traditional Java execution uses two steps.

### Step 1: Compile

```powershell
javac filename.java
```

Example:

```powershell
javac variables.java
```

This creates a `.class` file.

### Step 2: Run

```powershell
java filename
```

Example:

```powershell
java variables
```

Notice that when using `java`, you normally do **not** include `.java`.

---

# Example Program

Create:

```text
hello.java
```

Code:

```java
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

Run directly:

```powershell
java hello.java
```

Or compile first:

```powershell
javac hello.java
java hello
```

Output:

```text
Hello Java
```

---

# Folder Structure

The repository is organized by topic:

```text
java-for-beginners/
│
├── print method in java/
├── variables/
├── operators/
├── if else/
├── loops/
├── user input/
├── arrays/
├── method(function)/
├── class and objects/
├── constructors/
├── access modifiers/
├── oops/
├── keywords/
├── exception handling/
├── file handling/
├── collections/
├── lambda/
└── threads/
```

Each folder contains examples related to that topic.

---

# From Java to DSA

After completing the Java fundamentals, you can start learning DSA.

A useful path is:

```text
Java Fundamentals
        ↓
OOP
        ↓
Collections + Generics
        ↓
DSA
        ↓
Problem Solving
```

Java Collections such as `ArrayList`, `HashSet`, and `HashMap` are especially useful when learning DSA.

---

# From Java to Spring Boot

After building a solid Java foundation, you can move toward backend development.

Recommended path:

```text
Java
   ↓
Collections
   ↓
Generics
   ↓
Lambda
   ↓
Stream API
   ↓
Maven
   ↓
HTTP + REST
   ↓
Spring
   ↓
Spring Boot
   ↓
Spring Data JPA
   ↓
Spring Security
   ↓
REST API Projects
```

You do not need to master every advanced Java topic before starting Spring Boot. Learn the core Java concepts first, then continue learning related concepts while building Spring Boot applications.

---

# Goal of This Repository

This repository is intended to help beginners:

* Build strong Java fundamentals
* Understand Java syntax and concepts
* Practice writing programs independently
* Understand OOP
* Prepare for DSA
* Prepare for backend development
* Build a foundation for Spring Boot

The focus is on **understanding concepts through simple programs and practice** rather than memorizing syntax.

---

## Start Learning

Start from the first folder and move through the topics in order.

**Understand → Run → Modify → Practice → Write without looking → Move to the next topic**

That approach will give you a stronger foundation than simply completing programs one after another.
