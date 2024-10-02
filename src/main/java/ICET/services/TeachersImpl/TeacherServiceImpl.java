package ICET.services.TeachersImpl;

import ICET.TeachersModel.Teachers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    List<Teachers> teachersList=new ArrayList<>();

    public List<Teachers> getTeachers(){

         teachersList.add(new Teachers(1,
                "Lalith",
                "maths"));
         return teachersList;
    }

    public void addTeacher(Teachers teacher){

        teachersList.add(teacher);
    }
}
