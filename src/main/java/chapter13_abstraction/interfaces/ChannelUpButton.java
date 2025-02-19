package chapter13_abstraction.interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다");
    }

    @Override
    public void onUp() {
        super.onUp();
        System.out.println("채널을 계속 올립니다.");
    }
}
