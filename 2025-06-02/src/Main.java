import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("2022000000", "고성노", "재학", "2003-03-05", "010-0000-0000");

        student.addCourse("Jave");
        student.addCourse("Python");

        System.out.println("학생의 정보");
        student.printInfo();

        Professor professor = new Professor("2022000000", "고성노", "재직", "2003-03-05", "010-0000-0000");

        professor.addLecture("Java");
        professor.addLecture("Application Security");

        System.out.println("교수의 정보");
        professor.printInfo();
    }
}