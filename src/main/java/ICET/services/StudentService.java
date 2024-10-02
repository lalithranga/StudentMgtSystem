package ICET.services;

import ICET.studentModel.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public Map getStudent();


    public void addStudent(Student student);

    public void removeStudent(Student student);

    public List<Student> search(Integer age);

    public List<Student> searchStudent(String subject);
}
