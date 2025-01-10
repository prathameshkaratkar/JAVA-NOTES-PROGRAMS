# Control Flow Statements :-
    The statement which are used to control the execution flow of program are known as control flow statement. We have 2 types of control flow statements
    1- Decision Statement
    2- Loop Statement.

# Decision Statement
    They helps to decide whether to executre a set of instruction or to skip based on the given condition
    Decision statement are-     
        1. if statement
        2. if else statement
        3. if-else-if ladder
        4. Swithc

    1. If statement:- 
        if(condition) 
        {
         statement;
        }
    
    2. if else statement :- 
        if(condition) 
        {
         statement1;
        } else{
         statement2;
        }
    
    3. if else if ladder :-
        if(condition1) 
        {
         statement1;
        } else if(condition2) {
         statement2;
        } else if(condition3) {
         statement3;
        } else {
         statement;
        }
    
    4. Switch :-
        Switch(value/exp/var)
        {
         Case value/exp:
        {
         statement1;
         break;
        }
         Case value/exp:
        {
         statement0;
         break;
         |
         | 
         default:
        }
        }


# Scanner Class :-
    -Reading data Dynamically from user:
     we can read data dynamically from the user with the help of scanner class. scanner class reads the data from the user during the execution time of a software 
    
    - import scanner class from java.util.package
    - import statement must be the first statement java program
    - import java.util.Scanner
    
    - create the object of scanner class using Scanner constructor and store its reference in a scanner variable
    - Scanner input = new Scanner(System.in) 

    - With the help of scanner reference call the method of scanner class to read the respective data.

    - Methods of scanner class:
        - byte -> nextByte() 
        - short -> nextShort()
        - int -> nextInt()
        - long -> nextLong()
        - float -> nextFloat()
        - double -> nextDouble()
        - boolean -> nextBoolean()
        - string -> nextLine()


# Loop Statements:-
    1. Loop statement are used to execute a set of instruction repeatedly until the condition becomes false.
    2. Loop statement are control flow statement is 
    3. In every loop statement there are 3 parts 
        (1) condition - condition helps the programmer to control the loop. If the condition is true the loop statement
                        goes for another cycle. If the condition is false then loop stops or get terminated
        (2) initialization - it specifies the starting point of the loop.
        (3) update - update statement must be in every iteration cycle. the update statement must help the condition to become
                    false, after desired number of iterations.

# Different Types of Loop Statement:
    1. While Loop:
    syntax - while(condition) {
             statement;
             update;
            }
        
        In while loop the initialization must be done before the starting of the loop. in a while loop first the condition
        is checked. If the condition is true the statement of while block is executed with an update. These keep of happenning
        until the condition becomes false. Once the condition is false the control comes out of the while loop.

    
    2. Do While Loop: 
        In do while loop first the statement are executed and then the condition is checked. The minimum numberof execution
        of a do while loop is 1 where as minimum number of execution of a while loop is zero.

    3. For Loop:
        In a for loop initiazation, condition and update statement are declared together. Here the control goes to the
        initialization part and the checks the condition. If the condition is true the control gets inside the loop block
        and the statement are executed. When all the statement are executed the control goes to the update part.
        After the update again it checks for condition and hence the cycle will repeates, until the condition become false.