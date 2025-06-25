package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 4;
        int mod = x % 2;

        switch (mod) {
            case 0:
                System.out.println("x = " + x + ", " + "짝수");
                break;
            case 1:
                System.out.println("x = " + x + ", " + "홀수");
                break;
        }
    }
}
