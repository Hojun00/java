package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        //리펙토링
        for (int row = 0; row < 2; row++) {
           for (int column = 0; column < 3; column++) {
               System.out.print(arr[row][column] + " ");
           }

        }

    }
}
