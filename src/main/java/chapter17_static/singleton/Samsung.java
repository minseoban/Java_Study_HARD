package chapter17_static.singleton;

import lombok.Getter;

public class Samsung {
    // 필드 정의
    @Getter // 필드 위에 @Getter를 사용하면 getCompany()만 만들겠다는 뜻입니다.
    private String company;
    private int serialNumber;       // -> 이 필드에는 getter가 없습니다.

    // 여기서부터 싱글톤 패턴 작성을 시작합니다.
    // 1. 스태틱 변수 정의 -> 보통 싱글톤 만들 때 객체명을 instance로 쓰는 편
    private static Samsung instance = null; // 자료형이 Samsung인 정적 변수

    // 2. 기본 생성자 정의
    private Samsung() {
        company = getClass().getSimpleName();   // 패키지 데고 클래스명만 가지고 오는 애.
        serialNumber = 20250000;
    }

    // 3. static 메서드 정의 -> 대부분의 경우 getInstance()로 정의합니다.
    public static Samsung getInstance() {
        if (instance == null) {         // 현재 인스턴스가 없다면 이하의 코드가 실행됨
            instance = new Samsung();  // Samsung 클래스의 객체 생성
        }                               // static 변수인 instance에 대입
        return instance;                // instance가 이미 있다면 return만 실행됨.
        // 만약 이상의 조건문이 실행되지 않는다면 이미 기존의 instance가 있다는 의미이므로
        // 즉, getInstance() 메서드는 실행되기만 하면 어쨌든 Samsung 클래스의 객체가
        // return된다고 볼 수 있습니다.
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }
}
