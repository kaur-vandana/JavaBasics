# Pass By Value
In the pass by value concept, the method is called by passing a value. It does not affect the original parameter.

# Pass By Reference
Java does not support pass by reference concept.

In the pass by reference concept, the method is called using an alias or reference of the actual parameter. It forwards 
the unique identifier of the object to the method. If we made changes to the parameter's instance member, it would 
affect the original value.

# What is a Java String? 
In Java, a string is an object that represents a sequence of characters or char values. The java.lang.String class is 
used to create a Java string object.

There are two ways to create a String object:

By string literal : Java String literal is created by using double quotes.
For Example: String s=“Welcome”;  

By new keyword : Java String is created by using a keyword “new”.
For example: String s=new String(“Welcome”);
It creates two objects (in String pool and in heap) and one reference variable where the variable ‘s’ will refer to the 
object in the heap.

# Java String Pool
Java String pool refers to collection of Strings which are stored in heap memory. In this, whenever a new object is
created, String pool first checks whether the object is already present in the pool or not. If it is present, then same
reference is returned to the variable else new object will be created in the String pool and the respective reference
will be returned.

# Immutable String in Java
In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable.
Once String object is created its data or state can't be changed but a new String object is created in the string
Constant pool.

### Why String objects are immutable in Java?
As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin".
If one reference variable changes the value of the object, it will be affected by all the reference variables.
That is why String objects are immutable in Java.

#### Following are some features of String which makes String objects immutable.

1. ClassLoader:
   A ClassLoader in Java uses a String object as an argument. Consider, if the String object is modifiable,
   the value might be changed and the class that is supposed to be loaded might be different.

2. Thread Safe:
   As the String object is immutable we don't have to take care of the synchronization that is required while sharing an
   object across multiple threads.

3. Security:
   As we have seen in class loading, immutable String objects avoid further errors by loading the correct class. This leads
   to making the application program more secure. Consider an example of banking software. The username and password cannot
   be modified by any intruder because String objects are immutable. This can make the application program more secure.

4. Heap Space: The immutability of String helps to minimize the usage in the heap memory. When we try to declare a new String object,
   the JVM checks whether the value already exists in the String pool or not. If it exists, the same value is assigned to
   the new object. This feature allows Java to use the heap space efficiently.
 