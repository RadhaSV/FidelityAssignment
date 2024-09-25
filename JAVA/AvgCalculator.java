package small.example;

public class AvgCalculator {
    public static void main(String[] args){
        int[] num= {10,20,30,40,50};
        double avg=CalculateAverage(num);
        System.out.println("Average of the collection numbers is "+avg);
    }
    public static Double CalculateAverage(int [] nums){
        int sum=0;
        for (int num : nums){
            sum+=num;
        }
        return (double)sum/nums.length;
    }

}
