package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements Service {
    static Integer idGenerator = 1;
    StudyGroup studyGroup = new StudyGroup();


    Integer id;

    public DataServiceImpl() {
        this.id = idGenerator++;


    }

    @Override
    public void create(List<Student> inputList, Teacher teacher) {
        studyGroup.setStudentList(inputList);
        studyGroup.setTeacher(teacher);
    }

    @Override
    public void create(Student inputStudent) {

    }

    @Override
    public void read() {
        System.out.println("group №" + this.id);
        System.out.println(studyGroup.getTeacher());
        for (Student s : studyGroup.getStudentList()) {
            System.out.println("\t" + s);
        }
    }
}
