// package org.firstinspires.ftc.teamcode;
// 
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;
// 
// @TeleOp
// public class TestTeleOp extends LinearOpMode {
//     DcMotor flDrive = null;
//     DcMotor frDrive = null;
//     DcMotor blDrive = null;
//     DcMotor brDrive = null;
//  
//     @Override
//     public void runOpMode() {
//         flDrive = hardwareMap.get(DcMotor.class, "fl_motor");
//         frDrive = hardwareMap.get(DcMotor.class, "fr_motor");
//         blDrive = hardwareMap.get(DcMotor.class, "bl_motor");
//         brDrive = hardwareMap.get(DcMotor.class, "br_motor");
//         blDrive.setDirection(DcMotor.Direction.REVERSE);
//         brDrive.setDirection(DcMotor.Direction.REVERSE);
//         waitForStart();
//         while (opModeIsActive()) {
//             flDrive.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
//             frDrive.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
//             blDrive.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
//             brDrive.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
//         }
//     }
// }