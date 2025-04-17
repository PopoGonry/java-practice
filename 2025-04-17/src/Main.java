import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selectNumber = 0, totalPrice = 0;

        System.out.print("음료를 선택하세요 (1-아메리카노, 2-카페라떼, 3-카푸치노): ");
        selectNumber = scanner.nextInt();
        if(selectNumber == 1) {
            totalPrice += 3000;
        }
        else if(selectNumber == 2) {
            totalPrice += 4000;
        }
        else if(selectNumber == 3) {
            totalPrice += 4500;
        }
        else {
            System.out.println("지원하지 않는 선택지 입니다.");
            return;
        }

        System.out.print("크기를 선택하세요 (1-Small, 2-Medium, 3-Large): ");
        selectNumber = scanner.nextInt();
        if(selectNumber == 1) {
            // 기본 옵션 추가 금액 X
        }
        else if(selectNumber == 2) {
            totalPrice += 500;
        }
        else if(selectNumber == 3) {
            totalPrice += 1000;
        }
        else {
            System.out.println("지원하지 않는 선택지 입니다.");
            return;
        }

        System.out.print("옵션을 선택하세요 (1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가): ");
        selectNumber = scanner.nextInt();
        if(selectNumber == 1) {
            // 기본 옵션 추가 금액 X
        }
        else if(selectNumber == 2) {
            totalPrice += 500;
        }
        else if(selectNumber == 3) {
            totalPrice += 300;
        }
        else if(selectNumber == 4) {
            totalPrice += 800;
        }
        else {
            System.out.println("지원하지 않는 선택지 입니다.");
            return;
        }

        System.out.println("최종 가격은 " + totalPrice + "원입니다.");
    }
}