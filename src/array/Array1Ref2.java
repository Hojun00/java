package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성

        int[] array = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화를 해서 사전에 배열의 크기와 값을 설정할 수 있다.
        int[] array2 = {90, 80, 70, 60, 50}; // 이렇게도 생성 가능

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 리팩토링: 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고 유지보수를 용이하게 하는 과정, 쉽게 이야기해서 작동하는 기능은 똑같은데 코드를 개선하는 것 이다.
        // 배열은 배열명.length를 사용해서 배열의 크기를 구할 수 있다.
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수는 " + students[i]);
        }
    }
}
