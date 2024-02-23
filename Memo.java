package record;

public class Memo {
    /*
    타입 계산
    1. 같은 타입끼리의 계산은 같은 타입의 결과를 냄.
    ex) int + int -> int / double + double -> double

    2. 서로 다른 타입의 게산은 큰 범위로 자동 형변환이 일어남.
    ex) int + long -> long + long 으로 자동 형변환이 일어남.
    int + double -> double + double 으로 자동 형변환이 일어남.

    Casting04 참고.


    println() : 출력 후 다음 줄로 이동
    print() : 출력 후 다음 줄로 이동 x
    print("\n")을 println으로 줄인 것.




    문자열 ==
    if (str.equals("exit")){}
    문자열은 == 안됨.



    평균 구할 때 double로 변수 타입을 해야 정확하게 나옴. -> 소수점이 있기 때문.


    while( (int i = scanner.nextInt()) != -1) 안되는 이유


    변수명은 반복문 돌려서 접근할 수 없음.
    -> 배열을 활용하여 같은 타입의 변수들을 묶을 수는 있음.


    int[] students;
    students=new int[5];
    -> new int[5]를 통해 배열을 생성하면 5의 크기만큼 메모리를 확보함.
    -> int students[] 변수는 new int[5] 배열의 참조값(주소)를 갖고 있음.
    -> stduents를 그대로 출력하면 참조값을 확인할 수 있음.
    -> students[0]이라는 뜻은 students가 갖고 있는 주소로 가서 [0]위치에 데이터를
        넣으라는 뜻임.


    기본형(Primitive Type)
    -> 사용하는 값을 직접 넣음.
    ex) int, long, double, boolean

    참조형(Reference Type)
    -> 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입.
    ex) 배열.


    기본형(ex.int)의 경우 모두 사이즈가 명확하게 정해져 있음.
    int의 경우 1개. 자료형도 정해짐.
    하지만 배열은 사이즈를 동적으로 변경할 수 있음. scanner를 활용해 배열의 크기를
    정하거나 할 수 있음.


    double avg =(double)sum/5   :   sum을 double 형태로 바꾸어 줘야 함.?


    메서드 설명
    public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻.
    static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻.


    메서드 용어 정리
    호출 : call("hello",20)
    메서드 정의 : int call(String str, int age)

    -> 호출 부분에서 "hello",20처럼 넘기는 값을 Argument, 인수/인자 라고 함.
    -> 정의 부분에서 선언한 변수 String str, int age를 매개변수, 파라미터라고 함.
    --> 메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입됨.






















     */
}
