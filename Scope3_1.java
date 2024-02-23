package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m=10;
        int temp=0;
        if(m>0){
            temp=m*2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

        /*
        현재 코드에서 temp는 if문 안에서만 사용되고 있음. 하지만 변수 선언이
        if문 밖에서 되었기 때문에 메인 메소드 안에서 계속 메모리가 불필요하게
        유지됨.
        또한 if문 밖에서는 사용하지 않는 변수이지만 계속 살아있기 때문에
        신경써야 하는 번거로움이 있음. -> 스코프가 불필요하게 넓다.
         */
    }
}
