package scanner.ex;
import java.util.Scanner;
public class ScannerWhileEx03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        double average=0;
        int cnt=0;

        System.out.println("숫자를 입력하세요 : ");
//        while (true) {
//            int i=scanner.nextInt();
//            if (i == -1) {
//                break;
//            }
//            sum+=i;
//            cnt+=1;
//        }
        int i;
        while(( i = scanner.nextInt()) != -1){
            sum+=i;
            cnt++;
        }

        System.out.println("입력한 숫자들의 합계 : "+sum);
        average=(double)sum/cnt;
        System.out.println("입력한 숫자들의 평균 : "+average);



    }
}
