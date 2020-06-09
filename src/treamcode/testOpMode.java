package treamcode;

import java.util.ArrayList;

import static treamcode.RobotMovement.followCurve;
import static treamcode.RobotMovement.goToPosition;

public class testOpMode extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        goToPosition(300, 300, 1, Math.toRadians(90), 1);
    }
}
