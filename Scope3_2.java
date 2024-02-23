package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m=10;

        if(m>0){
            int temp=m*2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

        /*
        while문은 변수가 밖에 있기 때문에 스코프 면에서? 비효율적이지만
        for문의 경우 변수가 내부에 존재하기 때문에 효율적이고 깔끔함.
         */

    }
}
