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
        goToPosition(180, 180, 0.5, 90, 0.5);
    }
}
