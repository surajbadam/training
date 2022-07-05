import java.util.ArrayList;
import java.util.Scanner;

public class AddEmployee {
    public void createEmployee(ArrayList<Employee> al){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter Salary :");
        float salary = sc.nextFloat();
        System.out.println("Enter Designation:");
        String designation=sc.next();
        //e[count]=new Employee(id, name, salary, designation);
        al.add(new Employee(id, name, salary, designation));
    }
}
