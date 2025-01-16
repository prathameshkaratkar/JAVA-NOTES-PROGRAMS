## • What is an Object ?
```
1. Objects consist of two things
    (1) Attributes / Properties.
    (2) Actions / Behaviours.
2. Attributes are used to define the object where
    as actions specify how that object is used.
3. Programmatically an object is a block of memory
    which gets created at a runtime in the heap area and represents 
    a real world object (entity) is called object in java.
4. The attributes of an object is represented by non static variables.
5. The behaviours or actions of an object are represented by non static methods.
```



## • Class :
```
1. Class is a user defined non primitive data type which represents 
    a blue print of an object.
2. In real world before creating an object. a design or a blue print is created. 
    It provides all specification of the object.
3. Eg.. Before building a house a blue print of a hosue is created.
    Before manufacturing a bike a blue print of a bike is created.
4. Same way in java before creating an object a blue print must be created. which
    gives all the specification of the object. This design cna be done with 
    the help of class.
5. With the help of class we can create objects because a class contains all the specification of an object.


• To create an object : 
    We can create an object with the help of a keyword called new (operator) and a constructor of the class.

    • New: It is keyword and operator which creates a block of memory in the heap area at the runtime.
        New operator gives the reference of the object created in  the heap area.
        
    • Constructor : It is a special member of a class whose name is same as class name.
        A constructor loads all non static members of the class into object
         
```
### • Non-Static :
```
1. The member which are not prefixed with static modifier
    are called non static members.
2. They are loaded inside object of a class.
3. They are,
    (1) Non static variables.
    (2) Non static Methods.
    (3) Non static Initializers.
```
### • Non-Primitive Data Types :
```
1. class Pen, class Book, Class Car, etc..
2. Every classname is a non primitive datatype.
3. Here Pen, Book CAr etc are non primitve data
4. With the help of non primitive data type I can create
    reference variable which can store reference of an object created.

 Default value of non primitive variable is NUll
 Eg.. Pen p1 = null;
      Book b1 = null;
```
### • Non-static Variables :
```
1. The variable declared in the class block and which are not
    prefixed with static modifier is called non static variables.
2. For non static variable the memory is allocated inside object of class.
3. Non static variable will be created inside every object created for a class.
4. A non static variable will be given with default values during the loading process.
5. Non static variable represent the attributes of an object
Eg...
    class Pen {
        String brand;
        String type;
        double price;
        String color;
        double thick;
    }
    
    Eg... 1,8
```

### • Non Static Methods :
```
1. A method which is declared in the class block and not
    prefixed with static modifier is known as non static method.
2. Non static method definition is stored in the method area.
3. The reference of the non static method is stored in object of a class.
4. Non static method block is also called as non static ocntext.
5. These non static context will hold the reference to its object.
6. We can use the non static members of the same class without any reference.
```
#### How to call a non static methods ?
```
We can a non static method with the help of object reference.
```
#### Can we call a non static method from one class to another class ?
```
Yes, we can call a non static method from one class inside another class with the help of object reference.
```
### • Non Static Context :
```
1. A block which belongs to a non static method is called non static context.
2. Inside a non static context we can use:
    (1) static members of a class directily.
    (2) Non static members of a class directly.
```
### • this :
```
1. This is a keyword.
2. It is a non static reference variable.
3. It will hold the reference variable which is currently in use.

Purpose -> 
    (1) It is used to refer the object members (non static members) form non static context.
    Eg...
        If we have local and global non static variable of same name then we
        use this keyword in order to refer the non static variable
    Eg...  11
```
### • Non - static Initializers :
```
1. Non static initializers are of two types 
    (1) Non static declare and initialization statement.
    (2) Non static block (Instace initialization block)

(1) Non Static declare and initialization statement.
    class ClassName {
        [accessModifier] datatype var = value/exp;
    }

(2) Non static block :
    - A block which is declared in the class block without prefixing with any
     modifier is called non static block.
    - class ClassName {
        {
            statements;
        }
      
      }
```
#### Note -> 
```
->A non static block doesn't have a name.
->It won't accept any argument.
->A programmer can't call non static block explicitly for execution.
->It doesn't have any return type.
->A non static initializer get executed during loading process of object.

Eg... 12,13

```

