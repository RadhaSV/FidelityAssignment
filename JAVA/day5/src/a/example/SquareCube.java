package a.example;

import java.util.Scanner;

public class SquareCube {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int square=findSquare(n);
        int cube=findCube(n);
        System.out.println("square of "+ n + " is " +square);
        System.out.println("cube of "+ n + " is " +cube);

    }
    public static int findSquare(int n){
        return n*n;
    }
    public static int findCube(int n){
        return n*n*n;
    }
}
