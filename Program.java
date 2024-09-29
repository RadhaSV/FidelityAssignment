package a.example;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class person {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAdult() {
        int age = getAge(dob);
        return age >= 18 ? "Adult " : "Child ";
    }

    public void displayDetails() {
        int age = getAge(dob);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println(getAdult());
    }

    public int getAge(LocalDate dob) {
        LocalDate now = LocalDate.now();
        LocalDate today = null;
        Period period = Period.between(dob, today);
        return period.getYears();
    }
}
public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person=new Person();
        System.out.println("Enter First Name: ");
        person.setFirstName(sc.next());
        System.out.println("Enter Last Name: ");
        person.setLastName(sc.next());
        System.out.println("Enter DOB: ");
        String dob = sc.next();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy/mm/dd");
        person.setDob(LocalDate.parse(dob, formatter));
        person.displayDetails();
        
    }
    
        
}
