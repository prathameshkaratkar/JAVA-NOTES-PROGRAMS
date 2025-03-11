## Exception Handling:
1. We declare an exception with the help of keyword called throws
   (we do it only for checked execution).

### Try - catch block
```
1. In java, we handle exception  with the help of try catch block
2. Exception handling is mechanism which is used to continue the flow
    of execution when an execution is occured.
    
```

```
try {
    statement responsible for exception : ref
} catch (Throwable type ref var) {
    
    * Reason of exception
    * Debugging mechanism
    * Message to the user
    * Task to be perform when an exception is occured by user.

}

```
1. Try Block :
```
1. When an exception is occured a throwable type object is created.
2. The reference of the throwable object is thrown to catch block
```
2. Catch Block :
```
1. The catch block has to catch the reference thrown by try only
    then we can say the exception is handled successfully
2. If catch block does not catch the reference then we say the exception
    is not handled.
```

### Note :
1. the catch block will execute only when exception is handled.
2. a catch block can catch the exception thrown only if
   (1) variable declared in the catch block should be of same type of exception created.
   (2) variable declared in the catch block can be of parent type when exception is thrown.

## Try with multiple catch blocks :
1. When we have more than one exception occurring in a program
   we go with try with multiple catch blocks.
2. A try block having more than one catch block is called try with 
   multiple catch block.

```
try{
      statement;
}  catch (ThrowableTypeReference){

      ---------------
      ---------------
}
 catch(ThrowableTypeReference){
      ------------------
      ------------------
 }

```
3. The reference of throwable type object is always thrown to the first
   catch block. If it is not caught then reference is pass to the second
   catch block. In this way the reference of object is given to the or is
   pass to the catch block in top to bottom order until it is caught.
4. If the reference is not caught by any of the catch block then program goes
   to an unplanned stop and we can say the exception is not handled.