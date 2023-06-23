import controller.Controller;
import model.Disciples;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher sensei = new Teacher("Shumaher", 1968, Disciples.GEOGRAPHY);

        Student katya = new Student("Ivanov", 2000);
        Student vasya = new Student("Petrov", 1995);
        Student kirill = new Student("Sidorov", 1998);

        List<Student> list = new ArrayList<>(Arrays.asList(katya, vasya, kirill));

        controller.create(list,sensei);
        controller.read();
    }
}