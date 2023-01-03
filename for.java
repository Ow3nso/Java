public class Main {
    public static void main(String[] args) {
        //create an array of numbers
      int[] numbers = {1, 2, 3, 4, 5};
      //create a variable
      int sum = 0;
      //for loop
      for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
      }
      System.out.println("Sum: " + sum);
    }
  }
  
