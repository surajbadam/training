package EmpSystem.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

import EmpSystem.Domain.Employee;
import EmpSystem.Exception.ResponseException;
import EmpSystem.Service.EMS;

public class EMSimplement implements EMS{
    Scanner sc=new Scanner(System.in);
    public void displayEmployees(ArrayList<Employee> al) throws ResponseException{
        if(al.isEmpty()){
            throw new ResponseException("No employees please insert Employees");
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println("id:"+al.get(i).getId());
            System.out.println("name:"+al.get(i).getName());
            System.out.println("designation:"+al.get(i).getDesignation());
            System.out.println("salary:"+al.get(i).getSalary());
        }
        
    }
    
    public void addEmployee(ArrayList<Employee> al) throws ResponseException{
        //Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter Salary :");
        float salary = sc.nextFloat();
        System.out.println("Enter Designation:");
        String designation=sc.next();
        Employee emp=new Employee(id, name, salary, designation);
        for(int i=0;i<al.size();i++)
        {
            if(id==al.get(i).getId()){
                throw new ResponseException("an Employee is already present with existing id");
            }
        }
        al.add(emp);    
    }
    
    public void searchEmployee(ArrayList<Employee> al) throws ResponseException {
        //Scanner sc=new Scanner(System.in);
        int choice=0;
        char ch=' ';
        boolean flag=false;
        if(al.isEmpty())
            throw new ResponseException("No Employees present to search");
        do{
            System.out.println("1.search based on ID");
            System.out.println("2.Search based on name");
            System.out.println("3.Search based on designation");
            System.out.println("4.search based on salary");
            choice=sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter id: ");
                        int id=sc.nextInt();
                        for(int i=0;i<al.size();i++)
                        {
                            if(id==al.get(i).getId()){
                                System.out.println("id: "+id+"  Name: "+al.get(i).getName()
                                +"  Designation: "+al.get(i).getDesignation()+"  Salary: "+al.get(i).getSalary());
                                flag=true;
                            }
                        }
                        
                        break;
                case 2: System.out.println("Enter name:");
                        String name=sc.next();
                        al.forEach(employee->{
                            if(name.equalsIgnoreCase(employee.getName())){
                                print(employee);
                                
                            }
                        });
                        flag=true;
                        break;
                case 3: System.out.print("Enter designation: ");
                        String designation=sc.next();
                        al.forEach(employee->{
                            if(designation.equalsIgnoreCase(employee.getDesignation())){
                                print(employee);
                                
                            }
                        });
                        flag=true;
                        break;
                case 4: System.out.println("Enter salary:");
                        float salary=sc.nextFloat();
                        al.forEach(employee-> {
                            if(salary==employee.getSalary()){
                                print(employee);
                               
                            }
                        });
                        flag=true;
                        break;
                default:
                        throw new  ResponseException("Please choose a valid option");
            }
            if(flag==true)
                System.out.println("search Successful");
            else
                throw new ResponseException("No Employee present with provided details");
        }while(ch!='n');
        
    }
    
    private void print(Employee employee) {
        System.out.println("Id: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: " + employee.getSalary() + "\n");
    }

    public void deleteEmployee(ArrayList<Employee> al) throws ResponseException{
        boolean flag=false;
        //Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the employee Id to delete");
        int id=sc.nextInt();
        if(al.isEmpty())
            throw new ResponseException("No Employee present"); 
        for(Employee e:al){
            if(e.getId()==id){
                al.remove(e);
                flag=true;
            }
        }
        
        if(flag==true)
            System.out.println("Deletion done successfully");
        else
            throw new ResponseException("No employee is present with given id");
    }
    
    public void updateEmployee(ArrayList<Employee> al) throws ResponseException{
        System.out.println("Please enter the Employee id you want to update");
        //Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        boolean flag=false;
        if(al.isEmpty())
            throw new ResponseException("No Employee present to Update");
        System.out.println("choose the option which you want to update");
        System.out.println("1.name\t2.Designation\t3.Salary");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println("Please Enter Employee name:");
                    String name=sc.next();
                    al.forEach(employee -> {
                        if(employee.getId()==id)
                            employee.setName(name);
                    } );
                    flag=true;
                    break;
            case 2:System.out.println("Please enter Employee designation:");
                    String designation=sc.next();
                    al.forEach(employee->{
                        if(employee.getId()==id)
                            employee.setDesignation(designation);
                    });
                    flag=true;
                    break;
            case 3:System.out.println("Please enter Employee Salary:");
                    float salary=sc.nextFloat();
                    al.forEach(employee->{
                        if(employee.getId()==id){
                            if(salary<employee.getSalary()){
                                try {
                                    throw new ResponseException("Salary can't be decreased");
                                } catch (ResponseException e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                            else{
                                employee.setSalary(salary);
                            }
                        }
                    });
                    flag=true;
                    break;    
        }
        if(flag==true)
            System.out.println("Updated Successfully");
        else
            throw new ResponseException("No field present with provided details");
        
    }
    
}
