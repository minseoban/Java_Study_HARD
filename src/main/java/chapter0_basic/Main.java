package chapter0_basic;
// 주석 (Comment) : 한 줄 주석을 위해서는 // 누르면 됩니다
/*
    다중 주석 (Multiple Comment) : 다중 주석을 위해서는 /* + enter 누르면 그 사이에 작성했을 때 전체가 주석처리가 됩니다.

    주석이란?
        자바 프로그램의 경우 폴더 및 파일 전체의 코드를 컴파일링하는데 (컴퓨터 계산을 해서 오류가 없는지를 검증하는데), 거기서 오류가 하나라도 발견되면 실행 자체가 되지 않습니다. 하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인식하지 않기 때문에 오류가 발생하지 않습니다.

   즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라, 사람이 읽어서 정보를 얻을 수 있도록 하는 데에 의의가 있습니다.
    1) 한 줄 주석 : //
    2) 다중 주석 : / + shift + 8
    3) 사후 주석 : 주석 처리할 부분을 드래그한 후에 command + /

프로젝트 / 패키지 / 클래스
    프로젝트 : 패키지들이 모여있는 가장 큰 사이즈이며 주로 프로그램 하나를 의미함.
    패키지 : 클래스들이 모여있는 일종의 디렉토리 -> 소문자로 작성해야 함.
    클래스 : 파일 단위로 코드를 작성하는 공간 -> 첫 문자는 대문자로 작성.

 Main.java -> 당분간 실행될 프로그램인 경우에 해당 이름을 붙일 예정

command + d = copy line

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

//        System.out.println(Hello, Java!);  -> 오류 발생
        System.out.println(1);          // 결과값 : 1
        System.out.println("1");        // 결과값 : 1
        System.out.println("1" + "2");  // 결과값 : 12
        System.out.println(1+2);        // 결과값 : 3
        System.out.println(2+1);        // 결과값 : 3
        System.out.println("2"+"1");    // 결과값 : 21

        /*
            수학 연산을 할 때에는 ""로 묶지 않는다.
            문자를 출력하기 위해서는 ""로 묶여준다.


         */
    }
}
