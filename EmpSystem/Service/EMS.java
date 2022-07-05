package EmpSystem.Service;

import java.util.ArrayList;

import EmpSystem.Domain.Employee;
import EmpSystem.Exception.ResponseException;

public interface EMS {
    void displayEmployees(ArrayList<Employee> al) throws ResponseException;
    void addEmployee(ArrayList<Employee> al) throws ResponseException;
    void searchEmployee(ArrayList<Employee> al) throws ResponseException;
    void deleteEmployee(ArrayList<Employee> al) throws ResponseException;
    void updateEmployee(ArrayList<Employee> al) throws ResponseException;
}
