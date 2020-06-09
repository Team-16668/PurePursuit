package treamcode;

import java.util.ArrayList;

import static treamcode.RobotMovement.followCurve;

public class MyOpMode extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        ArrayList<CurvePoint> allPoints = new ArrayList<>();
        allPoints.add(new CurvePoint(140, 140, 1, 1, 25, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(180, 140, 1, 1, 25, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(180, 50, 1, 1, 25, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(300, 50, 1, 1, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(300, 300, 1, 1, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(50, 300, 1, 1, 50, Math.toRadians(50), 1.0));

        followCurve(allPoints, Math.toRadians(90));
    }
}
