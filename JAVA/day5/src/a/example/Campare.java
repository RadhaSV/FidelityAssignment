package a.example;

import java.util.Scanner;

public class Campare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        System.out.println("Enter value of y");
        int y = sc.nextInt();
        boolean result=x<y;
        System.out.println("The result of whether x is lesser that y is " +result);
    }
}
