package service;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeService {

    private EmployeeDAO dao = new EmployeeDAO();

    // Add Employee
    public void addEmployee(Employee emp) {
        dao.addEmployee(emp);
    }

    // View Employees
    public void viewEmployees() {
        dao.viewEmployees();
    }

    // Search
    public void searchEmployee(int id) {
        dao.searchEmployee(id);
    }

    // Update
    public void updateEmployee(int id, String name, double salary) {
        dao.updateEmployee(id, name, salary);
    }

    // Delete
    public void deleteEmployee(int id) {
        dao.deleteEmployee(id);
    }
}