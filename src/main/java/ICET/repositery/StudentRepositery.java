package ICET.repositery;

import ICET.studentModel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepositery extends JpaRepository<Student,Integer> {

    List<Student> findByAge(Integer age);

    List<Student> findBysubject(String subject);


}
