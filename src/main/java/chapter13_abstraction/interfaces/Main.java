package chapter13_abstraction.interfaces;
/*
    인터페이스 (interface)
        인터페이스는 자바에서 클래스가 구현해야하는 '메서드들'의 집항을 정의하는
        일종의 규약 (protocol)

        인터페이스는 메서드의 시그니처(메서드 이름, 리턴 타입, 매개변수 목록)만을
        포함하며, 메서드의 실제 구현은 포함하지 않음
            -> 추상 메서드와 유사한 점

        다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음
            : 추상 클래스는 단일 상속을 지원해서 상속 과정을 알아보기 쉽다고
            20250217에서 수업했습니다 -> 차이점

        특징
            1. 추상 메서드 : 인터페이스 내의 모든 메서드는 기본적으로 추상 메서드
            2. 상수 : 인터페이스 내에서 선언된 변수는 모두 '자동으로'
                public static final 상수로 취급됨
            3. 다중상속 : 클래스는 여러 인터페이스를 구현할 수 있다.

        추상 클래스와의 공통점
            - 모두 추상 클래스를 포함할 수 있고, 이를 서브 클래스에서 구현해야 한다.

        추상 클래스와의 차이점
            - 추상 클래스
                1. 부분 구현 허용 : 추상 클래스는 추상 메서드 뿐만 아니라 일반
                    메서드도 포함할 수 있다.
                2. 상태 저장 가능 : 추상 클래스는 인스턴스 변수(상태)를 가질 수 있다.
                3. 단일 상속 : 클래스는 하나의 추상 클래스만 상속 받을 수 있다.
                4. 생성자 : 추상 클래스는 생성자를 가질 수 있다.
                5. 다양한 접근 제어자(access modifier) : 추상 클래스의 메서드와
                    변수는 다양한 접근 제어자(public, protected, private)를
                    가질 수 있다.

            - 인터페이스
                1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메서드가 추상 메서드
                    Java8 이후에 default, static 메서드를 사용할 수 있긴 합니다.
                2. 인터페이스는 인스턴스 변수(필드 중 객체마다 값이 다른 변수)를 가질 수 없고,
                    상수만 선언 가능
                3. 다중 상속 : 클래스는 여러 인터페이스를 '구현할 수 있다.'
                4. 생성자 없음 : 인터페이스는 생성자를 가질 수 없다.
                    -> 일단 필드에서 객체마다 다른 값을 가지게 되는 인스턴스 변수가 없기 때문에
                    생성자 생성이 불가능 -> 객체마다 다른 값을 가질 수 없다는 의미
                5. 자동 public : 인터페이스의 메서드들은 자동으로 public이며,
                    메서드 선언에 접근 제어자를 명시할 필요가 없다.
                    Java 8 이후에 default, static 메서드를 사용할 수 있습니다.
 */
public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController(
                new PowerButton(),
                new VolumeDownButton(),
                new VolumeUpButton(),
                new ChannelDownButton(),
                new ChannelUpButton()
        );
        // RemoteController remoteController = new RemoteController();까지 작성했을 경우에
        /*
            저희가 매개변수 생성자로 정의했기 때문에 오류가 발생합니다. 그래서 argument들을
            채워넣을 필요가 있는데,

            RemoteController의 객체를 생성했고, 객체명이 remoteController입니다.
            클래스명1 객체명1 = new 클래스명1(argument1, arugment2 ...);
            클래스명2 객체명2 = new 클래스명1(new 클래스명3(), new 클래스명4(), ...);

            이상의 경우 new 클래스명3(), new 클래스명4()를 통해 객체 생성은 이미 '완료'됐습니다.
                -> 생성자의 정의 : 객체가 생성될 때 자동으로 호출되는 특별한 메서드
            다만 차이점은 뭐냐 -> 객체명이 없을 뿐이죠.
         */

        remoteController.onPressedPowerButton();
        remoteController.onPressedPowerButton();
        /*
            다중상속을 지원하지 않는 Java 클래스에서 remoteController라는 객체가
            PowerButton / VD / VU 에 있는 메서드 5개를 전부 호출할 수 있도록 하기 위해
            필드로 PB / VD / VU를 가지고, 생성자의 argument로 사용한 다음,
            RemoteController의 일반 메서드로 PB의 메서드 호출을 할 수 있도록 정의

            그리고 Main.java에서 remoteController.onPressedPowerButton();로 호출하면
            onPressedPowerButton(); 얘가
            powerButton.onPressed(); 얘를 또 따로 호출해서
            이중 호출을 하는 방식으로 전체 기능을 구현할 수 있도록 작성함.
         */
        remoteController.onPressedVolumeDownButton();
        remoteController.onDownVolumeDownButton();

        remoteController.onPressedVolumeUpButton();
        remoteController.onUpVolumeUpButton();

        remoteController.onPressedChannelDownButton();
        remoteController.onPressedChannelUpButton();
        remoteController.onDownChannelDownButton();
        remoteController.onUpChannelUpButton();
        /*
            ChannelDownButton을 정의하는데
            -> Button을 상속받아서
            -> method들을 정의합니다 -> VolumeDownButton을 참조해서
            "채널을 한 칸 내립니다."
            "채널을 계속 내립니다."
            -> ChannelUpButton까지 동일하게 작성 후
            -> RemoteController에 ChannelDownButton / ChannelUpButton을 field에 추가 -> 생성자도 수정
            -> onPressedChannelDown / onPressedChannelUp / onDownChannelDown / onUpChannelUp
            -> Main -> RemoteController 객체 생성 시에 생성자 부분도 수정이 이루어져야합니다.
            remoteController.onPressedChannelDown()
            remoteController.onPressedChannelUp()
            remoteController.onDownChannelDown()
            remoteController.onUpChannelUp()

            과제 2

            TemperatureDownButton, TemperatureUpButton, AirconditionerController.java
            클래스를 만들고 정의해서
            Main에 AirConditionerController 객체를 생성한 후

            전원이 켜졌습니다.

            온도를 한 칸 내립니다
            온도를 계속 내립니다

            온도를 한 칸 올립니다.
            온도를 계속 올립니다

            전원이 꺼졌습니다.
         */

        AirconditionerController airconditionerController = new AirconditionerController(
                new PowerButton(),
                new TemperatureDownButton(),
                new TemperatureUpButton()
        );

        remoteController.onPressedPowerButton();

        airconditionerController.onPressedTemperatureDownButton();
        airconditionerController.onDownTemperatureDownButton();

        airconditionerController.onPressedTemperatureUpButton();
        airconditionerController.onUpTemperatureUpButton();

        remoteController.onPressedPowerButton();


    }
}
