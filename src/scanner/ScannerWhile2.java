package scanner;

import java.util.Scanner;
public class ScannerWhile2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            //if (num1 == 0 && num2 ==0) { } 이렇게 코드를 작성함
            if ((num1 + num1) == 0 ) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            //int sum = num1 + num2
            //System.out.println("두 숫자를 더한 합은: " + sum); 으로 해도 된다.
            System.out.print("두 숫자를 더한 합은: ");
            System.out.println(num1 + num2);

        }

    }
}
