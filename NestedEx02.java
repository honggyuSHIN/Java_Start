package loop.ex;

public class NestedEx02 {
    public static void main(String[] args) {
        int max=5;
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 진짜 피라미드도 한번 해보기.
    }
}
