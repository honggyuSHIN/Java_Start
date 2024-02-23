package scanner.ex;
import java.util.Scanner;
public class ScannerEx04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("몇 단?");
        int n=input.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(n+"*"+i+"="+n*i);
        }
        }

    }

