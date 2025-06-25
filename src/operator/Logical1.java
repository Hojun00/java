package operator;

public class Logical1 {
    public static void main(String[] args){
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false && false);

        int a = 15;
        boolean result = 10 < a && a < 20; // a > 10 && a < 20 처럼 표기하는 것보다 알아보기 쉽다.
        System.out.println(result);


    }
}
