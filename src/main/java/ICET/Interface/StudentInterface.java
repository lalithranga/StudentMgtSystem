package ICET.Interface;

import ICET.Model.Student;

import java.util.List;

public interface StudentInterface {

    public List<Student> getStudent();

    public void addStudent(Student student);
}
