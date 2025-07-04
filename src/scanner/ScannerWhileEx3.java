package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        //while((num = scanner.nextInt()) != -1) { } 로 코드를 작성할 수 있다.
        while (true) {
            int num = input.nextInt();

            count++;

            if (num == -1) {
                break;
            }

            sum = sum + num;
            avg = (double) sum / count;

        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
