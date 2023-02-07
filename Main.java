import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int sum = 0;
    int numPositives = 0;
    int numNegatives = 0;
    int input = 0;
    

    boolean flag = false;

    // Create a while loop that keeps taking input from the user until
    // the user enters '0'
    while (input > 0)
    {
    System.out.println("Please enter an integer: ");
    input = scan.nextInt();  
    }


    
    System.out.println("You entered " + numPositives + " positive numbers.");
    System.out.println("You entered " + numNegatives + " negative numbers.");

    double average = sum * 1.0 / (numPositives + numNegatives);

    System.out.println("The average of your numbers is " + average);
  }
}