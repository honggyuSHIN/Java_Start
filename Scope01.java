package scope;

public class Scope01 {
    public static void main(String[] args) {
        int m=10;   // m 생존 시작

        if(true){
            int x=20;   // x 생존 시작
            System.out.println("if m=" + m);
            System.out.println("if x=" + x);

        }   // x 생존 종료
        // System.out.println("main x="+x);
        System.out.println("main m="+m);

        /*
        <지역 변수>
        x의 경우 if문 안에서 생성되었기 때문에 if문 밖에서는 사용할 수 없음.
        m의 경우 psvm{}(메인 메소드)안에서 생성되었기 떄문에
        그 밖에서 사용할 수 없음.
         */

    }   // m 생존 종료
}
