package array.ex;
import java.util.Scanner;
public class ArrayEx06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int min=0;
        int max=0;
        int n=0;

        System.out.println("입력 받을 숫자의 개수 : ");
        n=scanner.nextInt();

        int[] numbers=new int[n];

        System.out.println(n+"개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        min=numbers[0];
        max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (min > numbers[i]) {
                min=numbers[i];
            }
            if (max < numbers[i]) {
                max=numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
