package ICET.ServiceModel;

import ICET.Interface.StudentInterface;
import ICET.Model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ServiceModel implements StudentInterface {

    List<Student> students = new ArrayList<>();
    public List<Student>getStudent(){
        students.add(new Student("lalith","23","java","paython"));

    return students;
    }


    public void addStudent(Student student){

    students.add(student);
        }

}




