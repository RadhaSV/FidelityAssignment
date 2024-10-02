package small.example;
import java.util.Scanner;

public class VotingEligibiity {
    public static Boolean IsEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if (IsEligible(age)) {
            System.out.println(" you are eligible to vote");
        } else {
            System.out.println(" you are not eligible to vote");
        }
        sc.close();

    }
}
