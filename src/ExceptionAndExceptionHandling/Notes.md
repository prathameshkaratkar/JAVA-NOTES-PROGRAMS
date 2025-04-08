## Exception and Exception Handling

Throwable -->  1. Exception
               2. Error


1. Exception --> 1. Runtime Exception
                 2. FileNotFound Exception
                 3. I/O Exception
                 4. Interrupted Exception

    Runtime Exception ---> 1. Arithmetic Exception
                           2. ArrayIndexOutOfBound Exception
                           3. Null Pointer Exception
                           4. NumberFormat Exception

2. Error ---> 1. No Such Method Error
              2. Virtual Machine Error
              3. Stack Overflow



#### Checked Exception
```
1. Compiler aware exceptions are called checked exception
2. The compiler knows the statement which are responsible for particular exception
3. The compiler forces the programmer to either handle or declare exception.
4. If the exception is neither handled nor declared the compiler throws an
    unreported exception compile time error.
```

#### Unreached Exception
```
1. Compiler unaware exception are called Unreached Exception.
2. The compiler is unaware (doesn't know) the statement which is 
    responsible for the particular exception.
```

##### Note
All the exception classes override and throwable override toString method
of object class in such a way they print the name of the exception along
with a message.


### Finally Block 
```
1. Finally block can be used along with try or try catch block
2. The control will go the finally block in any of these situation.
    (1)When an exception as occured.
    (2)When an exception as occured and handled.
    (3)Exception is occured in the try block and not handled, still
        finally block gets executed and program gets terminated.
3. The finally block will not executed when the exception has occured outside
    the try block.
```

