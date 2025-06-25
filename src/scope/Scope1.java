package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { //int i 는 for문 코드 블록 안에서만 존재
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        }
    }
}
