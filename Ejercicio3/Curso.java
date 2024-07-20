
import java.util.ArrayList;

public class Curso {

    private int code;
    private String name;
    private ArrayList<Estudiante> list = new ArrayList<>();

    public Curso(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void show(){
        for (Estudiante list1 : list) {
            System.out.println(list1);
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Estudiante> getList() {
        return list;
    }

    public void setList(ArrayList<Estudiante> list) {
        this.list = list;
    }

    public void addStudentToCourse(Estudiante a){
        list.add(a);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }

}