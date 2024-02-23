package scanner;
import java.util.Scanner;

public class ScannerWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("문자열을 입력하세요 : ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("exit을 입력하셨습니다.");
                break;
            }
            else{
                System.out.println("str = " + str);

                }
            }
        }
    }

