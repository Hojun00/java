package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int dan = input.nextInt();

        for (int i = 1; i < 10; i++) {
            int multi = dan * i;
            System.out.println(dan + " X " + i + " = " + multi);
        }
        System.out.println("구구단 출력 종료");
    }
}
