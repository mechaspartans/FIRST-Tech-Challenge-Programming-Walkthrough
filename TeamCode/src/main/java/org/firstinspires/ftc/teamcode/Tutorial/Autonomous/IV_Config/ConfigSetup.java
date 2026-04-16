// This config setup explains how to use a driver's hub.
// This will show you how to set a motor or a servo in
// the config.
//
// On the driver hub make sure there is the FTC Driver Station
// app and open it. Then connect to your robot through wifi
// and click the three dots in the top right corner.
// Then open configure robot and make a new configuration,
// name it whatever you want, and open it. If you have a
// expansion hub make sure when you open the
// Control Hub Portal there is Expansion Hub otherwise
// you need to go back and scan to see if the Expansion Hub
// is connected and if it doesn't show up make sure the Expansion
// Hub is plugged in, the light is on, and the Control Hub and
// Expansion Hub are connected. Then go into the Control Hub
// or Expansion Hub folder in the config and go to motor's and
// set whichever port the wire is in to "motor" without
// quotation marks and go to servo's then set whichever port the
// wire is in to "servo" without quotation marks. Then for JUST
// the touch sensor go into Digital Devices and set the name of
// the sensor to "touchSensor". Then go to I2C Bus 0 and put Color
// sensor as "colorSensor" and go to I2C Bus 1 and add then change
// the name to "distanceSensor". It should work with the code below now.

package org.firstinspires.ftc.teamcode.Tutorial.Autonomous.IV_Config;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Utility_Code.MainUtil;

public class ConfigSetup extends OpMode {
    MainUtil mainUtil;

    public DcMotorEx motor;
    public Servo servo;

    @Override
    public void init() {
        mainUtil = new MainUtil();
        mainUtil.init(hardwareMap);

        motor = mainUtil.setUpEncoderMotor("motor", DcMotorSimple.Direction.FORWARD, false);
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {

    }
}
