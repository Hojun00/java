package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
} // int < long < double 의 크기로 데이터를 저장할 수 있는 데이터 형식의 크기라 커진다.
