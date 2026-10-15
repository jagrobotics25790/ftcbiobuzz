/*
Copyright 2025 FIRST Tech Challenge Team 25790

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
associated documentation files (the "Software"), to deal in the Software without restriction,
including without limitation the rights to use, copy, modify, merge, publish, distribute,
sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial
portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.robot.Robot;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * This file contains a minimal example of a Linear "OpMode". An OpMode is a 'program' that runs
 * in either the autonomous or the TeleOp period of an FTC match. The names of OpModes appear on
 * the menu of the FTC Driver Station. When an selection is made from the menu, the corresponding
 * OpMode class is instantiated on the Robot Controller and executed.
 *
 * Remove the @Disabled annotation on the next line or two (if present) to add this OpMode to the
 * Driver Station OpMode list, or add a @Disabled annotation to prevent this OpMode from being
 * added to the Driver Station.
 */
@TeleOp(name="_ Outreach: Full Speed")
public class OutreachFullSpeed extends RobotControl {
    Boolean slowMode = false;
    Boolean isLifted = false;
    double pos = 0.0;
    
    @Override
    public void opInit() {
        this.MAX_LAUNCH_POWER = 1.0;
        slowMode = false;
        isLifted = false;
    }
    
    @Override
    public void opLoop() {
        // printTimes();
        // printStages();
        
        // if (controller1.left_stick_button && !controller1Prev.left_stick_button) slowMode = !slowMode;
        // handleVibrations();
        moveRobot(controller1.left_stick_x, -controller1.left_stick_y, controller1.right_stick_x, 1.0);    
        // if (controller1.y && !controller1Prev.y) isLifted = true;
        // setLifted(isLifted);
        // print("Slow", slowMode);
        // print("Lifted", isLifted);
        // runIntakeMotor(controller1.left_trigger >= 0.2);
        // if (controller1.left_trigger < 0.2 && controller1.right_trigger >= 0.2) {
        //     intakeMotor.setPower(-1);
        // }
        
        // if (controller1.left_bumper && !controller1Prev.left_bumper && ballsCollected < 3) {
        //     store();
        // }
        
        // if (controller1.right_bumper && !controller1Prev.right_bumper) {
        //     double min = 0.95;
        //     double max = 1;
        //     launch((Math.random() * min) + (max - min));
        // }
        
        // // if (controller1.dpad_up && !controller1Prev.dpad_up) {
        // //     launch(1.0);
        // // }
        
        // // if (controller1.dpad_down && !controller1Prev.dpad_down) {
        // //     launch(0.5);
        // // }
        
        // if (controller1.b && !controller1Prev.b) {
        //     undo();
        // }
        
        // // intakeServo.setPower(controller1.x ? 1.0 : 0);
        
        // // frontLeftDrive.setPower(controller1.left_trigger);
        // // servo1.setPosition(controller1.right_trigger);
        // // servo2.setPosition(controller1.right_trigger);
        // // servo3.setPosition(controller1.right_trigger);
    }
    
    private void handleVibrations() {
        int remaining = (int) getRemainingTimeSeconds();
        switch (remaining) {
            default:
                return;
            case 60 + 30:
            case 60:
            case 30:
            case 10:
                vibrateSoft();
                break;
            case 20:
            case 5:
                vibrate();
                break;
        }
    }
}
