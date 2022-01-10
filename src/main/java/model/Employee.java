package model;

public class Employee {
    private int employeeId;
    private String name;
    private float lohn;
    private int stundenProWoche;

    public Employee(int employeeId, String name, float lohn, int stundenProWoche) {
        this.employeeId = employeeId;
        this.name = name;
        this.lohn = lohn;
        this.stundenProWoche = stundenProWoche;
    }

    public Employee() {
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLohn() {
        return lohn;
    }

    public void setLohn(float lohn) {
        this.lohn = lohn;
    }

    public int getStundenProWoche() {
        return stundenProWoche;
    }

    public void setStundenProWoche(int stundenProWoche) {
        this.stundenProWoche = stundenProWoche;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", lohn=" + lohn +
                ", stundenProWoche=" + stundenProWoche +
                '}';
    }
}
