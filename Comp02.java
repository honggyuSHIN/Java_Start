package operator;

public class Comp02 {
    public static void main(String[] args) {
        // 문자열 비교는 ==이 아닌 equals()를 사용할 것.

        String str1="문자열1";
        String str2="문자열2";

        boolean result1="hello".equals("hello");
        boolean result2=str1.equals("문자열1");
        boolean result3=str1.equals(str2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println(result3);

    }
}
