import java.util.Arrays;
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("숫자 두개를 입력하세요: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("sum = " + (num1 + num2));
    }
}
