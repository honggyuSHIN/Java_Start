package method.ex;

public class MethodEx02Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printmg(3,message);

//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
    }

    public static void printmg(int times,String message) {
        for (int i=0; i < times; i++) {
            System.out.println(message);
        }
    }
}
