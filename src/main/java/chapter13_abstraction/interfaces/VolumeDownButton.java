package chapter13_abstraction.interfaces;

public class VolumeDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 내립니다");
    }

    @Override
    public void onDown() {
        super.onDown();     // 슈퍼 클래스의 메서드를 호출하는 키워드였습니다.
        // 근데 구현한게 없어서 있어도 그만 없어도 그만입니다. 여기서는 남겨놓겠습니다.
        // 그리고 VolumeUpButton에서는 없애서 비교하도록 하겠습니다.
        System.out.println("음량을 계속 내립니다.");
    }
}
// VolumeUpButton에 동일하게 onPressed() 및 onUp() 메서드를 가지고 와서 구현하시오.
