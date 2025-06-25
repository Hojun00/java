package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("출력");
        for (int j = (arr.length -1); j < arr.length; j--) {
            if (j == 0) {
                System.out.print(arr[j]);
                break;
            }
            System.out.print(arr[j] + ", ");
        }
    }
}
