import java.util.Scanner;

public class Main {
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public void printCircleInfo() {
        System.out.println("반지름: " + radius);
        System.out.println("넓이: " + calculateArea());
    }

    public int inputRadius() {
        Scanner sc = new Scanner(System.in);
        int radius;
        while(true) {
            System.out.print("0보다 큰 값을 입력하세요: ");
            radius = sc.nextInt();
            if(radius > 0) {
                return radius;
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.setRadius(main.inputRadius());
        main.printCircleInfo();
    }
}