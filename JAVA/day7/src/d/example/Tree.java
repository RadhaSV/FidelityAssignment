package d.example;

import java.util.LinkedList;
import java.util.Scanner;
public class Tree {
    Node head=null;
    Node tail=null;
    public static void main(String[] args) {
        Tree obj=new Tree();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n>0){
            int k=Integer.parseInt(sc.nextLine());
            obj.addTail(k);
            n=n-1;
        }
        obj.reverse();


    }

    void addTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        while(prev!=null){
            System.out.println(prev.data);
            prev=prev.next;
        }

    }
    void display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }

}