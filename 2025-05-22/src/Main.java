import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = 0, column = 0;
        int selectRow = 0, selectColumn = 0;

        System.out.print("행을 입력해주세요: ");
        row = scanner.nextInt();

        System.out.print("열을 입력해주세요: ");
        column = scanner.nextInt();

        int[][] seats = new int[row][column];

        while (true) {
            System.out.println("예약 할 좌석을 입력해주세요. (종료: 0 0 )");

            System.out.print("예약할 좌석 행 입력 (1 ~ " + row + ") ");
            selectRow = scanner.nextInt();
            System.out.print("예약할 좌석 열 입력 (1 ~ " + row + ") ");
            selectColumn = scanner.nextInt();

            if(selectRow == 0 && selectColumn == 0) break;

            if(selectRow < 1 || selectColumn < 1 || selectRow > row || selectColumn > column) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            if(seats[selectRow-1][selectColumn-1] == 0) {
                seats[selectRow - 1][selectColumn - 1] = 1;
                System.out.println("예약 완료 되었습니다.");
            }
            else {
                System.out.println("이미 예약되어 있는 좌석입니다.");
            }
        }

        System.out.println("--- 좌석 예약 현황 ---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}