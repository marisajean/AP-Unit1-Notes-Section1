// import statements always go at the beginning of a file 
import java.util.Scanner; 

/*

Primitive Type - storing simple information/data (ex. int x = 5;)
Object (Reference) Type - storing complex data/objects (ex. Creature cat = new Creature())

Primitive Variable Types to Know: 
1. int - stores integers/positive or negative whole numbers 
2. double - store decimal numbers (ex. double x = 5.0;) (ex. double y = 4.25;)
3. boolean - stores logic (only two options are True or False)

Object Variable Type to Know:
1. String - stores text between quotes (ex. "5.0", "Hello, world!") 

Setting Up Variables In Code: 
Declaring + Assigning go together 
1. Declare Variable  --> int x;  String name;
2. Assign Variable --> x = 5; name = "Ms. Dinko"

Or do it in one step!
3. Initialize Variable --> int x = 5; String name = "Ms. Dinko"

Concatenating - put more than one string together using "+"

*/

public class Main {
   public static void main(String []args) {
      int num;
      num = 4;           
     // System.out.println(num);

      //declare a variable 
      double myGradeAverage;
      // assign a value 
      myGradeAverage = 95.0;

      //initialize a variable -- declare and assign in one statement 
      double myDreamGrade = 100.0;

      // we can format strings using concatenation (+)
     // System.out.println("My current grade is: " + myGradeAverage);
      // print statement for ideal grade 
     // System.out.println("My dream grade is " + myDreamGrade + "!");

      // we can use println or print to produce output 
      System.out.print("Hi ");
      System.out.print("there");
      System.out.println("!");

      // we can print special characters using an escape sequence \
      System.out.println("\"");
      System.out.println("\\");
      System.out.println("I love computer science. \nIt is so cool.");

      // example with all three escape sequences
      System.out.println("She said\\\n\"I love computer science!\"");

      // math operators + - * /
      // when we do int division, it truncates our answer. It returns an int. 
      int x = 5;
      int y = 3;

      //System.out.println(x/y);
      // % gives us the remainder 
      //System.out.println(x%y);

      x = 6;
      y = x;
      x = 8;

      // we can also update variable assignments by incrementing and decrementing 
      // incrementing adds 1 to our value 
      // decrementing subtracts 1 from our value 

      x = x + 1; 
      // x++ updates our variable even without the equal sign 
      x++;

      x = x - 1; 
      // x-- updates our variable even without the equal sign 
      x--;

      /* 
      System.out.println("Please type in a name in the input box below.");
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      System.out.println("Hello " + name);
      scan.close(); 
      */

      // Lesson 1.5 Casting 
      // We can cast to change data types for variables we have already defined 
      int intNum = 4;
      // we cast by including the new data type in () before our variable name 
      System.out.println((double) intNum);
      System.out.println(intNum);

      double dbNum = 4.6;
      System.out.println((int) dbNum);

      double negNum = -3.4;
      // when we cast doubles to ints, it truncates our decimal. It does NOT round. 
      // We can round manually using math! 
      // we can round positive numbers by adding .5 and casting 
      int roundedPos = (int) (dbNum + .5);
      System.out.println(roundedPos);

      // we can round negative numbers by subtracting .5 and casting 
      int roundedNeg = (int) (negNum - .5);
      System.out.println(roundedNeg);

      // coding challenge below 
      int grade1 = 95; 
      int grade2 = 82; 
      int grade3 = 90;
      int sum;
      double average; 
      sum = grade1 + grade2 + grade3;
      average = (double) sum / 3;
      System.out.println(average);
   }
}
