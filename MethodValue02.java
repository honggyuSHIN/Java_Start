package method;

public class MethodValue02 {
    public static void main(String[] args) {
        int num1=5;
        System.out.println(num1);
        num1=changeNumber(num1);
        System.out.println(num1);
    }
    public static int changeNumber(int num2){
        num2=num2*2;
        return num2;

    }
    // 서로 다른 메서드 안에서 사용하는 변수들은 서로 완전히 분리된 다른 변수들임.
    // 혹시 이름이 같더라도 영역 자체가 다르므로 아예 다른 변수임.
}
