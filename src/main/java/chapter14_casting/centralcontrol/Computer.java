package chapter14_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    // 다운캐스팅을 다시 해서 특정 클래스의 고유 메서드를 실행시키도록 할 예정
    public void compute() {
        System.out.println("컴퓨터에서 계산을 수행합니다.");
    }
}