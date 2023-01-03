//import modules
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //allows user input
    Scanner scanner = new Scanner(System.in);
    //create variables
    int sum = 0;
    int input = 0;
    
    //while loop that can only be stopped if a negative number is entered
    while (input >= 0) {
      System.out.print("Enter an integer (negative to stop): ");
      input = scanner.nextInt();
      //if statement
      if (input >= 0) {
        //operand to add sum to the input
        sum += input;
      }
    }

    //outputs the sum
    System.out.println("Sum: " + sum);
  }
}
