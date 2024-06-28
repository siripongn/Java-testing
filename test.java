public class test {
    public static void main(String[] args) {
      System.out.println("Hello World");

      int myInt = 9;
      double myDouble = myInt; // Automatic casting: int to double
      float myFloat = myInt; // Automatic casting: int to float
  
      System.out.println(myInt);      // Outputs 9
      System.out.println(myDouble);   // Outputs 9.0
      System.out.println(myFloat);   // Outputs 9.0

      String txt = "Hello World";
      System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
      System.out.println(txt.toLowerCase());   // Outputs "hello world"

      String firstName = "John ";
      String lastName = "Doe";
      System.out.println(firstName.concat(lastName));
    }
  }