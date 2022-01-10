import controller.EmployeeController;
import controller.OfficeController;
import model.Employee;
import model.Office;
import view.Console;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        List<Office> officeList = new ArrayList<>();
        EmployeeController employeeController = new EmployeeController(employeeList);
        OfficeController officeController = new OfficeController(officeList);
        Console console = new Console(employeeController, officeController);
        console.run();
    }
}