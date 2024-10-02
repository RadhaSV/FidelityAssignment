package Assesment2;
import java.util.ArrayList; import java.util.List;

public class ProgramEmployee {
    public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Raadha", 23, "IT", 18000));
            employees.add(new Employee("Aaradya", 20, "SPORTS", 55000));
            employees.add(new Employee("Nikitha", 25, "NON IT", 87000));
            employees.add(new Employee("Aashritha", 30, "BUISINESS", 60000));

            List<Employee> salesEmployees = employees.stream()
                    .filter(emp-> emp.getName().startsWith("A"))
                    .toList();

            System.out.println("Employees Names starts with A : ");
            salesEmployees.forEach(System.out::println);
        }
    }

    class Employee { private String name; private int age; private String department; private double salary;

        public Employee(String name, int age, String department, double salary) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        public String getName(){
            return name;
        }
        @Override
        public String toString() {
            return name + " - " + department + " - $" + salary;
        }
    }