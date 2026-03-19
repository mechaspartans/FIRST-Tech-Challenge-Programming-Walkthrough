package org.firstinspires.ftc.teamcode.Utility_Code;

import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE;

import static java.lang.Thread.sleep;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MainUtil {
    public DcMotorEx driveFrontLeft;
    public DcMotorEx driveFrontRight;
    public DcMotorEx driveBackLeft;
    public DcMotorEx driveBackRight;
    HardwareMap hwMap = null;

    public DcMotorEx setUpEncoderMotor(String identifier, DcMotor.Direction direction, boolean withEncoder) {
        DcMotorEx drive = hwMap.get(DcMotorEx.class, identifier);
        drive.setDirection(direction);
        drive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drive.setZeroPowerBehavior(BRAKE);
        drive.setPower(0);
        if (!withEncoder) {
            drive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        } else {
            drive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }

        return drive;
    }
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;
    }
    public void goingFor(long millis) {
        try {
            sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
