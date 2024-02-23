package scanner.ex;
import java.util.Scanner;
public class ScannerEx05 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int num1=input.nextInt();
        System.out.print("두 번째 숫자 : ");
        int num2=input.nextInt();

        int temp;
        if (num1 > num2) {
            temp=num1;
            num1=num2;
            num2=temp;
        }
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if(i!=num2){
                System.out.print(",");
            }

        }
    }


}
