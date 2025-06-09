import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        Student student1 = new Student();
//        student1.setStudent("2022014446", "홍길동", "재학", "2005-12-25", "010-2227-0324");
//
        Student student1 = new Student("2022014446", "홍길동", "재학", "2005-12-25", "010-2227-0324");

        student1.addCourse("JAVA 프로그래밍1");
        student1.addCourse("데이터통신");
        student1.addCourse("자료구조");

        student1.printInfo();

    }
}