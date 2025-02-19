package chapter13_abstraction.interfaces;

public class AirconditionerController {
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    public AirconditionerController(PowerButton powerButton,
                                    TemperatureDownButton temperatureDownButton,
                                    TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }

    // TemperatureDownButton의 메서드를 구현
    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    // TemperatureUpButton의 메서드를 구현
    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    public void onUpTemperatureUpButton() {
        temperatureUpButton.onUp();
    }


}
