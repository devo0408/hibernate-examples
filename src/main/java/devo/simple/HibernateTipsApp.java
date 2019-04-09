package devo.simple;

import devo.simple.data.Student;
import devo.simple.data.StudentDao;

import java.util.List;

public class HibernateTipsApp {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        studentDao.saveStudent(student);
        List< Student > students = studentDao.getStudents();
        // students.forEach(s - > System.out.println(s.getFirstName()));

    }

}
