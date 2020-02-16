# design-patterns
23 java design patterns

### 1.Singleton
Singleton pattern is a very simple design pattern,but we have different approaches to implement.
+ **Lazy Singleton** the instance of Singleton Class is not created at the time of class loading.

+ **Eager Singleton**, the instance of Singleton Class is created at the time of class loading, this is the easiest method to create a singleton class but it has a drawback that instance is created even though client application might not be using it.

+ **Static Inner Class Singleton**, when the singleton class is loaded,SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.<font color="#006400">This is the most widely used approach for Singleton class as it doesn't require synchronization.</font>

### 2.Factory method
Factory method pattern is based on the simple factory pattern which not belongs to the **23 java design patterns**.
> **Simple Factory** is not a pattern in **java 23 design patterns**, but it's the base of factory method pattern.

### 3. Abstract factory
An upgraded version of **factory method pattern**. Factory method pattern only produces one level of products, while **abstract factory pattern** can produce multiple levels under one product family.

### 4. Proxy
+ **static proxy** is the simplest proxy pattern,but it's hard-coded,not convenient to extend.

+ **jdk dynamic proxy** need the proxied class implements an interface.

+ **cglib** based dynamic proxy need the 3rd party dependency libraries,it can generate the subclass bytecode of proxied class dynamically.This tech is widely used in many frameworks,such as Spring,Hibernate,etc.