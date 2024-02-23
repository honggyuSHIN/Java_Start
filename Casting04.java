package casting;

public class Casting04 {
    public static void main(String[] args) {

        int div1=3/2;

        double div2=3/2;
        // int인 3과 2의 계산이므로 3/2는 (int)1이 나옴.
        // div2는 double이기 때문에 형변환이 발생해서 1.0이 됨.

        double div3=3.0/2;
        // double과 int의 계산이므로 int를 더 큰 타입인 double로 변경.
        // 3.0 과 2.0의 계산이므로 1.5가 나옴.

        double div4=(double)3/2;
        // 위와 같음. 명시적 형변환을 통해 int를 double로 변형.
        // -> double 과 double의 계산으로 바뀜.
    }
}
