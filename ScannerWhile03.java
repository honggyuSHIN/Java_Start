package scanner;
import java.util.Scanner;
public class ScannerWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.println("숫자 : ");
            int num1=scanner.nextInt();
            if (num1 == 0) {
                break;
            }
            sum+=num1;
            
        }
        System.out.println("sum = " + sum);
    }
}
