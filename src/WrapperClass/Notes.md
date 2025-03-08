1. Wrapper classes are the built in classes in java present java.lang package.
2. Wrapper classes are used to convert primitive type data into its
    its respective non primitive type
3. The process of converting a primitive type data into non primitive
    is called as boxing.
4. The process of converting non primitive data back to its primitive type is known
    as unboxing.

   
```
All wrapper classes implement serializable and comparable interfaces.
All the wrapper classes override toString, equals and hashCode methods of object class.

byte -> Byte
short -> Short
char -> Character
int -> Integer
long -> Long
float -> Float
double -> Double
boolan -> Boolean
```

```
1. All wrapper classes implements serializable and comparable interfces.
2. All the wrapper classes override toString, equals and hashcode methods of object class.
```

```
1. Since JDK 1.5 boxing and unboxing became implicite that is called 
autoboxing and auto-unboxing

2. We con convert primitive type data into string type with the help of 
of a static method present in string class which is overloaded name as valueOf.

eg.. 5
```

```
  --- Converting String to primitive type ----------
1. We can convert a string to its respective primitive type.
2. The process of converting string to its primitive type is known as parsing.
3. To do parsing every wrapper class has a static parse method which 
    convert string to its respective primitve types.
    
                    byte ---> Byte.parseByte();
                    short ---> Short.parseShort();
                    int ---> Integer.parseInt();
  String ===>>      char ---> ref.charAt(0);
                    float ---> Float.parseFloat();
                    long ---> Long.parseLong();
                    double ---> Double.parseDouble();
                    boolean ---> Boolean.parseBoolean();
                    
  Eg.. 6 & 7
```