package operator;

public class Operator02 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기
        String result01="hello"+"world";
        System.out.println(result01);

        String s1="string01";
        String s2="string02";
        String result02=s1+s2;
        System.out.println(result02);


        String result03="a+b="+10;
        System.out.println(result03);

        int num=20;
        String str="a+b=";
        String result04="a+b="+num;
        System.out.println(result04);
        // 문자열과 숫자를 더하면 숫자를 문자열로 바꾸고 더하기를 함.
    }
}
