package loop;

public class For02 {
    public static void main(String[] args) {
        int sum=0;
        int endNum=3;

        for (int i = 1; i <= endNum; i++) {
            sum+=i;
            System.out.println("i="+i+" sum="+sum);
        }
        // i=10; 불가. for문 안에서 생성된 i는 밖에서 사용할 수 없음.
    }
}
