/*
*
* Welcome to the Unofficial FIRST Tech Challenge Programming Walkthrough
*
* In this walkthrough you will learn how to set up something like a motor
* all the way up to a camera.
*
* You will also learn how to program a Teleop and Autonomous
*
* If you want to learn the basics of programming I would go to FIRST's
* FTCSIM, https://ftcsim.org/, to learn the basics of programming but if
* you are trying to make the switch to programming in Java and know the
* basics keep going on after this to learn more.
*
* One last thing, MAKE SURE TO END WITH SEMICOLONS!!! (;)
*
* KEY:
*
* Colon :
* Semicolon ;
* Parentheses ()
* Bracket []
* Curly Bracket or Braces {}
* Quotation Marks ""
* Asterisk *
*
* */


// This assigns the class to a designated
//  V V V folder on your computer V V V
package org.firstinspires.ftc.teamcode.First_Step.I;

// The imports are using First's code they've already
// set up for you to use that will aid you in programming
// so you're not starting from scratch. V V V
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

// This references another one of the classes I have setup
// but I will explain more about it later.
import org.firstinspires.ftc.teamcode.utility_code.MainUtil;


// The @Autonomous is there to declare that this will
// be in the autonomous section of the driver's hub.
// The name will be the class name unless otherwise
// defined by putting parentheses and setting the
// name to something else but must be put in parentheses.
// you can also change the group inside of the parentheses.
@Autonomous(name = "First Step 1 - Motor", group = "Autonomous")
public class MotorSetup extends OpMode {
    MainUtil mainUtil; // We will explain this later on


    // this is defining a motor as a variable so
    // it can be used later to set the power or velocity.
    // We will be using power for now and explaining velocity
    // later. The "public" means that any other class can
    // utilize the variable, the "DcMotorEx" defines the
    // variable as being a motor and the "Motor" is the
    // name of the actual variable that you will use later on.
    public DcMotorEx Motor;

    // On the driver's hub when you click Init this is
    // the code that runs. It allows you to set up motors and
    // sensors and run any last bits of code you need that will
    // be used in the loop or the rest of the class like our
    // other class that we declare inside of the Init function.
    @Override
    public void init() {
        mainUtil = new MainUtil(); // This defines the variable we
        // said we would explain later
        mainUtil.init(hardwareMap); // Function from said variable.

        // This uses the motor variable we declared earlier to set it up
        // declaring the identifier you will use in the Driver's Hub during
        // config, the direction the motor is going so if the motor is moving
        // the wrong way you can swap between FORWARD and REVERSE, and you can
        // inform the function of whether or not there are encoders.
        Motor = mainUtil.setUpEncoderMotor("motor", DcMotorSimple.Direction.FORWARD, false);
    }

    @Override
    public void loop() {
        Motor.setPower(0.5); // sends in an amount of power towards the motor
        // but is somewhat inconsistent when running but still useful.
    }
}
