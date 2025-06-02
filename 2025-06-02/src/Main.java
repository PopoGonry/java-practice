import java.util.ArrayList;

public class Main {
    final static int studentNum = 3;

    public static String[][] students = new String[studentNum][5];
    public static ArrayList<String>[] courseLists = new ArrayList[studentNum];


    public static void main(String[] args) {

        for (int i = 0; i < courseLists.length; i++) {
            courseLists[i] = new ArrayList<>();
        }

        setStudents(0, "2022011869", "고성노", "재학", "2003-03-05", "010-3442-0241");
        setStudents(1, "2022014446", "홍길동", "재학", "2005-12-25", "010-2227-0324");
        setStudents(2, "2022034312", "이순신", "재학", "2013-05-25", "010-3347-0230");

        addCourse(0, "자료구조");
        addCourse(0, "Java 프로그래밍1");
        addCourse(0, "운영체제");
        addCourse(0, "데이터 통신");
        removeCourse(0, "운영체제");

        addCourse(1, "자료구조");
        addCourse(1, "Java 프로그래밍1");
        addCourse(1, "운영체제");
        addCourse(1, "데이터 통신");
        removeCourse(1, "자료구조");

        addCourse(2, "자료구조");
        addCourse(2, "Java 프로그래밍1");
        addCourse(2, "운영체제");
        addCourse(2, "데이터 통신");
        removeCourse(2, "데이터 통신");

        printAllStudents();
//        printStudentInfo(1);
    }
    public static void setStudents(int index, String id, String name, String status, String birthdate, String contact) {
        students[index][0] = id;
        students[index][1] = name;
        students[index][2] = status;
        students[index][3] = birthdate;
        students[index][4] = contact;
    }

    public static void setCourseLists(int index, ArrayList<String> courseList) {
        courseLists[index] = courseList;
    }

    public static void addCourse(int index, String courseName) {
        courseLists[index].add(courseName);
    }

    public static void removeCourse(int index, String courseName) {
        courseLists[index].remove(courseName);
    }

    public static int getCourseCount(int index) {
        return courseLists[index].size();
    }

    public static void printAllStudents() {
        System.out.println("\n==== 학생 정보 ====");
        for (int i = 0; i < students.length; i++) {
            printStudentInfo(i);
        }
    }

    public static void printStudentInfo(int index) {
        System.out.println("=== " + students[index][1] + " ===");
        for (String s : students[index]) {
            System.out.println(s);
        }
        System.out.println("\n<수강 정보 / 총 과목수: " + getCourseCount(0) + "개>");

        if(courseLists[index].isEmpty()) System.out.println("없음");
        else for (String s : courseLists[index]) System.out.println(s);
        System.out.println("\n");
    }
}