package chapter13_abstraction.interfaces;

public class TemperatureUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("온도를 한 칸 올립니다");
    }

    @Override
    public void onUp() {
        super.onUp();
        System.out.println("온도를 계속 올립니다.");
    }
}
