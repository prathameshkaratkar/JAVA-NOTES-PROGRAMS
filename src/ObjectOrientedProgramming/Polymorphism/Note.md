# Polymorphism :
```
1. Poly means many, morph means form.
2. The ability of member to have one name and many forms
 is known as Polymorphism.
3. It is of two types:
    (1) Compile Time Polymorphism
    (2) Run Time Polymorphism
```

### (1) Compile Time Polymorphism:
```
1. The polymorphism is achieved at compile time i.e
    if a member has one name and many forms here the compiler
    with decide which forms to be executed at compile time 
    is known as Compile Time Polymorphism.
2. Which are they :
    (1) Method Overloading
    (2) Constructor Overloading
    (3) Method Shadowing
    (4) Variable Shadowing
    (5) Operator Overloading
    
```
### (2) Run TIme Polymorphism:
```
If a member has one name and many forms. Here compiler will not
decide which member to be executed instead the preference will be given
to the member on the basis of the object created.

Q. How to achieve Run Time Polymorphism
-> (!) Upcasting
    (2) Method Overriding.
```

Q. What is Method Overriding ?

-> (1) It is process of giving a design to a super class 
     method from the sub class is known as Method Overriding.
    (2) Method overriding can be done only with non static method.

### 1. Method Shadowing :
```
1. If we have static method of same signature in both parent and child class.
2. The preference is given to parent class method not to child class.
3. This is because method shadowing is compile time polymorphism.
4. The execution of method definition doesn't depend on 
    type of object created instead it depend on type of reference used to invoke 
    the method.
    
```

### 2. Variable Shadowing :
```
1. If parent class and child class are having static or non static variable of same is variable shadowing.
2. It is compile time polymorphism 
3. The execution of method definition doesn't depend on object created instead it depends
   the type of reference used to invoke the method.
   
```


## Note : Loading process of object;
```
1. New creates a block of memory in the heap area.
2. When a constructor is called it contains a super call statement in default

(1) A class can inherite another class with the help of extends keyword.
(2) Both static and non static members of the class get inherited.
(3) With the help of sub class reference type we cna use both static and non
    static members of both sub class and super class.
(4) Private members of a class are not inherited.
(5) The initializers of class (static initializers, non static initializers and constructors)
    are not inherited to the sub class.
```
