public class EmpleadoTemporal extends Empleado {

    private int monthsLeft;

    public EmpleadoTemporal(int monthsLeft, int employeeId, Double salary, int age, String name) {
        super(employeeId, salary, age, name);
        this.monthsLeft = monthsLeft;
    }

    public int getMonthsLeft() {
        return monthsLeft;
    }

    public void setMonthsLeft(int monthsLeft) {
        this.monthsLeft = monthsLeft;
    }

}