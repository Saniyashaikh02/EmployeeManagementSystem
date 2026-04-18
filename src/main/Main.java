package main;

import java.util.Scanner;

import model.Employee;
import service.EmployeeService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            if (sc.hasNextInt()) {

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        service.addEmployee(new Employee(id, name, salary));
                        break;

                    case 2:
                        service.viewEmployees();
                        break;

                    case 3:
                        System.out.print("Enter ID: ");
                        service.searchEmployee(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();

                        service.updateEmployee(uid, newName, newSalary);
                        break;

                    case 5:
                        System.out.print("Enter ID: ");
                        service.deleteEmployee(sc.nextInt());
                        break;

                    case 6:
                        System.out.println("Exit...");
                        return;
                }

            } else {
                System.out.println("Invalid input!");
                sc.next();
            }
        }
    }
}