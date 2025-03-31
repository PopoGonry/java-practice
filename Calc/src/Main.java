import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("숫자 3개를 입력하세요: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        int result = num1 - num2 - num3;
        System.out.println("result = " + result);
    }
}   