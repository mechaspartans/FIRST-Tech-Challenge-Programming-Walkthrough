//
// Make sure if you haven't already to start with MotorSetup
//

package org.firstinspires.ftc.teamcode.Tutorial.Autonomous.II_Servo;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Utility_Code.MainUtil;

@Autonomous(name = "2 - Servo", group = "Tutorial")
public class ServoSetup extends OpMode {
    MainUtil mainUtil;


    // This defines the servo as a variable
    // and it can be used later to set the
    // position of the servo.
    public Servo servo;

    @Override
    public void init() {
        mainUtil = new MainUtil();
        mainUtil.init(hardwareMap);
        // The servo doesn't have anything about encoders,
        // because they don't use them, or direction but
        // you can set direction later on if needed by
        // just putting the variable name and then adding
        // .Direction.(FORWARD or REVERSE)
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        // The servo uses position instead of just
        // setting a power like motors do. You can
        // set the 0 and 1 position by using
        // a servo programmer to set the range the
        // servo can go.
        servo.setPosition(1);
        mainUtil.goingFor(1000);
        servo.setPosition(0);
        mainUtil.goingFor(1000);
    }
}

// Go to the next class which is SensorSetup
