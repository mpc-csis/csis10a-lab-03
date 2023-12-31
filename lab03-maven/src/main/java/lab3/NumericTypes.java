package lab3;
/**
   This program demonstrates how numeric types and operators behave in Java
*/

public class NumericTypes {


   public static void main (String [] args) {
       
      //******************  Problem 1 *****************************
      //variable declarations
      int number = 2 ;     // number of scores
      int score1 = 100;    // first test score
      int score2 = 95;     // second test score
      double average;            // arithmetic average
      String output;             // line of output to print out
      
      // Find the average of score1 and score2
      average = score1 + score2 / number;
      
      // Print the average with explanatory info
      System.out.println("The average of " + score1 + " and " + score2 + " is " + average);      
      System.out.println();      // to leave a blank line 
      
      //****************** End Problem 1 ***************************/      
      /******************  Problem 2 *****************************
      
      int fahrenheit = 212;  // boiling temperature in fahrenheit
      int celsius;               // temperature in celsius
     
      // Convert Fahrenheit temperatures to Celsius
      celsius = 5/9 * (fahrenheit - 32);
      System.out.println(fahrenheit + "deg F = " + celsius + "deg C");
      System.out.println();      // to leave a blank line

      //****************** End Problem 2 ***************************/      
      /******************  Problem 3 *****************************
      
      double diameter = 2.0; // the diameter of a sphere

      // Create a variable to store the radius and initialize with 
      //    one half of the diameter 
      
      // calculate and store the volume of the sphere using Math.PI and Math.pow
      
      // print out the volume
      
      
      //****************** End Problem 3 *****************************/
      
   }  
}