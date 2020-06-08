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
        //allPoints.add(new CurvePoint(50, 50, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(180, 180, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(50, 180, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(50, 50, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(300, 50, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(300, 300, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(50, 300, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(50, 290, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(290, 290, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(290, 60, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(60, 60, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(60, 170, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(190, 170, 0.5, 0.3, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(190, 190, 0.5, 0.3, 50, Math.toRadians(50), 1.0));

        followCurve(allPoints, Math.toRadians(90));
    }
}
