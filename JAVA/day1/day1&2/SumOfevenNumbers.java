package small.example;
import java.util.Scanner;

public class SumOfevenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int SumOfeven = CalSumOfEven(num);

        System.out.println("sum of even numbers " + SumOfeven);

        sc.close();
    }

    public static int CalSumOfEven(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }


}


