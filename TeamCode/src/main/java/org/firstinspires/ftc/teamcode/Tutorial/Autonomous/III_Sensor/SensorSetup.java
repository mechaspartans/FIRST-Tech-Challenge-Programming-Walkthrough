//
// Make sure if you haven't already to start with MotorSetup
//

package org.firstinspires.ftc.teamcode.Tutorial.Autonomous.III_Sensor;

import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.Utility_Code.MainUtil;
@Autonomous (name = "3 - Sensor", group = "Tutorial")
public class SensorSetup extends OpMode {

    MainUtil mainUtil;
    // Following sensors defined as
    // variables allowing them to be
    // used later on when programming
    TouchSensor touchSensor;
    RevColorSensorV3 colorSensor;
    DistanceSensor distanceSensor;

    @Override
    public void init() {
        mainUtil = new MainUtil();
        mainUtil.init(hardwareMap);
        // Sets the sensors as specific hardware
        // with names that will be used for setting
        // up config on driver's hub
        touchSensor = hardwareMap.get(TouchSensor.class, "touchSensor");
        colorSensor = hardwareMap.get(RevColorSensorV3.class, "colorSensor");
        distanceSensor = hardwareMap.get(DistanceSensor.class, "distanceSensor");
    }

    @Override
    public void loop() {
        // Telemetry prints whether or not the touch sensor
        // is currently being pressed, the values of the
        // Color Sensor in RGB, and the distance an object
        // is from the Distance Sensor
        telemetry.addData("Touch Sensor Pressed", touchSensor.isPressed());
        telemetry.addData("Color Sensor RGB", String.valueOf(colorSensor.red()) + ", " + String.valueOf(colorSensor.green()) + ", " + String.valueOf(colorSensor.blue()));
        telemetry.addData("Distance Sensor Distance", distanceSensor.getDistance(DistanceUnit.INCH));
    }
}

// Go to the next class which is ConfigSetup
