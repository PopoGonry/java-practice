import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.printf("입력: ");
        num = sc.nextInt();

        if (1 <= num && num <= 100) {
            System.out.println("1에서 100 사이의 값입니다.");
        }
        else {
            System.out.println("1에서 100 사이의 값이 아닙니다.");
        }
    }
}