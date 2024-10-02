package Assesment2;

import java.util.Scanner;

class Insurance{
    private String insuranceNo;
    private String insuranceName;
    private double insuranceAmount;
    public Insurance(String insuranceNo, String insuranceName, double insuranceAmount) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.insuranceAmount = insuranceAmount;
    }
    public double getInsuranceAmount() {
        return insuranceAmount;
    }
}
class MotorInsurance extends Insurance{
    private double idv;
    private float depPercent;

    public MotorInsurance(String insuranceNo, String insuranceName, double insuranceAmount,double idv, float depPercent) {
        super(insuranceNo, insuranceName, insuranceAmount);
        this.idv = idv;
        this.depPercent = depPercent;
    }
    public double calculatePremium(){
        double premium= (idv-((getInsuranceAmount()*depPercent/100)));
        premium= (premium*0.03);
        return premium;
    }
}
class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benefitPercent;

    public LifeInsurance(String insuranceNo, String insuranceName, double insuranceAmount,int policyTerm,float benefitPercent) {
        super(insuranceNo, insuranceName, insuranceAmount);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }
    public double calculatePremium(){
        double premium=getInsuranceAmount()-((getInsuranceAmount()*benefitPercent)/100);
        premium=premium/policyTerm;
        return premium;
    }
}
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Insurance Number:");
        String insuranceNo = sc.nextLine();
        System.out.println("Enter Insurance Name:");
        String insuranceName = sc.nextLine();
        System.out.println("Enter Insurance Amount:");
        double insuranceAmount = sc.nextDouble();
        System.out.println("select insurance type:");
        System.out.println("1.Life Insurance");
        System.out.println("2.motor Insurance");
        int opt=sc.nextInt();
        Insurance insurance=null;
        if(opt==1){
            System.out.println("Enter policy Term:");
            int policyTerm = sc.nextInt();
            System.out.println("Enter benefit Percent:");
            float benefitPercent = sc.nextFloat();
            insurance=new LifeInsurance(insuranceNo, insuranceName, insuranceAmount,policyTerm,benefitPercent);
        }else if(opt==2){
            System.out.println("Enter Depreciation Percent:");
            float depPercent= sc.nextInt();
            System.out.println("Enter IDV:");
            int idv = sc.nextInt();
            insurance=new MotorInsurance(insuranceNo, insuranceName, insuranceAmount,idv,depPercent);
        }
        double premium=addPolicy(insurance);
        System.out.println("Insurance Premium: "+premium);
    }

    private static double addPolicy(Insurance insurance) {
        if(insurance instanceof LifeInsurance){
            return((LifeInsurance)insurance).calculatePremium();
        }else if(insurance instanceof MotorInsurance){
            return((MotorInsurance)insurance).calculatePremium();
        }
        return 0;
    }
}