### • Public class :
```
1. A class prefixed with public access modifier is known as public class.
2. When the note is public java file name should be same as class name else
    we get compile time error.
3. We cannot create more than one public class inside a single jave file.
4. We can have one public class and any number of default classes in a single java
    file where the file name must be same as the public class name.

```
#### • Dot operator :
```
1. Dot operator is called as access operator.
2. Dot operator is binary operator.
3. this L.H.S of a dot operator must be a reference and the R.H.S 
    must be the member to be called 
```
### • Method Chaining :
```
1. It is a process of calling methods continuously one after another is called method chaining.
2. We can call methods in this fashion only if the method return a reference.
Eg... 14
```

### constructor  :
```
1. A constructor is a special member of a class whose name 
    is same as class name.
2. It is also called as special non static member of a class and also called special method.
3. A constructor doesn't have a return type.
4. A programmer cannot call a constructor every where 
    other than along with the new operator.

purpose -> It is used to load all non static member of a class into object.

5. Every class must havve a construct and its mandatory.
6. If a programmer fails to create any constructors.
    then at compile time the jave compiler will add a no argument 
    constructor into a class It is called default constructor.
    
Eg... 15
```

### Inside a constructor Body:
```
1. Instruction to load non static members will be present
2. All non static initializer of the class will inserted into the constructor body.
3. User writter instructor of the constuctor will be present.
```

### User Defined Constructors :
```
The constructor added by the programmmer are called user defined constructors
(1) no argument constructor
(2) parameterized constructor


(1) no argument constructor -> the constructor without any formal argument
    are called no argument constructor.

(2) parameterized constructor -> the constructor with formal argument called parameterized constructor

Eg... 16
```

### Constructor Overloading :
```
A class having more than one constructor is known as constructor overloading

```
#### Rule 1 :
```
1. Name of the constructor must be same.
2. The formal argument of the construction must change either in its type
    or number of formal arguments.
```
#### Purpose of parameterized constructor:
```
1. It is used to initialize the data members of the object.
2. An user can a constructor for giving startup instruction.
```
#### Note :
```
1. Constructor cannot be static.
2. A constructor cannot have any return type.

Eg... 17
```
### • Constructor Chaining:
```
1. One constructor calling another constructor for execution
    is called constructor chaining.
2. In java, we can achieve constructor chaining two way
    (1) this() (this call statement)
    (2) super() (super call statement)
    
    
```
#### This() :-
```
1. It is used to achieve constructor chaining within the same class.

Rule --> (1) This call statement must be first statement inside constructor body.
        (2) This call statement can only be used inside a constructor 
        (3) Recursive call of constructor is not allowed.
        (4) If a class has n number of constructor we can use this 
            call statement inside n-1 constructor.
            
```
### Loading Process of Object:
```
1. New operator creates a block of memory for the object in the heap area 
    and returns the reference of the block.
2. The constructor is called and execute
    (1) It loads the non static members of the class.
    (2) Non static variable are allocated with default values.
    (3) Non static method with its reference is loaded object its method signature.
    (4) All non static initialized are executed in top to bottom order.
    (5) The user returns statement of the constructor get executed
    (6) This ends the execution of the constructor 
    (7) In turn ends the loadind process of the object.
    
    Eg... 18
```


# PACKAGES :
```
1. It is mechanism of grouping or organising similar java file.
2. A group of related class and interfaces put together
    to form a single entity is known as packages.
3. Packages are of two types:
    (1) User Define Packages.
    (2) Built in Packages.
    
```
### Built in Packages:
```
1. The packages created by the developers of the long, which
    are available to use directly by importing called built in packages.
    Eg..
        Java -> io
        Java -> AWT
        Java -> long
        Java -> util
        Java -> Math
        Java -> Sal
```

### User Define Packages :
```
1. We can create a packages with the help of keyword
    called packages.
2. The packages created by programmer are called user defined package.
3. the statement of creating a package must be first statement in java programmer.
```

## Advantages of Packages:
```
1. Modularity of software is increase.
2. Maintainabilitiy of software is increase.
3. Code reusability.
4. Security of software is increase.
```

## Principles of object oriented Programming:
```
1. Object oriented programming has 4 multiples which helps programmer to design
    efficient software 
    (1) Encapsulation
    (2) Polymorphism
    (3) Inheritance.
    (4) Abstraction.
```



