package a.example;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first name: ");
        String s1 = sc.nextLine();
        System.out.println("Enter last name: ");
        String s2= sc.nextLine();
        String FullName= s1 + s2;
        System.out.println("full name : " +FullName);
    }
}
