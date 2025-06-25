package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성

        int[] array = new int[5]; //배열의 각 칸은 인덱스라 부르고 0번 인덱스, 1번 인덱스 ~ 4번 인덱스까지 있다.,실제로 array 배열 변수에는 new int[5]의 첫번째 메모리 저장 주소 값이 저장되어있다.

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        // 이건 for문으로 불가, 변수명도 변경되기 때문에 불가능
        System.out.println("student1 점수 = " + students[0]);
        System.out.println("student2 점수 = " + students[1]);
        System.out.println("student3 점수 = " + students[2]);
        System.out.println("student4 점수 = " + students[3]);
        System.out.println("student5 점수 = " + students[4]);

    }
}
