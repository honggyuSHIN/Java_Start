package method;

public class Method01Ref {
    public static void main(String[] args) {
        // 자바에서 메서드는 함수의 한 종류.
        int sum1 = add(5, 10);
        System.out.println("결과 출력 : "+sum1);


        int sum2 = add(15, 20);
        System.out.println("결과2 출력 : "+sum2);
    }

    // 메서드
    public static int add(int a,int b){
        // 메서드 이름, 반환 타입(int add), 파라미터(매개변수) 목록을 알 수 있음.
        // 메서드가 반환을 하지 않는 경우 타입 부분(int)에 void를 넣어야 함.
        System.out.println(a+"+"+b+"연산 수행");
        int sum=a+b;
        return sum;
    }
}
