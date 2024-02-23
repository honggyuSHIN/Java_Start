package array.ex;
import java.util.Scanner;
public class ArrayEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] save=new int[5];
        for (int i = 0; i < save.length; i++) {
            System.out.print("숫자를 입력하세요 : ");
            save[i]=scanner.nextInt();
        }


        for (int i = 0; i < save.length; i++) {
            System.out.print(save[i]);

            if (i < save.length - 1) {
                System.out.print(",");
            }

        }
    }
}
