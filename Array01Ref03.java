package array;

public class Array01Ref03 {
    public static void main(String[] args) {
//        int[] students;
//        // int형 배열 시작 부분 생성? / 주소를 참조하는 공간인 stduents 생성.
          // 아직 데이터 공간은 생성 안 한 것 같음.
//        students=new int[]{90,80,70,60,50};
//        // 배열 데이터 생성.
//        // 배열 생성과 초기화를 동시에 함.
        int[] students=new int[]{90,80,70,60,50};

//        for (int j = 1; j < 6; j++) {
//            students[j-1]=100-10*j;
//        }
//        System.out.println(students[1]);

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+"의 점수 : "+students[i]);
        }


        // 배열을 생성할 때 내부값은 자동으로 초기화됨.
        // 숫자는 0, boolean은 false, String은 null

    }
}
