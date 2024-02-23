package cond;

public class If06 {
    public static void main(String[] args) {
        int price=18888;
        int age=10;
        int discount=0;

        if (price>=10000){
            discount+=1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        else if(age<=10){
            discount += 1000;

            System.out.println("10살 이하, 1000원 할인");
        }

        System.out.println("discount=" + discount+"원");
    }
}
