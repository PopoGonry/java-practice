import java.util.ArrayList;

public class Professor extends Person {

    private ArrayList<String> lectures;

    public Professor() {
        super();
        this.lectures = new ArrayList<>();
    }

    public Professor(String id, String name, String status, String birthDate, String contact) {
        super(id, name, status, birthDate, contact);
        this.lectures = new ArrayList<>();
    }

    public void addLecture(String lecture) {
        this.lectures.add(lecture);
    }

    public void printInfo() {
        super.printInfo();
        printLectures();
    }

    public void printLectures() {
        System.out.println("Lecture List:");

        if(lectures.isEmpty()) {
            System.out.println("없음");
            return;
        }

        for (String course: lectures) {
            System.out.println(" - " + course);
        }
    }
}
