package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCost = 0;

        //option값이 정확히 정해지기 때문에 if문 대신 switch문 사용이 가능하다.
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine(); //nextLine()이 \n을 값으로 가져가기에 필요하다.

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                //이렇게 코드를 작성하면 sum 변수를 선언하지 않아도 됨, 이미 totalCost가 0 값으로 시작하기 때문
                // totalCost += price * quantity로 가능
                // totalCost = totalCost + price * quantity
                int sum = price * quantity;
                totalCost = sum + totalCost;

                System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + quantity + " 합계: " + sum);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;

            } else if (option == 3){
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }
}
