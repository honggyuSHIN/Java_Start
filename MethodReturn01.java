package method;

public class MethodReturn01 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);


        // 반환 타입이 있으면 무조건 반환해야 함.
    }
    public static boolean odd(int i){
        if (i % 2 == 1) {
            return true;
        }else{
            return false;
        }
    }
}
