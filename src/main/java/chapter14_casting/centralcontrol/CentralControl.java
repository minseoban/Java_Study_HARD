package chapter14_casting.centralcontrol;

public class CentralControl {
    // field 선언
    private Power[] deviceArray;
    // 필드를 배열로 선언한 경우가 처음이기 때문에 주목해서 보겠습니다.


    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 전자 제품들을 CentralControl의 객체의 필드인 배열에 집어넣는 메서드
    public void addDevice(Power device) {
        // 왜 Computer / LED / Speaker가 아니라 상위 클래스인 Power인지를 생각해볼 필요가 있다.

        int emptyIndex = checkEmpty();  // 이 메서드의 return 값의 자료형은? -> int
        // 현재 빨간줄 뜨는거 정상 -> checkEmpty라는 메서드를 저희가
        // 정의한적이 없기 때문에.
        // 개발 환경 상에서는 만들다보면 추가적으로 메서드 구현이 필요한 경우가 있습니다.
        // 그래서 checkEmpty()를 먼저 정의하고 addDevice()구현할 수도 있겠지만
        // 일부러 좀 순서를 꼬아서 작성한 사례를 남기고자 합니다.
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        // 객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력되는 getter
        // 객체명.getClass().getSimpleName() -> 패키지명을 제거한 클래스명만 출력 -> getter 응용
    }

    public int checkEmpty() {   // 비어있는 배열의 index 넘버를 반환하도록 하는 메서드 정의

        // 배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스를 리턴할 예정
        //인덱스 넘버를 뽑아내야 하기 때문에 향상된 for문으로는 좀 어렵습니다.
        for (int i = 0 ; i < deviceArray.length ; i++) {
            if(deviceArray[i] == null ) {
                return i;
            }
        }
        return -1;
        // 자바의 인덱스 넘버에는 음수값이 없기 때문에(python에서는 마이너스인덱스 개념이 있습니다),
        // 실패를 나타낼 때 -1을 쓰는 경우가 많습니다. 하지만 0과 너무 가까운 수이다 보니 - 100이라든지
        // 아예 return값으로 나올 수 없을만한 음수로 정의하는 경우도 있습니다.
    }

    // 이상의 코드 라인들은 Power의 implements를 받은 클래스의 객체들을 배열에 집어넣는 과정입니다.
    // 왜 집어넣는가 하니까 -> 배열 내를 반복문 돌려 각 Power[]의 서브 객체들의 공통된 overriding된
    // 메서드들을 전부 한 번에 실행시키기 위하여.

    public void powerOn() {
        // 배열 내부에 있는 요소들(객체들 -> Power의 서브 클래스들의 인스턴스)의 공통적인 메서드(오버라이딩된 메서드들)인
        // .on()을 실행시킬 예정입니다.

        // 해당 경우에 생겨날 수 있는 문제점 :
        //  배열의 특정 인덱스 내에 아무런 객체가 없는 상황이라면 .on()을 실행시켰을 때,
        // 컴파일링 에러가 발생할 확률이 있으므로, 이를 고려한 로직을 작성해야만 할 것입니다.

        // 배열을 도는 반복문

        // 반복문 내부에서 조건문 작성해야합니다. 특정 element가 null 이라면
        // continue를 통해서 다음 반복으로 넘어가야 함.
        // 걔를 통과하면 어떡하면 된다? .on()을 실행시키면 됩니다.
//        for (int i = 0 ; i < deviceArray.length ; i++) {
//            if(deviceArray[i] == null) {
//                System.out.println((i+1) + " : 부분은 비어있습니다.");
//                continue;
//            }
//            deviceArray[i].on;
//        }

        // 이상의 반복문 및 조건문에 해당하는 부분을 향상된 for문으로 작성하시오.
        for (Power device : deviceArray) {
            if(device == null) {
                continue;
            }
            device.on();
        }
    }

    // powerOff() 메서드를 정의하시오 -> 일반 for문 / 향상된 for문으로 한 번.

    public void powerOff() {
//        for (Power device : deviceArray) {
//            if(device == null) {
//                continue;
//            }
//            device.off();
//        }

        for (int i = 0 ; i < deviceArray.length ; i++) {
            if(deviceArray[i] == null) {
                System.out.println((i+1) + " : 부분은 비어있습니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    // 배열 내부를 돌면서 각 요소의 고유 메서드들을 호출하는 메서드
    public void performSpecificMethod() {
        // 향상된 for문으로 작성
        for (Power device : deviceArray) {
            // deviceArray 내부에 있는 element라면 기본적으로 Power 인터페이스의 메서드들을
            // 구현 받은 클래스들의 인스턴스가 될겁니다.
            // 그래서 해당 Power의 서브 객체들이 특정 클래스에 해당한다면 그 객체의 고유 메서드를
            // 실행시키겠습니다
            if (device instanceof Computer) {
                Computer computer = (Computer) device;  // 이 코드가 실행된다면 device는 Computer
                // 클래스의 객체라는 의미이므로 명시적 다운캐스팅을 하더라도 문제가 발생 x
                computer.compute();
            } else if (device instanceof LED) {
                // 다운캐스팅 코드
                LED led = (LED) device;
                // LED 클래스의 고유 메서드를 실행
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
                // Speaker에 changeEqual() "이퀄라이저를 변경합니다"를 추가하여 여기서 실행시키세요
                // Tv changeChannel() "채널을 변경합니다"를 추가하여 여기서 실행시키세요
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof Tv) {
                Tv tv = (Tv) device;
                tv.changeChannel();
            }
        }
    }

    public Power[] getDeviceArray() {
        return deviceArray;
    }

    public void displayInfo() {
        int i = 1;
        System.out.println("현재 연결된 장치 목록 : ");
        for (Power device : deviceArray) {
            // 만약에 device가 null이라면 무시하고 지나갈 수 있도록 작성
            if (device == null) {
                System.out.println("슬롯 [ " + i + " ] 번 : 비어있음");
                continue;
            }
            System.out.println("슬롯 [ " + i + " ] 번 : " + device.getClass().getSimpleName());
            i++;
        }
    }


}