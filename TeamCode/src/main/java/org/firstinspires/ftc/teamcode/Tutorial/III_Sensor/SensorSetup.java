//
// Make sure if you haven't already to start with MotorSetup
//

package org.firstinspires.ftc.teamcode.Tutorial.III_Sensor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.Utility_Code.MainUtil;

public class SensorSetup extends OpMode {

    MainUtil mainUtil;
    TouchSensor touchSensor;
    ColorSensor colorSensor;
    DistanceSensor distanceSensor;

    @Override
    public void init() {
        mainUtil = new MainUtil();
        mainUtil.init(hardwareMap);
        touchSensor = hardwareMap.get(TouchSensor.class, "touchSensor");
        colorSensor = hardwareMap.get(ColorSensor.class, "colorSensor");
        distanceSensor = hardwareMap.get(DistanceSensor.class, "distanceSensor");
    }

    @Override
    public void loop() {
        telemetry.addData("Touch Sensor Pressed:", !touchSensor.isPressed());
        telemetry.addData("Color Sensor RGB:", colorSensor.argb());
        telemetry.addData("Distance Sensor Distance", distanceSensor.getDistance(DistanceUnit.INCH));
    }
}
