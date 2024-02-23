package scanner;
import java.util.Scanner;


public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Scanner의 기능을 사용하기 위해 new를 사용해서 Scanner를
        // 만듦.
        // Scanner scanner는 변수를 만드는 것. new를 통해 만든 것을
        // scanner 변수에 담아서 사용할 수 있음.


        System.out.print("문자열을 입력하세요 : ");
        String str=scanner.nextLine();
        System.out.println("입력한 문자열 : "+str);

        System.out.print("정수를 입력하세요 : ");
        int intValue=scanner.nextInt();
        System.out.println("입력한 정수 : "+intValue);

        System.out.print("실수를 입력하세 요 : ");
        double doubleValue=scanner.nextDouble();
        System.out.println("입력한 실수 : "+doubleValue);




    }
}
