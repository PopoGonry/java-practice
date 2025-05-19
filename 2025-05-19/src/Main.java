import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, num = 0;

        while (true) {
            System.out.printf("점수를 입력하세요 (종료하려면 음수를 입력): ");
            num = scanner.nextInt();
            if (num < 0) break;
            sum += num;
        }

        if(sum == 0) {
            System.out.println("입력된 점수가 없습니다.");
        }
        else {
            System.out.println("점수의 총합은: " + sum);
        }
    }
}