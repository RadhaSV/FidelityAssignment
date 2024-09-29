package a.example;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your country: ");
        String country = sc.nextLine();
        System.out.print("welcome " + name + ". Your age is " + age + " and you are from " + country);
    }
}
