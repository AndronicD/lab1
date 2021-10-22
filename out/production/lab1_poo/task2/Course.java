package task2;
import java.util.ArrayList;

public class Course {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Student[] students = new Student[3];

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    ArrayList<Student> filteryear(Integer param){
        ArrayList<Student> students_new = new ArrayList<Student>();
        for(int i = 0; i < students.length; i++){
            if(students[i].getYear().equals(param)){
                students_new.add(students[i]);
            }
        }
        return students_new;
    }
}
