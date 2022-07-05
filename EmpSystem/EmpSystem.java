package EmpSystem;

import java.util.ArrayList;
import java.util.Scanner;

import EmpSystem.Domain.Employee;
import EmpSystem.Exception.ResponseException;
import EmpSystem.Service.ServiceImpl.EMSimplement;
import EmpSystem.Service.ServiceImpl.GreetImplement;

public class EmpSystem {
    public static void main(String[] args) {
        int choice=0;
        char ch=' ';
        Scanner sc=new Scanner(System.in);
        GreetImplement gi=new GreetImplement();
        ArrayList<Employee> al=new ArrayList<>();
        EMSimplement emsi=new EMSimplement();
        Employee e1=new Employee(1,"suraj", 20000, "sw engineer");
        Employee e2=new Employee(2, "ram", 30000, "test engineer");
        al.add(e1);
        al.add(e2);
        gi.greet("Welcome to Employee Management System");
        do{
            choice=gi.showOptions();
            switch(choice){            
                case 1:
                    try {
                        emsi.displayEmployees(al);
                    } catch (ResponseException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        emsi.searchEmployee(al);
                    } catch (ResponseException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        emsi.deleteEmployee(al);
                    } catch (ResponseException e) {
                        
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        emsi.addEmployee(al);
                    } catch (ResponseException e) {
                        
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        emsi.updateEmployee(al);
                    } catch (ResponseException e) {
                        
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                default:
                    System.out.println("Do you want to continue: y/n");
                    ch=sc.next().charAt(0);
                    break;

            }

        }while(ch!='n');

    }
}
