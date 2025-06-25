package scanner;

import java.util.Scanner;

public class ScannerWhile4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("숫자 0을 입력하기 전까지의 누적합을 계산합니다.");

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int num = input.nextInt();

            sum = sum + num;
            if (num == 0){
                break;
            }
            System.out.println("지금까지의 합은: " + sum);
        }
    }
}
