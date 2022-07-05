package EmpSystem.Service.ServiceImpl;

import java.util.Scanner;

public class GreetImplement implements Greeting{
    
    @Override
    public void greet(String str) {
        System.out.println(str);
    }
    public int showOptions() {
            System.out.println("1.Display all Employees");
            System.out.println("2.Search an Employee");
            System.out.println("3.Delete an Employee");
            System.out.println("4.Add a new Employee");
            System.out.println("5.Update an existing Employee");
            System.out.println("6.exit");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            return choice;
    }
    
}
