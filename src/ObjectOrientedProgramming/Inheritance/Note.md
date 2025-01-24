# What is Inheritance :
```
The process of one object acquiring all the properties 
and behaviours from another class is known as Inheritance.

In java we can achieve inheritance using
    (1) Extends Keywords.
    (2) Impliments Keywords.
    
(1) Extends Keywords ->
        It is used to achieve inheritance between two
        classes or two interfaces.
        
(2) Impliments Keywords ->
        It is used to achieve inheritance between an interface
        and a class.
```

### Levels of Inheritance :
```
1. Single Level Inheritance.
2. Multi Level Inheritance.
3. Hierarchical Inheritance.
4. Multiple Inheritance.
5. Hybrid Inheritance.
```

#### 1. Single Level Inheritance :
```
Inheritance achieved in one level is called single
level inheritance. (one parent and one child)

Eg... 4,5,6
```

#### 2. Multi Level Inheritance: 
```
Inheritance achieved in more than one level.

C extends B extends A

Eg... 7,8,9,10
```

##### Constructor chaining using Super call statement:
```
super call statement use to achieve constructor chaining
between two classes provided if the both classes are in Is-A Relationship.

* Note ->
    1. super call statement must be first statement inside a constructor
    2. super call statement can only be use inside a constructor
    3. If a programmer fails to add super call statement, implicitly
    a compiler will add a  no argument super call statement.
    4. A constructor cannot have both this call and super call.
    5. If this call statement is used in constructor then the compiler
    will not add super call statement implicitly.
    
* Purpose ->
    1. super call statement is used to call the super class constructor during
    the object creation of sub class.
    2. It helps us to load non static members of super class in the sub class object.
    3. It is used to pass the Data from sub class to super class.
    
    
* Implementation ->
1. University.java
    University() {String uniname, int unicode, String uniloc, String vc}
    
2. College.java
        public class College extends University
            College(String colname, String colloc, String principle, int colcode,String naac, String type);
            super(uniname, unicode, uniloc,vc)
            
3. Department.java
        public class Department extends College
            Department(String type, String hod, int std, int lec)
            super(uniname,unicode,uniloc,vc,colname,colloc,principle,colcode,naac, type);
            
```

#### 3. Hierarchical Inheritance :
```
A super class having more than one sub classes of same level
is known as Hierarchical Inheritance.

Eg..
public class A
public class B extends A
public class C extends A
public class D extends A
```

#### 4. Multiple Inheritance:
```
1. A sub class having more than one super class of same level is 
called Multiple Inheritance.
2. Multiple Inheritance has a limitation called Diamond Problem.

* Diamond Problem ->
    (1) It is an Ambiguity (confusion) that arise while calling a method
    from sub class reference.
    (2) Eg...
        Let us consider class called Jack and Jill having a common child class Pill.
        If a class Jack and Jill are having methods with same signature (dancing) then there is a 
        confusion whether the inherite definition of class Jack or Jill.
        

```

#### 5. Hybrid Inheritance:
```
It is a combination of different type of inheritance it is 
called as Hybrid Inheritance.


* Note ->
    (1) Hybrid Inheritance is achievable partially with 
    respect to classes.
    
* super :
    (1) It  is a keyword which is used to refer the parent class
    members from the child class when there are members of same name in 
    both the classes.
    
* instance of:
    (1) It is an operator which is used to check if an object is an instance of particular class or not.
    
Eg...
    11,12,13

```

#### Derived Type Casting (Non Primitive Typecasting):
```
1. The process of converting one type of object reference
inot another type is known as derived type casting.

* Note ->
    1. If there is Is - A Relationship between both the
    types.
    2. When both reference type have a common child.
    3. Non primitive type casting further classified into two type.
        (1) Upcasting.
        (2) Downcasting.
        
    (1) Upcasting :
        It is a process of converting or storing sub class 
        reference type into super class type.
        upcasting is done implicitly done by compilers
        upcasting is used to achieve generalization
        
        Eg... 14,15,16
        
    (2) Down Casting :
        The process of converting or storing upcasted reference
        back to respective sub class type.
        It is not done implicitly by the compiler.
        It should be done explicitly by the programmer 
        with the help of thpe cast operator.
        
        
        Purpose ->
            When the reference is upcasting we cannot use
            the members of subclass Therefore to use members
            we need to use downcast reference.
            

```

##### Class Cast Exception :
```
We get class cast exception when we tried to down cast
reference to a specific sub class type without upcasting but the object created does not 
process members of sub class.
```

