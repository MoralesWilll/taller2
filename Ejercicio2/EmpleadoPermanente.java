public class EmpleadoPermanente extends Empleado {

    private int monthsWorked;

    public EmpleadoPermanente(int monthsWorked, int employeeId, Double salary, int age, String name) {
        super(employeeId, salary, age, name);
        this.monthsWorked = monthsWorked;
    }

    public int getMonthsWorked() {
        return monthsWorked;
    }

    public void setMonthsWorked(int monthsWorked) {
        this.monthsWorked = monthsWorked;
    }

}