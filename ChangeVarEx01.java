package scanner.ex;

public class ChangeVarEx01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp=0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("temp = " + temp);
        temp=a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("temp = " + temp);
    }
}
