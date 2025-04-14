import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        int socre = 0;
        String grade = "";

        System.out.print("점수를 입력하세요: ");
        socre = scanner.nextInt();

        if(socre >= 90) {
            grade = "A";
        }
        else if(socre >= 80) {
            grade = "B";
        }
        else if(socre >= 70) {
            grade = "C";
        }
        else if(socre >= 60) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("학점: " + grade);
        scanner.close();
    }
}