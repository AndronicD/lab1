package task2;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Course curs = new Course();
        Student stud_1 = new Student();
        Student stud_2 = new Student();
        Student stud_3 = new Student();
        Student[] studenti_init = new Student[3];
        stud_1.setYear(2020);
        stud_1.setName("Vladimir");
        stud_2.setYear(2020);
        stud_2.setName("Boris");
        stud_3.setYear(2021);
        stud_3.setName("Igor");
        curs.setTitle("Programare");
        curs.setDescription("Descriere");
        studenti_init[0] = stud_1;
        studenti_init[1] = stud_2;
        studenti_init[2] = stud_3;
        curs.setStudents(studenti_init);
        Integer param = Integer.parseInt(args[0]);
        ArrayList<Student> student_arr = new ArrayList<Student>();
        student_arr = curs.filteryear(param);
        for(int i = 0; i < student_arr.size(); i++){
            System.out.println(student_arr.get(i).getName());
        }
        Student student1_task3 = new Student();
        student1_task3.setName("Yuri");
        student1_task3.setYear(1990);
        Student student2_task3 = new Student();
        student2_task3.setName("Yuri");
        student2_task3.setYear(1990);
        System.out.println("Comparatie primele doua: " + student1_task3.equals(student2_task3));
    }
}
