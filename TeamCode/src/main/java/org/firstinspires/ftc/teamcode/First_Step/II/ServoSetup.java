package org.firstinspires.ftc.teamcode.First_Step.II;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.utility_code.MainUtil;

public class ServoSetup extends OpMode {
    MainUtil mainUtil;

    @Override
    public void init() {
        mainUtil = new MainUtil();
        mainUtil.init(hardwareMap);
    }

    @Override
    public void loop() {

    }
}
