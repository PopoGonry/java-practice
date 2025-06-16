import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private ArrayList<String> courses;

    public Student() {
        super();
        this.courses = new ArrayList<>();
    }
    public Student(String id, String name, String status, String birthDate, String contact) {
        super(id, name, status, birthDate, contact);
        this.courses = new ArrayList<>();

    }

    public Student(String id, String name, String status, String birthDate, String contact, ArrayList<String> courses) {
        super(id, name, status, birthDate, contact);
        this.courses = courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void printInfo() {
        super.printInfo();
        printCourses();
    }

    public void printCourses() {
        System.out.println("Course List:");

        if(courses.isEmpty()) {
            System.out.println("없음");
            return;
        }

        for (String course: courses) {
            System.out.println(" - " + course);
        }
    }






    //    private String id;
//    private String name;
//    private String status;
//    private String birthdate;
//    private String contact;
//
//    private List<String> courses;
//
//    public Student() {
//        this.id = "";
//        this.name = "";
//        this.status = "";
//        this.birthdate = "";
//        this.contact = "";
//        courses = new ArrayList<>();
//    }
//
//    public Student(String id, String name, String status, String birthdate, String contact) {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthdate = birthdate;
//        this.contact = contact;
//        courses = new ArrayList<>();
//    }
//
//    public void setStudent(String id, String name, String status, String birthdate, String contact) {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthdate = birthdate;
//        this.contact = contact;
//        courses = new ArrayList<>();
//    }
//
//    public void printInfo() {
//        System.out.println("id = " + id);
//        System.out.println("name = " + name);
//        System.out.println("status = " + status);
//        System.out.println("birthdate = " + birthdate);
//        System.out.println("contact = " + contact);
//        printCourses();
//    }
//
//    public void addCourse(String course) {
//        courses.add(course);
//    }
//
//    public void printCourses() {
//        if(courses.isEmpty()) {
//            System.out.println("없음");
//            return;
//        }
//
//        for (String course : courses) {
//            System.out.println(course);
//        }
//
//    }
}
