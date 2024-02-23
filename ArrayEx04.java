package array.ex;
import java.util.Scanner;
public class ArrayEx04 {
    public static void main(String[] args) {
        int[] scores=new int[5];
        Scanner scanner = new Scanner(System.in);
        int total=0;
        double avg;

        System.out.println("점수를 입력하세요 : ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            total+=scores[i];
        }
        avg=(double)total/scores.length;
        System.out.println("정수 합계 : "+total);
        System.out.println("정수 평균 : "+avg);


    }
}
