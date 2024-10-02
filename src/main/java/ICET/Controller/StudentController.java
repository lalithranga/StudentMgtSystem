package ICET.Controller;

import ICET.services.StudentService;
import ICET.studentModel.Student;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("students")
@Slf4j
public class StudentController {

    final StudentService service;

    @GetMapping
    public Map getStudents() {

        return service.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student, HttpServletRequest request) throws IllegalAccessException {


        String os = request.getHeader("Location");
        if ("windows".equals(os)) {
            throw new IllegalAccessException("Not supported on Windows");
        }
        service.addStudent(student);
        log.info("Adding student: {} / {}", student, os);
    }

    @DeleteMapping("/{age}")
    public void removeStudent(@RequestBody Student student) {
        service.removeStudent(student);
    }

    @PatchMapping("/{age}")
    public List<Student> search(@PathVariable Integer age) {

        return service.search(age);
    }

}


