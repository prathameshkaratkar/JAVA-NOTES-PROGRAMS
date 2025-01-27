- It is a process of hiding the implementation detail and only showing
  the features is called Abstraction.


- It is a design process which helps the service specifier to provide 
  the most essential features of a project without providing
  the implementation details.

- Features with implementation detail.

Q. How to achieve abstraction ?

->  1. With the help of classes.
    2. With the help of interfaces.

- Methods are classified into two types.
  1. Abstract Method.
  2. Concrete Method.
  
1. Concrete Method : 
        Methods with implementation detail is called concrete method.
2. Abstract Method :
        Methods without implementation details & prefixed with abstract
        modifier is called abstract method.
  
#### Note :
```
1. If a class is having atlease one abstract method either declared
    or inherited, it is mandatory to make that class abstract hence we get
    compile time error.
2. classes are classified into:
    (1) concrete class.
    (2) Abstract class.
    
(1) Concrete class :
        a class which is not prefixed with abstract modifier is called concrete class.
        we can create objects only from a concrete class but not from abstract class.
        
(2) Abstract class :
        a class which is prefixed with abstract modifier is know abstract class.
        It is mandatory to make a class abstract if a 
        class is having at least one abstract method either
        declared or inherited but not overriding method and overrider method.
        We cannot instantiate an abstract classs.
        We can have constructor in an abstract class.
```

