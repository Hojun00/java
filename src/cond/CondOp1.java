package cond;

public class CondOp1 {
    public static void main(String[] args){
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년";

        System.out.println(status);
    }
}
