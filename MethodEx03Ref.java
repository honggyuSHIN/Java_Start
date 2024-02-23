package method.ex;

public class MethodEx03Ref {
    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000
        int depositAmount = 1000;
        balance=deposit(balance, depositAmount);
//        balance += depositAmount;
//        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        // 출금 2000
        int withdrawAmount = 2000;
        balance=withdraw(balance, withdrawAmount);
//        if (balance >= withdrawAmount) {
//            balance -= withdrawAmount;
//            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
//        } else {
//            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
//        }

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int total,int money) {
        total+=money;
        System.out.println(money+"원이 입금되었습니다.");
        return total;

    }

    public static int withdraw(int total, int money) {
        if (total > money) {
            total -= money;
            System.out.println(money + "원이 출금되었습니다.");

        } else {
            System.out.println("잔액이 부족합니다.");

        }
        return total;

    }
}
