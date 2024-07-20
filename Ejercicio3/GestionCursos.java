
import java.util.ArrayList;

public class GestionCursos {

    private ArrayList<Curso> CourseList = new ArrayList<>();

    public void addCourse(int code, String name) {
        Curso newCourse = new Curso(code, name);
        CourseList.add(newCourse);
    }

    public void addStudent(Estudiante e, Curso c){
        for (int i = 0; i < CourseList.size(); i++) {
            if(CourseList.get(i).getCode() == c.getCode()){
                CourseList.get(i).addStudentToCourse(e);
            }
        }
    }

    public void showCourses(){
        for (int i = 0; i < CourseList.size(); i++) {
            System.out.println(CourseList.get(i).toString());
        }
    }

    public void showStudents(Curso c){
        int f = -1;
        for (int i = 0; i < CourseList.size(); i++) {
            if(CourseList.get(i).getCode() == c.getCode()){
                f = i;
            }
        }
        if(f != -1){
            CourseList.get(f).show();
        }
    }

}