package Task01;

import Task01.employee.Employee;
import Task01.entity.Person;
import Task01.salary.Salary;

public class Main {
    public static void main(String[] args) {
        Person person=new Person ("Kamal","NIC123");
        person.display();

        Employee employee= new Employee("Sunil","NIC456","E001","Developer");
        employee.display();

        Salary salary = new Salary("Amal", "NIC789", "E002", "Manager", 2000);
        
        System.out.println("Bonus:"+ salary.calculateBonus(10f));
        System.out.println("Bonus:"+ salary.calculateBonus(10f,25000f));
        System.out.println("Bonus:"+ salary.calculateBonus(10f,30000));
     
        
    }
}

