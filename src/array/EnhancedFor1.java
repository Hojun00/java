package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, fore-each문
        //실무에서 가장 많이 쓰는 for문
        //설정한 배열의 끝에 도달해 값이 더 이상 없으면 for문이 종료된다.
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 즉시 생성하는 단축키: iter
        // 직관적으로 보고 배열이 있다 -> 다 돌려야겠다 하면 iter

        // 단 for-each문을 사용할 수 없는 경우: 증가하는 index 값이 필요할때, int i와 같은 증가하는 인덱스 값을 직접 사용해야 하는 경우
        // for(int i = 0; i < number.length; i++) {
        //  System.out.println("number " + i + "번의 결과는" + numbers[i]); }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
