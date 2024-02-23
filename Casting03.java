package casting;

public class Casting03 {
    public static void main(String[] args) {
        long maxIntValue=2147483647;    // int 최고값
        long maxIntOver=2147483648L;    // int 최고값 +1(초과)
        int intValue=0;

        intValue=(int)maxIntValue;
        // long을 int에 넣으려면 내용물이 int의 범위더라도 안에 뭐가
        // 들어있을 지 모르기 때문에 형변환을 해줘야 함.
        System.out.println("intValue = " + intValue);

        intValue=(int)maxIntOver;
        System.out.println("intValue = " + intValue);
        // -2147483648 출력됨. -> 오버플로우 발생.
        // int 범위 초과 시 int의 가장 작은 범위부터 다시 시작.
    }
}
