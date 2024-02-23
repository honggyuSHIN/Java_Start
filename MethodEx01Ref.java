package method.ex;

public class MethodEx01Ref {
    public static void main(String[] args) {

        double average = avg(1,2,3);
        System.out.println("평균값: " + average);
        average = avg(15,25,35);
        System.out.println("평균값: " + average);
    }

    public static double avg(int a, int b, int c) {
        return (a+b+c)/3.0;
    }
}
