package chapter13_abstraction.interfaces;

public interface Press {

    String NAME = "button";
    // interface이기 때문에 변수 앞에 접근 제어자를 명시하지 않았지만
    // public final이 생략되어있습니다.
    // 그리고 상수이기 때문에 대문자로 표기했고,
    // 일반적인 클래스의 경우처럼 String name; 세미콜론 마무리가 아니라
    // 초기화까지 이루어져야 합니다.

    // 안되는 것들 예시
//    String name;    // 접근제어자 지정 불가능 -> 선언만 하는 것도 불가능
//    public  Press();  // 생성자 선언 불가능

//    void pop() {
//        System.out.println("일반 메서드입니다.");
//    }
    // 구현부가 있는 일반 메서드 선언 불가능
    // default 헀더니 구현부 있는 일반 메서드가 되는 것처럼 나온 부분 -> Java8에서
    // 업데이트 된 내용이고, default의 경우 동일 패키지 내에서는 사용가능 헀음.
    // chapter10_access_modifier에서 수업한 내용

    // 되는 것 정의 -> 추상 메서드 정의
    void onPressed();


}
