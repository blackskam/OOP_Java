package model;

import java.util.List;

public class StudyGroup {
    List<Student> studentList;
    Teacher teacher;


    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudyGroup() {
        this.studentList = studentList;
        this.teacher = teacher;

    }

}
