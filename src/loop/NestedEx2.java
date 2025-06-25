package loop;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
        }
    }
}
