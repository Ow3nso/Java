//Simple java calculator to perform operations between two numbers

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.println("Use the symbols in bracket below to choose an opertaion");
        System.out.println("Addition(+), Subtraction(-), Division(/), Multiplication(*) ");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Choose an operand: ");
        String operand = sc.next();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (operand == "+"){
            int ans = num1 + num2;
            System.out.println("Your answer is:" + ans);
        }else if(operand  == "-"){
            int ans = num1 - num2;
            System.out.println("Your answer is:" + ans);
        }else if(operand  == "/"){
            int ans = num1 / num2;
            System.out.println("Your answer is:" + ans);
        }else if(operand  == "*"){
            int ans = num1 * num2;
            System.out.println("Your answer is:" + ans);
        }else{
            System.out.println("syntax error");
        }
    }
}
