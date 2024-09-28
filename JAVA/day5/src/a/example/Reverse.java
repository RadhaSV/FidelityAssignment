package a.example;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        for (int i = words.length - 1;   i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
