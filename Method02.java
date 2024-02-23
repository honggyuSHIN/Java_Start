package method;

public class Method02 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("프로그램을 시작합니다.");
        return;
    }
    public static void printFooter(){
        System.out.println("프로그램을 종료합니다.");
    }

    // 모든 메서드는 return을 호출해야 하지만 반환 타입이 void인 경우 예외적으로
    // 생략해도 됨.
    // return을 만나면 해당 메서드는 종료.
}
