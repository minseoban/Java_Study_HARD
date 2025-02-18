package chapter13_abstraction.interfaces;

public class PowerButton extends Button{
    // 필드 선언
    private boolean status;
    private String name;

    @Override
    public void onPressed() {
        if(status) {    // status == true라면 실행되니까
            status = false;
            System.out.println("전원을 끕니다.");
        } else {        // status == false면 실행되니까
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
