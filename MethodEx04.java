package method.ex;
import java.util.Scanner;
public class MethodEx04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;

        while (true) {
            System.out.println("---------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------");
            int choice=scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("입금액을 입력하세요 : ");
                    int money=scanner.nextInt();
                    total+=money;
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요 : ");
                    int withdrawMoney=scanner.nextInt();
                    total=withdraw(total, withdrawMoney);
                    break;

                case 3:
                    System.out.println("현재 잔액 : "+total);
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못 입력하셨습니다.");


            }
        }
    }

    public static int withdraw(int total, int money) {
        if (total >= money) {
            total-=money;
            System.out.println(money+"를 출금하였습니다.");
            System.out.println("현재 잔액 : "+total);
            return total;
        }
        else{
            System.out.println(money+"를 출금하려 했으나 잔액이 부족합니다.");
            return total;
        }
    }
}
