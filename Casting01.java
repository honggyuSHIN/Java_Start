package casting;

public class Casting01 {
    public static void main(String[] args) {
        int intValue=10;
        long longValue;
        double doubleValue;

        longValue=intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue=intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue=20L; // long -> double
        System.out.println("doubleValue = " + doubleValue);

        /*
        작은 단위를 큰 단위에 넣으면 문제가 되지 않음. 메모리는 조금 더
        차지하지만.(묵시적 형변환)
        하지만 큰 단위를 작은 단위에 넣으면 문제가 생기기 때문에 개발자가
        명시적으로 형변환 표시를 해줘야 함.(명시적 형변환)
         */
    }
}
