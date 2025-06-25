package operator;

public class Operator2 {
    public static void main(String[] args){
        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1", s2 = "string2", result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10; // -> 문자열과 숫자를 더하면 java가 자동으로 숫자형 값을 문자열고 바꾼다.
        System.out.println(result3);

    }
}
