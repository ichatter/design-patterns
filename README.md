# design-patterns
23 java design patterns

### 1.Factory method
Factory method pattern is based on the simple factory pattern which not belongs to the **23 java design patterns**.
> **Simple Factory** is not a pattern in **java 23 design patterns**, but it's the base of factory method pattern.

### 2. Abstract factory
An upgraded version of **factory method pattern**. Factory method pattern only produces one level of products, while **abstract factory pattern** can produce multiple levels under one product family.

### 3. Proxy
+ **static proxy** is the simplest proxy pattern,but it's hard-coded,not convenient to extend.

+ **jdk dynamic proxy** need the proxied class implements an interface.

+ **cglib** based dynamic proxy need the 3rd party dependency libraries,it can generate the subclass bytecode of proxied class dynamically.This tech is widely used in many frameworks,such as Spring,Hibernate,etc.