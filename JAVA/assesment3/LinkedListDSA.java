package com.assesment3;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDSA {
  public static void main(String[] args) {

    LinkedList<String> list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter four elements for the LinkedList:");
    for (int i = 0; i < 4; i++) {
      System.out.print("Element " + (i + 1) + ": ");
      String element = scanner.nextLine();
      list.add(element);
    }


    System.out.println("Current LinkedList: " + list);


    System.out.print("Enter the index of the element to remove (0-3): ");
    int indexToRemove = scanner.nextInt();


    if (indexToRemove >= 0 && indexToRemove < list.size()) {
      String removedElement = list.remove(indexToRemove);
      System.out.println("Removed Element: " + removedElement);
      System.out.println("Updated LinkedList: " + list);
    } else {
      System.out.println("Invalid index. Please enter a valid index between 0 and " + (list.size() - 1));
    }
  }
}
