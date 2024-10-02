package ICET.services.StudentImpl;

import ICET.studentModel.Student;

import ICET.repositery.NativeStudentRepositery;
import ICET.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ICET.repositery.StudentRepositery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {


   final StudentRepositery repositery;
   final NativeStudentRepositery nativeStudentRepositery;


    public Map getStudent(){
        List<Student>all =repositery.findAll();
        Long getTotalCount= nativeStudentRepositery.getRecordCount();

        Map response=new HashMap<>();

        response.put("studentList",all);
        response.put("totalCount",getTotalCount);

        return response;

    }


    public void addStudent(Student student){
        repositery.save(student);
    }

    public void removeStudent(Student student){
        repositery.delete(student);
    }

    public List<Student> search(Integer age) {
        List<Student> students = repositery.findByAge(age);
        System.out.println("Student(s) with age " + age + ":");
        for (Student student : students) {
            System.out.println(student);
        }
    return students;
    }


    public List<Student> searchStudent(String subject){
        List<Student> student=repositery.findBysubject(subject);

        return student;
    }
}




