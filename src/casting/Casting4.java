package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        //자바에서 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        // 서로 다른 타입의 계산은 큼 범위로 자동 형변환이 일어난다.
    }
}
