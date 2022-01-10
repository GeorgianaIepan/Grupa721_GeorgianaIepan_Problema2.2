package view;

import controller.EmployeeController;
import controller.OfficeController;
import model.Employee;
import model.Office;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    private EmployeeController employeeController;
    private OfficeController officeController;

    public Console(EmployeeController employeeController, OfficeController officeController) {
        this.employeeController = employeeController;
        this.officeController = officeController;

        Employee employee= new Employee(1, "Iepan Georgiana", 4500, 30);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        Office office = new Office(11, "Cluj", employeeList);

        employeeController.create(employee);
        officeController.create(office);
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("""
                     0. Exit Program \r
                     -------------------------
                     1. Show all employees \r
                     2. Add an employee \r
                     3. Delete an employee \r
                     4. Update an employee \r
                     5. Filter Employees by name \r
                    """);
            System.out.println("Enter decision: ");
            int variant = scanner.nextInt();
            switch (variant) {
                case 0:
                    break loop;
                case 1:
                    getAllEmployees();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5: {
                    System.out.println("Enter a name: ");
                    String name = scanner.nextLine();
                    employeeController.filterEmployeesByName(name).forEach(System.out::println);
                }

            }
        }
    }
    private void getAllEmployees() {
        System.out.println(employeeController.findAll());
    }
    private void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee id:");
        int employeeId = scanner.nextInt();
        System.out.println("Enter name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter lohn:");
        float lohn = scanner.nextFloat();
        System.out.println("Enter anzahl der stunden pro woche:");
        int stundenProWoche = scanner.nextInt();
        Employee employee = new Employee(employeeId, name, lohn, stundenProWoche);
        employeeController.create(employee);
    }

    private void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        int employeeId = scanner.nextInt();
        System.out.println("Enter name:");
        employeeController.delete(employeeId);
    }

    private void updateEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee id:");
        int employeeId = scanner.nextInt();
        System.out.println("Enter new name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter new lohn:");
        float lohn = scanner.nextFloat();
        System.out.println("Enter new anzahl der stunden pro woche:");
        int stundenProWoche = scanner.nextInt();
        Employee employee = new Employee(employeeId, name, lohn, stundenProWoche);
        employeeController.update(employeeId);
    }

}