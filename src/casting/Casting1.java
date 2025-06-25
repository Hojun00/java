package casting;

public class Casting1 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생, double형이 int형 보다 크기가 크기때문에 변환에 오류가 발생한다.
        intValue = (int) doubleValue; //명시적 형변환
        System.out.println("intValue = " + intValue);

    }// 오버플로우는 발생하면 이를 활용하려고 고민하는게 아니라 형변환을 해서 바로 해결하는게 옳다.
}
