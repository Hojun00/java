package operator;

public class Operator1 {
    public static void main(String[] args){
        // 변수 초기화 및 덧셈
        int a = 3, b = 4, sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println(diff);

        //나눗셈
        int div = 5 / 2; // -> int형 끼리의 계산은 소수점 표현이 안된다.
        System.out.println(div);

        //나머지
        int mod = 5 % 2;
        System.out.println(mod);
    }
}
