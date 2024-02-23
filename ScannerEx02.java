package scanner.ex;
import java.util.Scanner;
public class ScannerEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수 입력 : ");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        else{
            System.out.println("홀수입니다.");
        }
    }
}
