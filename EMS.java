import java.util.ArrayList;
import java.util.Scanner;

public class EMS {
    
    public static void main(String[] args) {
        //Employee e[]=new Employee[100];
        Employee emp;
        ArrayList<Employee> al=new ArrayList<>();
        char ch=' ';
        int count=0;
        do{
            System.out.println("Employee Management System");
            System.out.println("1.Add a new Employee");
            System.out.println("2.Search employee with his id");
            System.out.println("3.Display all employee records");
            System.out.println("4.Delete record of a particular employee");
            System.out.println("5.Update record of an Employee");
            System.out.println("6.exit from the menu");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1: AddEmployee ae=new AddEmployee();
                        try {
                            ae.createEmployee(al);
                        } catch (Exception e) {
                            
                        }    
                case 2:System.out.println("search for an employee");
                        int id_search=sc.nextInt();
                        int k=0;
                        try {
                            for(int i=0;i<e.length;i++)
                            {
                                if(e[i].getId()==id_search)
                                {
                                    System.out.println("id: "+id_search);
                                    System.out.println("name: "+e[i].getName());
                                    System.out.println("salary: "+e[i].getSalary());
                                    System.out.println("Designation: "+e[i].getDesignation());
                                    k++;
                                }
                            }
                            if(k==0)
                                System.out.println("Employee Details are not available, Please enter a valid ID!!");
                        } catch (Exception ex) {
                            //TODO: handle exception
                            ex.printStackTrace();
                        }
                        break;
                case 3: Display(e);
                        break;
                case 4: System.out.println("Enter Employee Id to delete:");
                        

                case 5:System.out.println("");

                case 6:

                default:
                    System.out.println("Do you want to continue:y/n");
                    ch=sc.next().charAt(0);
            }
        }while(ch!='n');
    }
    public static void Display(Employee e[]){
        for(int i=0;i<e.length;i++)
        {
            System.out.println("id: "+ e[i].getId());
            System.out.println("name: "+e[i].getName());
            System.out.println("salary: "+e[i].getSalary());
            System.out.println("Designation: "+e[i].getDesignation());
        }   
    }
}
