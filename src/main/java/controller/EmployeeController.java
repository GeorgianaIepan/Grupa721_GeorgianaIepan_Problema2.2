package controller;

import model.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeController implements ICrudRepo {
    private List<Employee> employeeList;

    public EmployeeController(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public Employee findOne(int id) {
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getemployeeId(), id))
                return employee;
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void create(Object entity) {
        Employee employee = new Employee();
        employeeList.add(employee);
    }

    @Override
    public void update(int id) {
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getemployeeId(), id)) {
                employee.setName(employee.getName());
                employee.setLohn(employee.getLohn());
                employee.setStundenProWoche(employee.getStundenProWoche());
            }
        }
    }

    @Override
    public void delete(int id) {
        employeeList.removeIf(employee -> Objects.equals(employee.getemployeeId(), id));
    }

    public List<Employee> filterEmployeesByName(String name) {
        return employeeList.stream().filter(employee -> employee.getName().contains(name))
                .collect(Collectors.toList());
    }
}