package scanner.ex;
import java.util.Scanner;
public class ScannerWhileEx04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allCount=0;

        // while문. 옵션 선택.
        while (true) {
            System.out.println("1. 상품 입력\n2. 결제\n3. 프로그램 종료");
            int option=scanner.nextInt();
            if (option == 1) {
                scanner.nextLine();
                System.out.print("상품명을 입력하세요 : ");
                String name=scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                int price=scanner.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                int cnt=scanner.nextInt();


                allCount+=price*cnt;
                System.out.println("상품명 : "+name+"\n수량 : "
                        +cnt+"\n합계 : "+allCount);
                System.out.println();
            } else if (option == 2) {
                System.out.println("총 비용 : "+allCount);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 선택입니다.");
            }

        }
    }
}
