import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, n = 0;

        System.out.printf("숫자를 입력하세요: ");
        n =  sc.nextInt();

        if(n <= 0) {
            System.out.println("양의 정수의 입력만 가능합니다.");
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) sum += i;
        }

        System.out.println("홀수의 합: " + sum);
    }
}
