package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            //sum += arr[i]; 를 이곳에 작성하면 밑의 for문을 한번 더 작성하지 않아도 된다.
        }
        for (int i : arr) {
            sum += i;
        }

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.print("입력한 정수의 평균: " + (double) sum / arr.length);
    }
}
