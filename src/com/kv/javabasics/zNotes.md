#### Keywords
* Keywords are reserve words in Java
* https://en.wikipedia.org/wiki/List_of_Java_keywords

#### variables
* variables are a way to store information in our computer.
* computer stores these in RAM (ramdom access memory).

#### Expression
* An expression is formed by combining variables, literals, method return values and operators.
* int i = 15 + 12;

#### String Literal
* Any sequence of character surrounded by double quotes is a String Literal in Java.
* Its value cannot be changed, unlike a variable

#### Operators
* Operators in Java are special symbols that perform an operation on one, two or three operands, and then return a result.
* +, -, /, *
* Logical Operators : >,>=,==,!=,<,<=, &&, ||, !
* &&, ||- Logical AND, OR, which operates on boolean operands
* &,| - Bitwise operators, operates at bit level
* Ternary Operator  (? :)
* https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html 
* Precedence : http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html 

#### Primitive Types
1. boolean
2. byte
   * A BYTE occupies 8 bits. A bit is not directly represented in a primitive type.
3. char
   * A char occupies two byte of memory, or 16 bits and thus has a width of 16. The reason its not just a single byte is that it allows you to store Unicode characters
4. short
   * A short can store a large range of number  and occupies 16 bits, and width of 16.
5. int
   * An int, has a much larger range, occupies 32 bits and has a width of 32
6. long
7. float
8. double


#### BigDecimal
* Both float and double are not great to use where precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such
* Java has a class called BigDecimal that overcomes this.

#### Unicode 
* https://unicode-table.com/en/#latin-extended-a
* Unicode is an international encoding standard for use with different languages and scripts, by which each letter, digit,
   or symbol is assigned a unique numeric value that applies across different platforms and programs.

#### Wrapper classes
* Java uses the concept of a wrapper class for all eight primitive types
1. Boolean
2. Byte
3. Character
4. Short
5. Integer
6. Long
7. Float
8. Double

#### Overflow and Underflow in Java
* Overflow : If you try and put a value larger than the max value in Java.
* Underflow : a value smaller than the min value in Java.

#### String
* A String is a datatype in Java, which is not a primitive type.
* It's actually a Class, but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.
* A String is a sequence of characters.
* Strings in Java are immutable. That means you can't change a String after its created. Instead, a new String is created.
* Strings can be made mutable using String Buffer and String Builder

#### Comments
* Comments are ignored by the computer and are added to a program to help describe something.
* Comments are for humans.

#### Control Flow Statements
1. if-elseif-else
   * program executes a certain piece of code if a particular conditional logic evaluates to true/false.
2. Switch
3. for Loop
4. while
5. do-while

#### Class
* class is kind of user defined data type, and it is way more powerful than the primitive data types
* Class name starts with the Upper case letter
* method name starts with lower case letter

* class is the blueprint
* Object is also known as instance
* reference is the address, we can pass reference as parameters to constructor and methods
* reference holds the address of the object and not the object itself.

#### Method Overriding
* Method overriding means defining a method in a child class that already exists in the parent class with same signature
  (same name & same arguments)
* By extending the parent class the child class gets all the methods defined in the parent class (those methods are also
  known as derived methods )
* Runtime Polymorphism and Dynamic Method Dispatch because the method that is going to be called is decided at runtime 
  by the JVM
* when we override a method its recommended putting @Override immediately above the method definition.
  this annotation that the compiler reads and will then show us error if we don't follow overriding rules correctly.
* we can't override static methods
* only instance methods can be overridden
* ALWAYS in 2 class

###### Methods will be considered overridden if we follow these rules
- it must have same name and same arguments.
- must have same return type  --- or ---
- Return type can be a subclass of the return type in the parent class.
- Only Inherited methods can be overridden
- Constructor and private methods can not be overridden
- Methods that are final can not be overridden
- A subclass can use super.methodName() to call the superclass version of an overridden method.
- Must NOT throw a new or broader checked exception
- Must NOT have a lower access modifier but can have a higher modifier.
- if the parent method is protected then using private in the child is not allowed but using public in the child would
  be allowed

#### Method Overloading
* provides functionality to reuse a method name with different parameters.
* Usually in a single class but may also be used in a child class.
* Must have different parameters
* Must NOT have different return types
* May have different access modifiers (private, protected , public)
* may throw different exceptions

## Static
#### Static Methods
* Static methods are declared using a static modifier.
* static methods can't access instance methods and instance variables directly.
* They are usually used for operations that don't require any data from an instance of the class
* In static methods we can't use the 'this' keyword.
* whenever you see a method that does not use instance variables that method should be declared as a static method.
* For example main is a static method & it is called by the JVM when it starts an application.

#### Static Variables -- or -- static member variables
* Static Variables are declared using a static modifier.
* Every instance of that class shares the same static variable.
* If changes are made to that variable, all other instances will see the effect of the change.

#### Instance 
#### Instance Methods
* Instance Methods belong to an instance of a class.
* To use an 'instance method 'we have to instantiate the class first usually by using the 'new' keyword.
* Instance methods can access methods and instance variables directly.
* Instance method can also access static methods and static variables directly.

#### Instance Variables
* They don't use the static keyword.
* Instance variables are also known as fields or member variables.
* Instance variables belong to an instance of a class.
* Every instance has its own copy of an instance variable.
* Every instance can have a different value(state)
* Instance variables represent the state of an instance.

#### OOPS. Concepts
* Composition : "has-a relation".
  The composition relationship of two objects is possible when one object contains another object, and that object is 
  fully dependent on it. The contained object should not exist without the existence of its parent object. In a simple 
  way, we can say it is a technique through which we can describe the reference between two or more classes. And for 
  that, we use the instance variable, which should be created before it is used.
* Inheritance : "is-a relation"
  Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
* Encapsulation : is the mechanism that allows you to restrict access to certain components in the    objects that you are creating. So you are able to protect the members of a class from external access in order to really guard against unauthorized access.
* Polymorphism : Polymorphism in Java is a concept by which we can perform a single action in different ways. ... 
  So polymorphism means many forms. There are two types of polymorphism in Java: compile-time polymorphism and runtime 
  polymorphism. We can perform polymorphism in java by method overloading and method overriding.

#### Arrays
* An array is a data structure that allows you to store multiple values of the same type into a single variables.
* The default values of numeric array elements are set to zero.
* Arrays are zero indexed :  an array with n elements is indexed from 0 to n-1, for example 10 elements index range 0 to 9.
* If we try to access index that is out of range, java will give us an ArrayIndexOutOfBoundsException, which indicates 
  that the index is out of range in other words out of bounds.
* To access array elements we use the square braces [ and ], also known as array access operator
* int intArrays = {1, 2, 3, 4, 5};  here, int_Arrays points to the address pointing to the array in memory.
  so it holds the address or reference rather than the data itself

#### Interface
* If a class is implementing the interface , it should define all the methods declared in the interface.
* 

####
*

####
*

####
*

####
*

####
*

####
*

####
*

####
*

####
*

####
*

####
*

####
*


