package record;

public class GatherMemo {
    /*
    part Scope
    if문 안에서 생성된 변수는 if문 안에서만 살아있고
    if문이 끝나면 사라짐.


    if문 안에서만 변수가 활용되는데 그 변수가 if문 밖에서 선언되었다면
    메모리가 불필요하게 유지됨. / 스코프가 불필요하게 넓음.
    / 계속 신경써야 함.
     */



    /*
    part Scanner

    Scanner scanner=new Scanner(System.in);
    -> Scanner scanner는 변수를 만드는 것. new를 통해 만든 것을 scanner라는 변수에 담아서 사용할 수 있음.
    -> Scanner라는 클래스를 활용하기 위해 scanner라는 객체를 만들어서 Scanner클래스의 기능을 활용하나?
    ex) scanner.nextInt(); 도 .을 통해 접근함.

    scanner.nextInt(); 때문에 자동으로 입력되는 경우 scanner.nextLint();을 넣어서 해결함. / ScannerWhileEx01참고.

     */



    /*
    part Method

    서로 다른 메서드 안에서 사용하는 변수들은 이름이 같더라도 완전히 분리된 변수임.

     */


    /*
    part Casting

    큰 단위를 작은 단위에 넣으면 문제가 생기기 때문에 개발자가 명시적으로 형변환 표시를 해줘야 함.

    오버플로우 : int 범위를 초과하면 마이너스 가장 작은 수부터 시작하는 것처럼 범위를 넘었을 경우 발생.

     */


    /*
    part Array

    배열을 생성할 때 내부값들은 자동으로 초기화 됨.
    ex) 숫자는 0, boolean은 false, String은 null



     */





}
