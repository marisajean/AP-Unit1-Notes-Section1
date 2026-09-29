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
      System.out.println(num);

      //declare a variable 
      double myGradeAverage;
      // assign a value 
      myGradeAverage = 95.0;

      //initialize a variable -- declare and assign in one statement 
      double myDreamGrade = 100.0;

      // we can format strings using concatenation (+)
      System.out.println("My current grade is: " + myGradeAverage);
      // print statement for ideal grade 
      System.out.println("My dream grade is " + myDreamGrade + "!");


   }
}
