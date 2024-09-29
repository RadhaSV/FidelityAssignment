package a.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operands:\n");
        String operator = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        printResult(operator,a,b);
    }
    private static int getOperand(Scanner scanner) {
        while (true){
            try{
                return scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Invalid input");
            }
        }
    }

    private static void printResult(String operator, int a, int b) {
        switch (operator) {
            case "+":
                System.out.println("Result of " + a + " + " + b + " is " + (a + b));
                break;
            case "-":
                System.out.println("Result of " + a + " - " + b + " is " + (a - b));
                break;
            case "*":
                System.out.println("Result of " + a + " * " + b + " is " + (a * b));
                break;
            case "/":
                int remainder = 0;
                if (b != 0) {
                    int quotient = (int) a / (int) b;
                    remainder = (int) b % (int) b;
                    System.out.println("Result of " + a + " / " + b + " is " + (a / b));
                } else {
                    System.out.println("Remainder= " + remainder);
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
