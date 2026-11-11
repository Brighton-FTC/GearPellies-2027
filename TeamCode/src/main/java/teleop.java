import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class teleop extends LinearOpMode {
    @Override
    public void runOpMode(){
        Motor[] motors = {
                new Motor(hardwareMap, "front_left_drive"),
                new Motor(hardwareMap, "front_right_drive"),
                new Motor(hardwareMap, "back_left_drive"),
                new Motor(hardwareMap, "back_right_drive")
        };

        MecanumDrive drive =
                new MecanumDrive(motors[0],motors[1], motors[2], motors[3]);
        GamepadEx gamepad =
                new GamepadEx(gamepad1);

        waitForStart();

        while (!isStopRequested()){
            drive.driveRobotCentric(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x, true);
            sleep(20);
        }
         }
}
