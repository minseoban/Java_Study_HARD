package chapter14_casting.centralcontrol;
/*
    20250220 수업 예정 부분
    CentralControl.java 파일을 만들건데,
    Computer.java와
    LED.java 파일을 생성해서 -> Power 인터페이스를 구현 받으세요.
 */
public class Main {
    public static void main(String[] args) {
        // 선언한 각 클래스들의 객체를 생성
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        Tv tv1 = new Tv();

        CentralControl centralControl = new CentralControl(new Power[7]);
        // 빈 Power배열을 생성 -> centralControl의 field로 삼았다.

//        centralControl.deviceArray[0] = computer1; -> deviceArray가 private이므로 불가능
//        -> 메서드를 통해 Power의 자식 객체들을 추가해야 함.

        centralControl.addDevice(computer1);
        centralControl.addDevice(led1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(tv1);

        centralControl.powerOn();

        System.out.println();
        centralControl.performSpecificMethod();

        System.out.println();
        centralControl.powerOff();

        centralControl.displayInfo();
    }
}
/*
    다음 지시 사항에 따라 코드를 작성하시오.

    Mouse.java / Tv.java 클래스를 생성하고
    centralControl 객체의 배열 크기를 5개로 늘린 후
    Mouse 클래스의 객체인 mouse1, Tv 클래스의 객체인 tv1을 centralControl의 deviceArray 필드에 담아
    전체 다 powerOn 시키고, 그 후 powerOff() 시키시오.

    연결됐다
    켜쪘다
    꺼졌다
 */
