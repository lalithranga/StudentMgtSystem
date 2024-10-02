package ICET.Controller;

import ICET.TeachersModel.Teachers;
import ICET.services.TeachersImpl.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/teachers")

public class TeacherController {
    final TeacherService teacherService;

    @GetMapping
    public List<Teachers> getTeachers() {

        return teacherService.getTeachers();
    }

    @PostMapping
    public void addTeacher(@RequestBody Teachers teachers){

        teacherService.addTeacher(teachers);
    }

}
