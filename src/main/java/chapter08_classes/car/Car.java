package chapter08_classes.car;
// ClassA에 적은 내용을 바탕으로 Car 클래스 정의해볼겁니다.
public class Car {
    // 필등(속성)
    String color;
    int speed;

    // 메서드(행동)
    void drive() {
        System.out.println(color + " 자동차가 " + speed + "km/h 주행 중입니다.");
    }

    void stop() {
        System.out.println(color + " 자동차가 멈췄습니다.");
    }

    /*
        1. Car의 인스턴스인 myCar 객체를 생성하세요.
        2. color에 "빨강" 대입하고, 콘솔창에 출력하세요.
        3. speed에 100을 대입하고, 콘솔창에 출력하세요.
        4. yourCar 객체를 생성하세요.
        5. color에 "노랑" 대입하고, speed에 140을 대입하고, 둘 다 출력하세요.
        6. myCar는 drive() 메서드 호출, yourCar는 stop() 메서드를 호출하세요.
     */
}
