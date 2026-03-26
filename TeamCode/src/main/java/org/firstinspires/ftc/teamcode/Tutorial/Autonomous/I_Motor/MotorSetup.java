//
// Welcome to the Unofficial FIRST Tech Challenge Programming Walkthrough
//
// In this walkthrough you will learn how to set up something like a motor
// all the way up to a camera.
//
// You will also learn how to program a Teleop and Autonomous
//
// If you want to learn the basics of programming I would go to FIRST's
// FTCSIM, https://ftcsim.org/, to learn the basics of programming but if
// you are trying to make the switch to programming in Java and know the
// basics keep going on after this to learn more.
//
// One last thing, MAKE SURE TO END WITH SEMICOLONS!!! (;)
//
// KEY:
//
// Colon :
// Semicolon ;
// Parentheses ()
// Bracket []
// Curly Bracket/Braces {}
// Quotation Marks ""
// Asterisk *
// Slash /
// Backslash \
//


// In this example it will run the motor at half
// speed for a second, stop the motor for a second,
// and run continuously until the code is stopped.


// This assigns the class to a designated
//  V V V folder on your computer V V V
package org.firstinspires.ftc.teamcode.Tutorial.Autonomous.I_Motor;

// The imports are using FIRST's code they've already
// set up for you to use that will aid you in programming
// so you're not starting from scratch. V V V
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

// This references a utility class I have setup that
// you can use in other classes to utilize the functions
// and variables, but there are more details later.
import org.firstinspires.ftc.teamcode.Utility_Code.MainUtil;


// The @Autonomous is there to declare that this will
// be in the autonomous section of the driver's hub.
// The name will be the class name unless otherwise
// defined by putting parentheses and setting the
// name to something else but must be put in parentheses.
@Autonomous(name = "1 - Motor", group = "Tutorial")
public class MotorSetup extends OpMode {
    MainUtil mainUtil; // Sets up access to our utility class


    // This is defining a motor as a variable so
    // it can be used later to set the power or velocity.
    // We will be using power for now and explaining velocity
    // later. The "public" means that any other class can
    // utilize the variable, the "DcMotorEx" defines the
    // variable as being a motor and the "Motor" is the
    // name of the actual variable that you will use later on.
    public DcMotorEx motor;

    // On the driver's hub when you click Init this is
    // the code that runs. It allows you to set up motors and
    // sensors and run any last bits of code you need that will
    // be used in the loop or the rest of the class like our
    // other class that we declare inside of the Init function.
    @Override
    public void init() {
        mainUtil = new MainUtil(); // This defines the new instance of the utility code
        mainUtil.init(hardwareMap); // Initializes the utility with the hardwaremap.

        // This uses the motor variable we declared earlier to set it up
        // declaring the identifier you will use in the Driver Hub during
        // config, the direction the motor is going so if the motor is moving
        // the wrong way you can swap between FORWARD and REVERSE, and you can
        // inform the function of whether or not there are encoders.
        motor = mainUtil.setUpEncoderMotor("motor", DcMotorSimple.Direction.FORWARD, false); // Make sure to set the motor in config to the identifier
    }

    // The loop function below runs repeatedly
    // once you click the start button running
    // for as long as the code is running on the
    // driver's hub. This will also allow for you
    // to use controller input later on for teleop.
    @Override
    public void loop() {
        // sends in an amount of power towards the motor but
        // is somewhat inconsistent when running but still useful.
        motor.setPower(0.5);

        // This runs the code before it for
        // a certain amount of milliseconds set.
        mainUtil.goingFor(1000);

        // These next lines set the power to 0 for 1 second
        // and then the loop repeats.
        motor.setPower(0);
        mainUtil.goingFor(1000);
    }
}

// Go to the next class which is ServoSetup
