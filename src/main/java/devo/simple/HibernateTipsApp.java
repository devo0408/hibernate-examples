package devo.simple;

import devo.simple.data.Student;
import devo.simple.data.StudentDao;

import java.util.List;

public class HibernateTipsApp {

    // https://dzone.com/articles/hibernate-5-xml-configuration-example
    // https://proselyte.net/tutorials/hibernate-tutorial/configure/
    // https://dzone.com/articles/simplified-spring-swagger
    // https://stackoverflow.com/questions/23908606/how-to-use-hibernate-properties-file-instead-of-hibernate-cfg-xml

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Ivan", "Ivanov", "ivanov@gmail.com");
        studentDao.saveStudent(student);
        List< Student > students = studentDao.getStudents();
        students.forEach(System.out::println);
    }

}
