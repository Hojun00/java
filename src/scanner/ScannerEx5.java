package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = input.nextInt();

        int temp = (num1 > num2) ? num1 : num2;

        System.out.print("두 숫자 사이의 모든 정수: ");

        // num1이 num2보다 큰 경우, 두 숫자를 교환하는 if문을 추가하면 else없이 for문을 한번만 사용해서 코드 작성 가능
        if (num1 > num2) {
            for (int i = num2; i < num1; i++) {
                System.out.print(i + ", ");
            }
        } else {
            for (int i = num1; i < num2; i++) {
                System.out.print(i + ", ");
            }
        } System.out.print(temp);


    }
}
