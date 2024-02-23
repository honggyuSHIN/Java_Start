package scanner.ex;
import java.util.Scanner;
public class ScannerWhileEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("상품 가격 : ");
            int price=input.nextInt();
            if (price == -1) {
                break;
            }
            System.out.print("상품 수량 : ");
            int quantity=input.nextInt();

            System.out.println("총 비용 : "+price*quantity);
        }

    }
}
