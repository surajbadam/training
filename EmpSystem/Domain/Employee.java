package EmpSystem.Domain;

public class Employee {
    private int id;
    private String name;
    private float salary;
    private String designation;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
     public String getName() {
        return name;
    }
     public void setSalary(float salary) {
        this.salary = salary;
    }
     public float getSalary() {
        return salary;
    }
     public void setDesignation(String designation) {
        this.designation = designation;
    }
     public String getDesignation() {
        return designation;
    }
    public Employee(int id,String name,float salary,String designation){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.designation=designation;
    }
    
}
