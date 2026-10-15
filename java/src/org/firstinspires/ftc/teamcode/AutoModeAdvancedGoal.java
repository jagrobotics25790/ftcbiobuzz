// /*
// Copyright 2025 FIRST Tech Challenge Team 25790

// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
// associated documentation files (the "Software"), to deal in the Software without restriction,
// including without limitation the rights to use, copy, modify, merge, publish, distribute,
// sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:

// The above copyright notice and this permission notice shall be included in all copies or substantial
// portions of the Software.

// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
// NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
// DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
// */
// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// import com.qualcomm.robotcore.hardware.Gamepad;
// import com.qualcomm.robotcore.robot.Robot;
// import com.qualcomm.robotcore.eventloop.opmode.Disabled;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.util.ElapsedTime;

// /**
//  * This file contains a minimal example of a Linear "OpMode". An OpMode is a 'program' that runs
//  * in either the autonomous or the TeleOp period of an FTC match. The names of OpModes appear on
//  * the menu of the FTC Driver Station. When an selection is made from the menu, the corresponding
//  * OpMode class is instantiated on the Robot Controller and executed.
//  *
//  * Remove the @Disabled annotation on the next line or two (if present) to add this OpMode to the
//  * Driver Station OpMode list, or add a @Disabled annotation to prevent this OpMode from being
//  * added to the Driver Station.
//  */
 
// public class AutoModeAdvancedGoal extends AutoOpMode {
//     private final boolean USE_TIMINGS = false;
//     private final double Y_POS = 40.0;
    
//     private boolean triggered = false;
    
//     @Override
//     public void opLoop() {
//         super.opLoop();
//         switch (stage) {
//             case 0:
//                 moveRobot(0,-1,0,0.3);
//                 if (USE_TIMINGS && stageTimer.seconds() >= 4) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 if (!USE_TIMINGS && posY >= Y_POS) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             case 1:
//                 moveRobot(0,0,0,0.3);
//                 if (stageTimer.seconds() >= 0.5) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             case 2:
//             // case 3:
//             // case 4:
//                 launch(true);
//                 if (stageTimer.seconds() >= 12) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             // case 5:
//             case 3:
//                 moveRobot(color == "blue" ? -1 : 1,0,0,0.3);
//                 if (stageTimer.seconds() >= 0.5) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             // case 6:
//             case 4:
//                 moveRobot(0,0,color == "blue" ? 1 : -1,0.3);
//                 if (stageTimer.seconds() >= 2.75) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             // case 7:
//             // case 9:
//             case 5:
//             case 7:
//                 moveRobot(0,-1,0,0.3);
//                 intakeMotor.setPower(1);
//                 if (stageTimer.seconds() >= 2 || colorSensor.blue() >= 300) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             // case 8:
//             // case 10:
//             case 6:
//             case 8:
//                 moveRobot(0,0,0,0.3);
//                 intakeMotor.setPower(1);
//                 if (!triggered) {
//                     triggered = true;
//                     store();
//                 }
//                 if (stageTimer.seconds() >= 1) {
//                     stageTimer.reset();
//                     triggered = false;
//                     stage++;
//                 }
//                 break;
//             // case 11:
//             case 9:
//                 moveRobot(0,1,0,0.3);
//                 intakeMotor.setPower(0);
//                 if (stageTimer.seconds() >= 2) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             // case 12:
//             case 10:
//                 moveRobot(0,0,color == "blue" ? -1 : 1,0.3);
//                 if (stageTimer.seconds() >= 3) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             // case 13:
//             case 11:
//                 moveRobot(0,0,0,0.3);
//                 stage++;
//                 stageTimer.reset();
//                 break;
//             // case 14:
//             case 12:
//                 launch(true);
//                 if (stageTimer.seconds() >= 7) {
//                     stageTimer.reset();
//                     stage++;
//                 }
//                 break;
//             // case 15:
//             case 13:
//                 moveRobot(color == "blue" ? -1 : 1,0,0,1);
//                 break;
//             default:
//                 break;
//         }
//     }
// }
