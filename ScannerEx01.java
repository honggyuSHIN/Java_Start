package scanner.ex;
import java.util.Scanner;
public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 : ");
        String name=scanner.nextLine();

        System.out.println("나이 : ");
        int age=scanner.nextInt();

        System.out.println("이름 : "+name+" 나이 : "+age);

    }
}
