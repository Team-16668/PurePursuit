package treamcode;

public class TestOpMode extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        RobotMovement.goToPosition(358/2, 358/2, 1, Math.toRadians(90), 1);


    }
}
