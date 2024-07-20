public class Empleado extends Persona{

    private int employeeId;
    private Double salary;

    public Empleado(int employeeId, Double salary, int age, String name) {
        super(age, name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
    
}