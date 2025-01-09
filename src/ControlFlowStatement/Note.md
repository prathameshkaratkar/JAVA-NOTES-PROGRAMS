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