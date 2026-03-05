/*
* Make sure if you haven't already to start with MotorSetup
* */

package org.firstinspires.ftc.teamcode.Tutorial.II_Servo;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.utility_code.MainUtil;

@Autonomous(name = "2 - Servo", group = "Tutorial")
public class ServoSetup extends OpMode {
    MainUtil mainUtil;


    //
    public Servo Servo;

    @Override
    public void init() {
        mainUtil = new MainUtil();
        mainUtil.init(hardwareMap);
        Servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        Servo.setPosition(1);
        mainUtil.goingFor(1000);
        Servo.setPosition(0);
        mainUtil.goingFor(1000);
    }
}

// Go to the next class which is SensorSetup
