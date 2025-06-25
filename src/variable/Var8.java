package variable;

public class Var8 {
    public static void main(String[] args){
        //정수 - 정수형에 따라 변수가 차지하는 메모리 공간이 달라진다.
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2147483648 ~ 2147483647 (약 20억)

        //-9223372036854775808 ~ 9223372036854775807 long형은 값 뒤에 대문자 L 혹은 소문자 l을 작성해야한다.
        long l = 9223372036854775807L; //9223372036854775807

        //실수 -그러므로 double형은 15자리 정밀고, float형은 7자리 정밀도를 가진다
        float f = 10.0f; // float형은 값 뒤에 f를 작성해야한다.
        double d = 10.0; // double형이 float형 보다 더 큰 범위를 커버한다.
    }
}
