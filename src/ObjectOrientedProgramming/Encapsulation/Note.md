# Encapsulation -> 
```
    It is a process of wrapping or binding the attributes
    and behaviours together is known as Encapsulation.
    
```
### Note ->
```
1. We should not give direct access to the attributes of the class object.
2. But the user should be able to read modify the attributes of class object
    only with the help of behaviours(actions)
3. Therefore it is a good practice of a programmer to design a class such that we
    can have methods to read the attributes as well as methods to update the attributes.
    
```
## Advantages: 
```
Since we provide and indirect access to the attributes,
it is secure and we can have validation steps before reading or updating
the attributes.

```
### Data Hiding :
```
It is a process of restriction direct access to the attributes of a class
(object) and providing secure and indirect access to the properties of a class
(object) is called data hiding.

```
#### Steps to achieve data hiding ->
```
1. Make the attributes private.
2. Create getter and setter methods for read and write operation resp.
3. A programmer will get the flexibility to design the follo
    (1) make attribute only readable
    (2) make attribute only modifyable but not readable
    (3) make attribute both readable and modifyable
    (4) make attribute neither readable nor modifyable.
```

## Relationships :
```
1. The association between two or more objects is known as relationships
2. There are 2 type of relationships:
    (1) Has - A relationship
    (2) Is - A relationship
```

### (1) Has A relationship:
```
The association betwen two or more objects such that one object 
such that one object is dependent on another is known as Has a relationship.

NOTE -> 
    According to level of dependency we can further 
    classify Has a relationship into
    [1] Composition.
    [2] Aggregation.
```
#### [1] Composition ->
```
It is the association between two or more objects
where one object cannot exist without another object.
This behaves like part and whole relationship.
Eg...
    Car - Engine
    Hardware - Software
    Mobile - Charger
    Bottle - Cap
    Lock - Key
    Projector - Screen
    Book - Paper
```
#### [2] Aggregation ->
```
It is the association between two or more objects
there is a dependencies but one can exists without another.
Eg...
    Water - Fish
    Chair - Human
    Dog - Belt
    Human - Shoe
    ATM - Money
    Human - Mobile
```

### Early Instanciation and Lazy Instanciation :

#### (1) Early Instanciation :
```
1. In Early Instanciation the instance of the dependent
    object is implicitly created when the instance of the object
    classes created (main object/class)
2. this design is achieved with the help of non static initializers.

Eg...
    Encapsulation -> 4,5,6
```

## Null Pointer Exception: 
```
When we tried to refer a non static member of an 
object where the reference variable contains null value
then we get null pointer exception


NOTE -> 
    (1) The parent class is called generalized
    (2) The child class is called specialized.
    (3) With the help of child class reference type we
        can use all members of parent class as well as
        child class.
    (4) With the help of parent class reference type we can only
        use the members of parent class but not child class member.
        
```

### Terminologies :
```
Parent class is also called as base class or super class.
Child class is also called as sub classs or derived class.
We can achieve relationship with help of Inheritance.
```




