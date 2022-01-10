package model;


import java.util.List;

public class Office {
    private int officeId;
    private String ort;
    private List<Employee> employeeList;

    public Office(int officeId, String ort, List<Employee> employeeList) {
        this.officeId = officeId;
        this.ort = ort;
        this.employeeList = employeeList;
    }

    public Office() {

    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeId=" + officeId +
                ", ort='" + ort + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
