package ICET.Controller;

import ICET.Interface.StudentInterface;
import ICET.Model.Student;
import ICET.ServiceModel.ServiceModel;
import ICET.ServiceModel.ServiceModelVersion2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class Controller {

    @Autowired
    StudentInterface service;



    @GetMapping("/get_data")
    public List<Student> getStudents(){

       return service.getStudent();
    }
    @PostMapping("/add_data")
    public void addStudent(@RequestBody Student student){

        service.addStudent(student);

    }

}
