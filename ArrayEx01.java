package array.ex;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] students;
        students=new int[5];
        // int[] students={90,80,70,60,50};

        int total=0;
        for (int student : students) {
            total += student;

        }

//        for (int i = 1; i < 6; i++) {
//            students[i-1]=100-10*i;
//            total += students[i - 1];
//        }
        double average=(double)total/students.length;
        System.out.println("점수 총합 : "+total);
        System.out.println("점수 평균 : "+average);

    }
}
