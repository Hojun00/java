package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            int age = input.nextInt(); // 예를 들어 10을 입력하면 10\n 을 입력받는다. 그렇기에 input.nextInt();가 10만 가져가서 \n이 남기때문에
            input.nextLine(); // 여기서 \n을 가져가서 다음 반복문의 변수 값에 영향을 미치지않게해야한다.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }

    }
}
