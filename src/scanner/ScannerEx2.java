package scanner;

import  java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요: ");
        int num = input.nextInt();

        if ((num % 2) == 0) {
            System.out.println("입력한 숫자 " + num + "은 짝수입니다.");
        }
        System.out.println("입력한 숫자 " + num + "은 홀수입니다.");
    }
}
