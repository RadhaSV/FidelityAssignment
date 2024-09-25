package sv.radha;

public class Employee {
    int id;
    String name;
    float bonus;
    int basic_salary;
    int net_salary;
    public Employee(int id, String name, int basic_salary){
        this.id=id;
        this.name=name;
        this.basic_salary=basic_salary;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public float getbasic_salary(){
        return basic_salary;
    }
    public float getnet_salary(){
        return net_salary;
    }
    public float getBonus(){
        return bonus;
    }
}
class PermanentEmployee extends Employee {
    int pf;
    public PermanentEmployee(int id, String name, int basic_salary, int pf) {
        super(id, name, basic_salary);
        this.pf=pf;
    }
    public void calculateSalary(){
        net_salary=basic_salary-pf;
    }
    public void calculateBonus(){
        if(pf<1000)
            bonus=(float)(basic_salary*0.10);
        else if(pf>=1000 && pf<1500)
            bonus=(float)(basic_salary*0.115);
        else if(pf>=1500 && pf<1800)
            bonus=(float)(basic_salary*0.12);
        else
            bonus=(float)(basic_salary*0.15);
    }
    public int getPf(){
        return pf;
    }
}
class TempEmployee extends Employee{
    int wages;
    int days;
    public TempEmployee(int id,String name,int wages,int days){
        super(id,name,0);
        this.wages=wages;
        this.days=days;
    }
    public void calculateSalary(){
        net_salary=wages*days;
    }
    public void calculateBonus(){
        if (wages<1000)
            bonus=(float)(net_salary*0.15);
        else if(wages >=1000 && wages<1500)
            bonus=(float)(net_salary*0.12);
        else if(wages>=1500 && wages<1750)
            bonus=(float)(net_salary*0.11);
        else
            bonus=(float)(net_salary*0.08);
    }
    public int getWages(){
        return wages;
    }
    public int getDays(){
        return days;
    }
}
class Main {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "Esther", 25000, 1500);

        permanentEmployee.calculateSalary();
        permanentEmployee.calculateBonus();
        System.out.println("Permanent Employee Details:");
        System.out.println("ID:" + permanentEmployee.getid());
        System.out.println("NAME:" + permanentEmployee.getname());
        System.out.println("BASIC SALARY:" + permanentEmployee.getbasic_salary());
        System.out.println("NET SALARY:" + permanentEmployee.getnet_salary());
        System.out.println("BONUS:" + permanentEmployee.getBonus());

        TempEmployee tempEmployee = new TempEmployee(102, "Ganesh", 1500, 20);
        tempEmployee.calculateSalary();
        tempEmployee.calculateBonus();
        System.out.println("temp employee details:");
        System.out.println("ID:" + tempEmployee.getid());
        System.out.println("NAME:" + tempEmployee.getname());
        System.out.println("WAGES:" + tempEmployee.getWages());
        System.out.println("Days:" + tempEmployee.getDays());
        System.out.println("BONUS:" + tempEmployee.getBonus());
        System.out.println("NETSALARY:" + tempEmployee.getnet_salary());
    }
}





