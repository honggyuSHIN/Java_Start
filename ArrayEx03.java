package array.ex;
import java.util.Scanner;
public class ArrayEx03 {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
    }
}
