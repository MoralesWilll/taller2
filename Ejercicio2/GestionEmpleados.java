
import java.util.ArrayList;

public class GestionEmpleados {

    private ArrayList<Empleado> payroll = new ArrayList<>();

    public void show(){
        for (Empleado e : payroll) {
            System.out.println(e);
        }
    }

    public void addEmployee(Empleado a){
        payroll.add(a);
    }

    public void removeById(int a){
        for (int i = 0; i < payroll.size(); i++) {
            if (payroll.get(i).getEmployeeId() == a){
                payroll.remove(i);
            }
        }
    }

}