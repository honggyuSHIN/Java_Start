package array;

public class Array01Ref04 {
    public static void main(String[] args) {
//
        int[] students={90,80,70,60,50};

//        int[] students;
//        students={90,80,70,60,50};
        // 이렇게는 x

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+"의 점수 : "+students[i]);
        }


        // 배열을 생성할 때 내부값은 자동으로 초기화됨.
        // 숫자는 0, boolean은 false, String은 null

    }
}
