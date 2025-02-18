package chapter13_abstraction.interfaces;
/*
    이 부분에서 고려해야할 점은
    자바는 단일 상속만 가능하기 때문에
    VU / VD / PB 셋 중에 하나만 상속할 수 있을 것 같은데
    어떻게 VU / VD / PB 여기에 있는 애들의 메서드들을 전부 다 사용하게 작성할 수 있을까
    입니다.
 */
public class RemoteController {
    // 상속 안 받습니다
    // 필드 선언 -> 이전까지는 Java의 기본 자료형만을 사용했지만
    // 이번에 처음으로 우리가 직접 정의한 클래스가 자료형이 되는 필드를 적용했습니다.
    private PowerButton powerButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public RemoteController(PowerButton powerButton,
                            VolumeDownButton volumeDownButton,
                            VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 메서드 구현
    // PowerButton의 메서드를 구현
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    // VolumeDownButton의 메서드를 구현
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    // VolumeUpButton의 메서드를 구현
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }
}
