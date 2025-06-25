package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        //2차원 배열의 초기화
        int[][] arr = new int[3][3];

        // 리펙토링: 이렇게 하면 직접 값을 작성하지 않고도 배열에 1씩 증가하는 값을 저장할 수 있다.
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        //리펙토링
        for (int row = 0; row < arr.length; row++) {
           for (int column = 0; column < arr[row].length; column++) {
               System.out.print(arr[row][column] + " ");

           } System.out.println(" ");

        }

    }
}
