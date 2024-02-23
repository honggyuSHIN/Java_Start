package loop;

public class Break01 {
    public static void main(String[] args) {
        int start = 0;
        int sum = 0;
        while (true) {
            sum += start;
            if (sum >= 10000) {
                System.out.println("sum = " + sum);
                break;

            }
            start += 1;
        }
    }
}