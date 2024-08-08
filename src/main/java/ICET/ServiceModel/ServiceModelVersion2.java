package ICET.ServiceModel;

import ICET.Interface.StudentInterface;
import ICET.Model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class ServiceModelVersion2 implements StudentInterface {

    List<Student> students = new ArrayList<>();
    public List<Student>getStudent(){
        students.add(new Student("Kamal","23","java","paython"));

    return students;
    }


    public void addStudent(Student student){

    students.add(student);
        }

}




