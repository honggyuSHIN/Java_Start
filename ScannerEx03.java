package scanner.ex;
import java.util.Scanner;
public class ScannerEx03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("음식 이름 : ");
        String foodName=input.nextLine();
        System.out.println("음식 가격 : ");
        int foodPrice = input.nextInt();
        System.out.println("음식 수량 : ");
        int foodQuantity = input.nextInt();
        int totalPrice=foodQuantity*foodPrice;

        System.out.println(foodName+" "+foodQuantity+"개를 주문하셨습니다. " +
                "총 가격은 "+totalPrice+"입니다.");
    }


}
