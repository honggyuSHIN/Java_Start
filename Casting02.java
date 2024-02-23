package casting;

public class Casting02 {
    public static void main(String[] args) {
        double doubleValue=1.5;
        int intValue=0;
        
        // intValue=doubleValue; // 컴파일 오류 발생
        intValue=(int)doubleValue; //명시적 형변환.
        System.out.println("intValue = " + intValue);

        // 변수의 값이 변경될 때는 대입 연산자(=)를 사용할 때 뿐임.
    }
}
