package array;

public class Array01Ref01 {
    public static void main(String[] args) {
        int[] students;
        students=new int[5];
        System.out.println(students);
        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=50;


        System.out.println("학생1 점수 : "+students[0]);
        System.out.println("학생1 점수 : "+students[1]);
        System.out.println("학생1 점수 : "+students[2]);
        System.out.println("학생1 점수 : "+students[3]);
        System.out.println("학생1 점수 : "+students[4]);


        // 배열을 생성할 때 내부값은 자동으로 초기화됨.
        // 숫자는 0, boolean은 false, String은 null

    }
}
