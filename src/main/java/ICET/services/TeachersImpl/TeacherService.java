package ICET.services.TeachersImpl;

import ICET.TeachersModel.Teachers;

import java.util.List;

public interface TeacherService {

    public List<Teachers> getTeachers();
    public void addTeacher(Teachers teacher);

}

