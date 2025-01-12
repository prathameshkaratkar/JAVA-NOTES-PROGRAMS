# METHODS :-
    1. Methods are nothing but block of instruction which get executed when they are called.
    2. Methods are designed to perform specific task.
    3. Methods are used to achieve code modularity.

## Code Modularity :-
    It is a design of breaking the entire task into
    smaller modules and sub modules and creating
    methods for each and every module and sub
    module is known as code Modularity.

## Advantages of Methods :-
    1. Readability of code is increased
    2. Code reusability can be called whenever needed.
    3. Easy bug fixing.
    4. Easy code Modification.

## Note :-
    1. A programmer can use methods which are already designed by someone (built in method).
    2. A programmer can also design and create his won methods.
       that methods can be used by himself or by others.
    

## 1. Method Name :-
    It is an identifier which is used to identify and call
    the method for execution 
## 2. Formal Arguments :-
    The variable declared in the method declaration statement
    are called formal arguments.
    Formal Arguments in a method are required to accept the input data.
## 3. Return Type :-
    1.Return type specifies either the method will return
    a type of value or it returns nothing after the method execution.
    2.The return type can either be void or a specific data type.
    3.If a method returns nothing the return type must be void.
    4.If a method has to return something the type myst be a datatype 
## 4. Modifiers:-
    Modifiers are the keyword which are used to modify
    the behaviours of java members.
    1. Access Modifiers
    2. Non - Access Modifiers.
### 1. Access Modifiers :-
    They are the keywords which are used to alter the accessibility 
    or visibility of a java members. In java 
    there are four access modifiers they are as
    1. Public
    2. Private
    3. Protected
    4. Default
### Non Access Modifiers :-
    They are 
    1. Static
    2. Final
    3. abstract
    4. Synchronized
    5. Volatile etc...

## Terminologies :-
### 1. Method Signature:
    It is a combination of method name and formal arguments.
### 2. Method declaration statement:
    It is combination of access modifier, modifier return type and method signature.
### 3. Method definition:
    It is combination of method declaration and method body.

## Note :-
    1. We can create methods only inside a class.
    2. We cannot create method inside another method.
    3. A class can have any number of methods.

## Methods ar classified into two based on formal arguments
    1. No argument method.
    2. Parameterized method.

### 1. No argument method:
    1. Methods are declared without formal argument are called no argument method
    2. no argument methods cannot accept any input.
    3. We can call a using methodName().

### 2. Parameterized Method :
    Methods with formal argument are known as parameterized method.
    It is used to accept data when it is called for execution.

## Characteristics 
    1. Methods get executed only when they are called for execution.
    2. A method can be called any number of times.
    3. A variable declared inside a method stays local to that
     method we cannot use it in different methods.

## Formal Arguments :
    1. The variable declared in the method declaration statement
     are called formal arguments
    2. They are local variables of that method.
    3. Formal argument will be initialized with the data when the method is called.

## Actual Arguments :
    1. the argument passed (value or data) in the method call statement are known
     are actual argument
    2. Actual argument can also be an expression. First the expression is solved and then the 
     result data is passed to the methods.

## Work of Main Method:
    1. We can compile a progrma without main method but
    we can't execute
    2. Main method is called by JVM
    3. Execution of a program starts with Main method.
    4. Execution flow is controlled by Main Method
    5. Execution ends at main method.


# Return :
    1. Return is a keyword and a control transfer statement
    2. Return will destroy teh stack frame and transfer the 
    control to the calling method with the value associated
    with it i.e it will stop the execution of method.
### Note::-
    1. If return type is method is void using reutrn statementis optional
    2. If the return type of a method is anything  other than void it means
    method return some value to the calling method. OR 
    using return statement is mandatory. OR
    return statement must have a value or expression to be 
    return back to the calling method  OR
    Return statement cna do widening  OR
    Return statement cannot do narrowing implicitly.



## Method Binding Process: -
    1. To bind a method call statement with the method definition.
    2. For every method call statement. It has to be binded is known as binding.
    3. The binding is done by the compiler at compile time.
     This is known as compile time binding.
    4. Compiler does the binding between method call and 
     method body with the help of the method signature as follows.
        (1) With the help of method name
        (2) The list of actual and formal argument must be same.
        (3) Number of actual and formal argument must be same.


## Method Overloading :-
    1. Method overloading is a designed of having more than
    one method with same name.
    2. Here to achieve method overloading the name 
    of the method myst be same whereas the length or
    the type of the formal argument must be different.
    3. method overloading is compile time polymorphism i.e the execution
    of the method definition is decided by the compiler.
    4. We do method overloading when the functionality or operation
    is same but the values are different .

## Static :-
    1. Static is a keyword and a modifier.
    2. Static modifier can be prefixed to a method
    or a variable or a block created inside a class
    3. The members which are prefixed with static modifier
    are called static members.

#### Note :
    1. Static members are called class members.
    2. Static members are allocated with memory in 
    the class static area.
    3. Static members of a class be used in any members
    of the same classs directly.
    4. It can also be used in any member which belongs 
    to another class with the help of class name as reference.
    5. We can use a static members  without creating an object for a class.

#### Static Methods :
    

