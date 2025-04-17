## Method to Print exception info
- sout(e) or sout(e.toString) -> will print name, description of error
- e.printStackTrace ---> print name, description and StackTrace
- sout(e.getmessage) ---> print description of error

- It is not mandatory to use try catch block with throw and throws
- throw can throw1 exception while throws can throws multiple exception
- 
```java
    try{
            System.out.println(a[6]);
            int result=5/0; //will not be execute because prior statement thrown an error but st. after catch block will execute
        }
  ```
- if u want to handle multiple exception at once
  - ```java
      catch(ArrayIndexOutOfBoundsException | ArithmeticException |  NullPointerException e ){
      System.out.println("Handling multiple exceptions");
        }
        //or
       catch(Exception e ){
            System.out.println("Handling multiple exceptions");
        }
```
