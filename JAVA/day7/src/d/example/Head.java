package d.example;

import java.util.Scanner;

public class Head {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of linked list n: ");
        int n = scanner.nextInt();
        linkedlist linkedList = new linkedlist();
        System.out.println("Enter " + n + " linked list data values:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            linkedList.insertAtHead(data);
        }
        System.out.println("Final linked list:");
        linkedList.display();
        scanner.close();
    }
}

