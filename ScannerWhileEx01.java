package scanner.ex;
import java.util.Scanner;
public class ScannerWhileEx01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.print("이름 : ");
            String name=input.nextLine();
            // 사용자 입력에는 \n이 남아있는데 nextLine()은 라인까지
            // 읽어오기 때문에 빈 문자열과 \n(엔터)만 있다고 생각하고
            // ""(빈 문자열)만 들어가게 됨.
            
            if (name.equals("종료")) {
                break;
            }
            
            System.out.print("나이 : ");
            // 10\n  형태로 입력.

            int age = input.nextInt();
            // nextInt는 10\n 에서 10만 가져가고 \n은 남아있음.

            input.nextLine();
            // 남아있는 \n을 가져가는 역할.
            
            System.out.println("이름 : "+name+"\n나이 : "+age);

        }

    }
}
