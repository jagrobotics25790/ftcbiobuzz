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
import java.util.*;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.robot.Robot;
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
 
public class AutoModeGoal extends AutoOpMode {
    private final boolean USE_TIMINGS = false;
    private final boolean AUTO_LAUNCH = false;
    private final double Y_POS = 43.0;
    private final boolean doSort = true;
    
    private int cycle = 0;
    private HashMap<Integer, Integer> motifOccurances = new HashMap<Integer,Integer>();
    
    @Override
    public void opInit() {
        super.opInit();
        motifOccurances.put(21, 0);
        motifOccurances.put(22, 0);
        motifOccurances.put(23, 0);
    }
    
    @Override
    public void opLoop() {
        super.opLoop(); //calls itself
        // print("suggestions", motifOccurances);
        print("=================");
        print("=================");
        print("IMPORTANT", motif, cycle, stageTimer.seconds());
        print("=================");
        print("=================");
        // print("cycle", cycle);
        switch (stage) {
            case 0:
                detectMotifs();
                if (stageTimer.seconds() >= 5 || !doSort) {
                    stage++;
                    stageTimer.reset();
                }
                break;
            case 1:
                motif = maxHashMap(motifOccurances);
                cycle = (24 - motif) % 3;
                stageTimer.reset();
                stage++;
                break;
            case 2:
                if (stageTimer.seconds() <= 1) break;
                if (cycle > 0 && doSort) {
                    cycle();
                    stageTimer.reset();
                    cycle--;
                } else {
                    cycle--;
                    stageTimer.reset();
                    stage++;
                }
                break;
            case 3:
                if (stageTimer.seconds() <= 1) break;
                stage++;
                stageTimer.reset();
                break;
            case 4:
                moveRobot(0, 1, 0, 0.5);
                if (stageTimer.seconds() >= 0.2) {
                    stage++;
                    stageTimer.reset();
                }
                break;
            case 5:
                moveRobot(0, 0, 0, 0);
                launch();
                stage++;
                stageTimer.reset();
                break;
            case 6:
                if (stageTimer.seconds() >= 15) {
                    stage++;
                    stageTimer.reset();
                }
                break;
            case 7:
                moveRobot(color == "red" ? -1 : 1, 0.4, 0, 0.4);
                if (stageTimer.seconds() >= 3) {
                    stage++;
                    stageTimer.reset();
                }
                break;
            case 8:
                moveRobot(0, 0, 0, 0);
                break;
            default:
                break;
        }
    }
    
    private Integer maxHashMap(Map<Integer,Integer> map) {
        int max_key = -1;
        int max_val = -1;
        for (Map.Entry<Integer,Integer> item : map.entrySet()) {
            int key = item.getKey();
            int val = item.getValue();
            if (val < max_val) continue;
            max_key = key;
            max_val = val;
        }
        return max_key;
    }
    
    private void detectMotifs() {
        double furthest_bearing = 0;
        int furthest_id = -1;
        for (AprilTagDetection detection : aprilTagDetections) {
            if (detection.metadata != null) {
                if (detection.id < 21 || detection.id > 23) continue;
                    print("detection", detection.id, detection.ftcPose.bearing);
                if ((color == "blue" && detection.ftcPose.bearing <= furthest_bearing)
                 || (color == "red" && detection.ftcPose.bearing >= furthest_bearing)) {
                    furthest_bearing = detection.ftcPose.bearing;
                    furthest_id = detection.id;
                }
            }
        }
        if (furthest_id == -1) return;
        motifOccurances.put(furthest_id, motifOccurances.get(furthest_id) + 1);
    }
}
