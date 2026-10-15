package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Prism.GoBildaPrismDriver.LayerHeight;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import java.util.List;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.ExposureControl;
import java.util.concurrent.TimeUnit;
import org.firstinspires.ftc.robotcore.external.hardware.camera.controls.GainControl;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.robotcore.external.navigation.Rotation;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

/*import org.firstinspires.ftc.teamcode.Prism.Color;
import org.firstinspires.ftc.teamcode.Prism.GoBildaPrismDriver;
import org.firstinspires.ftc.teamcode.Prism.PrismAnimations;
*/

public class RobotControl extends LinearOpMode {
    // Private Config
    public double MAX_LAUNCH_POWER = 1;
    private final double MIN_POWER = 0.40+0.02;//Thomas changed
    private final double ROTATION_POWER = 0.8;
    
    double TICKS_PER_REV = 28.0; // CONST DO NOT CHANGE
    
    boolean NEW_CODE = false;
    
    private double IDLE_RPM = 1700;
    private double CYCLE_RPM = 1700;
    // private double LAUNCH_RPM = 3000;
    public double LAUNCH_RPM = 3000;
    public double EJECT_RPM = 4500;
    // private final double X_POS_ADJ_RED = 5;
    // private final double X_POS_ADJ_BLUE = 11;
    // private final double X_POS_ADJ_RED = 3;
    // private final double X_POS_ADJ_BLUE = 7;
    private final double SLIDE_HEIGHT = 3800;
    private final boolean AUTO_INTAKE = false;
    public boolean AUTO_ADJUST = true;
    // public static long EXPOSURE = 10; // less = makes it darker; more makes it brigher; (in ms)
    public static long EXPOSURE = 10; // less = makes it darker; more makes it brigher; (in ms)
    public static double IN_CALIBRATION = 1.164;
    
    public static String color = "red";
    
    private int ticks = 0;
    private int tps = 0;
    
    public static double DEGREE_OFFSET = 10;
    
    private ElapsedTime elapsedTime = null;
    private ElapsedTime ticksTimer = null;
    private ElapsedTime stageTimer = null;
    private ElapsedTime lastLaunchTimer = null;
    private ElapsedTime ascentTimer = null;
    private ElapsedTime resetCounter = null;
    private ElapsedTime intakeTimer = null;
    
    private boolean doIntake = false;
    
    private double secondsSinceLastLaunch = -1;
    
    public int motif = -1;
    public boolean launchingAll = false;
    public boolean relaunching = false;
    
    // Private Objects
    private VisionPortal visionPortal;
    private AprilTagProcessor aprilTag;
    
    // Private waiters
    // private static ElapsedTime heightWaiter = new ElapsedTime();
    
    // Public Objects
    public List<AprilTagDetection> aprilTagDetections;
    
    // Position Variables
    public double posX = 0;
    public double posY = 0;
    public double bearing = 0;
    public double detectionId = -1;
    
    // DC Motors
    public DcMotor frontLeftDrive   = null;
    public DcMotor frontRightDrive  = null;
    public DcMotor backLeftDrive    = null;
    public DcMotor backRightDrive   = null;
    
    //public DcMotor leftSlide        = null;
    //public DcMotor rightSlide       = null;
    
    // public DcMotor intakeMotor      = null;
    public DcMotorEx launchMotor      = null;
    
    // Servo Motors
    public CRServo   leftServo           = null;
    public CRServo   rightServo          = null;
    
    // Sensors
    // public ColorSensor colorSensor  = null;
    
    public int ballsCollected = 0;
    public int ballsLaunched = 0;
    private int launchStage = -1;
    private int cycleStage = -1;
    private int liftStage = -1;
    private double launchPower = 1;
    
    public boolean lineUpEnabled = true;
    
    // Initial Values for DC Motors
    public double frontLeftPosition  = 0;
    // public double frontRightPosition = 0;
    // public double initialHeightLeft  = 0;
    // public double initialHeightRight = 0;
    
    Gamepad controller1     = new Gamepad();
    Gamepad controller2     = new Gamepad();

    Gamepad controller1Prev = new Gamepad();
    Gamepad controller2Prev = new Gamepad();
    
    /*static public GoBildaPrismDriver prism;
    static private PrismAnimations.Solid redSolid = new PrismAnimations.Solid(Color.RED);
    static private PrismAnimations.Solid blueSolid = new PrismAnimations.Solid(Color.BLUE);
    static private PrismAnimations.Solid greenSolid = new PrismAnimations.Solid(Color.GREEN);
    static private PrismAnimations.Solid yellowSolid = new PrismAnimations.Solid(Color.YELLOW);
    */
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        
        // Initialize DC Motors
        frontLeftDrive   = hardwareMap.get(DcMotor.class, "front_left_drive");
        frontLeftDrive   .setDirection(DcMotor.Direction.REVERSE);
        
        frontRightDrive  = hardwareMap.get(DcMotor.class, "front_right_drive");
        frontRightDrive  .setDirection(DcMotor.Direction.FORWARD);
        
        backLeftDrive    = hardwareMap.get(DcMotor.class, "back_left_drive");
        backLeftDrive    .setDirection(DcMotor.Direction.REVERSE);
        
        backRightDrive   = hardwareMap.get(DcMotor.class, "back_right_drive");
        backRightDrive   .setDirection(DcMotor.Direction.FORWARD);
        
        //leftSlide        = hardwareMap.get(DcMotor.class, "left_slide");
        //leftSlide        .setDirection(DcMotor.Direction.FORWARD);
        //leftSlide        .setMode(DcMotor.RunMode.RESET_ENCODERS);
        //leftSlide        .setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        
        //rightSlide       = hardwareMap.get(DcMotor.class, "right_slide");
        //rightSlide       .setDirection(DcMotor.Direction.REVERSE);
        //rightSlide       .setMode(DcMotor.RunMode.RESET_ENCODERS);
        //rightSlide       .setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        
        // intakeMotor      = hardwareMap.get(DcMotor.class, "intake_motor");
        // intakeMotor      .setDirection(DcMotor.Direction.REVERSE);
        
        //leftServo = hardwareMap.get(CRServo.class, "left_servo");
        //leftServo.setDirection(CRServo.Direction.FORWARD);
        //rightServo = hardwareMap.get(CRServo.class, "right_servo");
        //rightServo.setDirection(CRServo.Direction.REVERSE);
        
        //launchMotor      = hardwareMap.get(DcMotorEx.class, "launch_motor");
        //launchMotor      .setDirection(DcMotor.Direction.FORWARD);
        
        //launchMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //launchMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //launchMotor.setPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER,
        //new PIDFCoefficients(10, 0, 0, 12));
        
        //prism = hardwareMap.get(GoBildaPrismDriver.class,"prism");
        
        // colorSensor = hardwareMap.get(ColorSensor.class, "color_sensor");
        
        // Initialize April Tags
        //aprilTag = new AprilTagProcessor.Builder().build();
/*
        visionPortal = new VisionPortal.Builder()
            .setCamera(hardwareMap.get(WebcamName.class, "Webcam 1"))
            .addProcessor(aprilTag)
            .build();
            
        while (visionPortal.getCameraState() != VisionPortal.CameraState.STREAMING) {
            sleep(20);
        }
        
        ExposureControl exposureControl = visionPortal.getCameraControl(ExposureControl.class);
        
        if (exposureControl.getMode() != ExposureControl.Mode.Manual) {
            exposureControl.setMode(ExposureControl.Mode.Manual);
            sleep(50);
        }
        
        long minExp = exposureControl.getMinExposure(TimeUnit.MILLISECONDS);
        long maxExp = exposureControl.getMaxExposure(TimeUnit.MILLISECONDS);
        exposureControl.setExposure(EXPOSURE, TimeUnit.MILLISECONDS);
        
        GainControl gainControl = visionPortal.getCameraControl(GainControl.class);
        gainControl.setGain(gainControl.getMaxGain() / 2);
        */
        elapsedTime     = new ElapsedTime();
        ticksTimer      = new ElapsedTime();
        stageTimer      = new ElapsedTime();
        //lastLaunchTimer = new ElapsedTime();
        //ascentTimer     = new ElapsedTime();
        resetCounter    = new ElapsedTime();
        //intakeTimer     = new ElapsedTime();
        
        lineUpEnabled = true;
        /*
        redSolid.setBrightness(100);
        redSolid.setStartIndex(0);
        redSolid.setStopIndex(12 * 3);
        
        blueSolid.setBrightness(100);
        blueSolid.setStartIndex(0);
        blueSolid.setStopIndex(12 * 3);
        
        yellowSolid.setBrightness(100);
        yellowSolid.setStartIndex(0);
        yellowSolid.setStopIndex(12 * 3);
        
        greenSolid.setBrightness(100);
        greenSolid.setStartIndex(0);
        greenSolid.setStopIndex(12 * 3);
        */
        opInit();
        
        // Wait for the START input
        waitForStart();
        
        elapsedTime.reset();
        
        while (opModeIsActive()) {
            print("Status", "Running");
            print("stage", liftStage);
            print("TPS", tps);
            //double ticksPerSecond = launchMotor.getVelocity();
            //double rpm = (ticksPerSecond / TICKS_PER_REV) * 60.0;
            //print("Launching RPM", rpm);

            ticks++;
            if (ticksTimer.seconds() >= 1) {
                tps = ticks;
                ticks = 0;
                ticksTimer.reset();
            }
            
            //runLaunchMotor(IDLE_RPM);
            // if (AUTO_INTAKE) {
            //     print("color", colorSensor.red(), colorSensor.green(), colorSensor.blue(), intakeTimer.seconds(), doIntake);
            // }
            // print("April Tags", detectionId, posX, posY, bearing);
            controller1Prev.copy(controller1);
            controller2Prev.copy(controller2);
            controller1    .copy(gamepad1);
            controller2    .copy(gamepad2);
            /*
            aprilTagDetections = aprilTag.getDetections();
            for (AprilTagDetection detection : aprilTagDetections) {
                if (detection.metadata != null) {
                    // Left April Tag of Standing
                    // if (detection.id == 13 || detection.id == 16) {
                        posX = detection.ftcPose.x * IN_CALIBRATION;
                        posY = detection.ftcPose.y * IN_CALIBRATION;
                        bearing = detection.ftcPose.bearing;
                        detectionId = detection.id;
                    // }
                }
            }
            */
            // if (detectionId >= 21 && detectionId <= 23) {
            //     motif = (int) detectionId - 21;
            // }
            /*
            if (aprilTagDetections.size() == 0) {
                detectionId = -1;
            }
            */
            opLoop();
            /*
            if (liftStage != -1) {
                liftLoop();
            } else if (launchStage != -1) {
                launchLoop();
            } else if (cycleStage != -1) {
                cycleLoop();
            }
            */
            //telemetry.update();
        }
        
        //prism.clearAllAnimations();
    }
    
    public void opInit() {
        // Implementation In Op Modes
    }
    
    public void opLoop() {
        // Implementation In Op Modes
    }
    /*
    public void abortLaunch() {
        launchStage = -1;
    }*/
    /*
    private void launchLoop() {
        if (NEW_CODE) {
            double servoPower = 0.3;
            double ticksPerSecond = launchMotor.getVelocity();
            double rpm = (ticksPerSecond / TICKS_PER_REV) * 60.0;
            switch (launchStage) {
                case 0:
                    runLaunchMotor(LAUNCH_RPM);
                    if (stageTimer.seconds() >= 4 || rpm >= LAUNCH_RPM * 0.8) {
                        stageTimer.reset();
                        launchStage++;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                    runLaunchMotor(LAUNCH_RPM);
                    leftServo.setPower(servoPower);
                    rightServo.setPower(servoPower);
                    if (stageTimer.seconds() >= 2 || rpm <= LAUNCH_RPM * 0.8) {
                        stageTimer.reset();
                        launchStage++;
                    }
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    runLaunchMotor(LAUNCH_RPM);
                    leftServo.setPower(0);
                    rightServo.setPower(0);
                    // setColor("yellow");
                    if (stageTimer.seconds() >= 4 || rpm >= LAUNCH_RPM * 0.8) {
                        stageTimer.reset();
                        launchStage++;
                    }
                    break;
                case 9:
                    leftServo.setPower(0);
                    rightServo.setPower(0);
                    runLaunchMotor(IDLE_RPM);
                    if (stageTimer.seconds() >= 1) {
                        stageTimer.reset();
                        launchStage = -1;
                    }
                    break;
                default:
                    break;
            }
            return;
        }
        double servoPower = 0.3;
        double power = 1;
        
        // double s = lastLaunchTimer.seconds();
        // double power = (1/4) * (s - 2) + 0.4;
        // power = Math.min(Math.max(power, 0.4), 1.0);
        
        print("POWER", power);
        
        // 0.4 pwr sort
        
        switch (launchStage) {
            case 0:
                runLaunchMotor(LAUNCH_RPM);
                if (stageTimer.seconds() >= 2) {
                    stageTimer.reset();
                    launchStage++;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
                runLaunchMotor(LAUNCH_RPM);
                leftServo.setPower(servoPower);
                rightServo.setPower(servoPower);
                // setColor("green");
                if (stageTimer.seconds() >= 0.3) {
                    stageTimer.reset();
                    launchStage++;
                }
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                runLaunchMotor(LAUNCH_RPM);
                leftServo.setPower(0);
                rightServo.setPower(0);
                // setColor("yellow");
                if (stageTimer.seconds() >= 1) {
                    stageTimer.reset();
                    launchStage++;
                }
                break;
            case 9:
                leftServo.setPower(0);
                rightServo.setPower(0);
                runLaunchMotor(IDLE_RPM);
                if (stageTimer.seconds() >= 1) {
                    stageTimer.reset();
                    launchStage = -1;
                }
                break;
            default:
                break;
        }
    }
    */
    /*
    private void cycleLoop() {
        if (stageTimer.seconds() <= 0.3) {
            runLaunchMotor(CYCLE_RPM);
            leftServo.setPower(0.3);
            rightServo.setPower(0.3);
        } else {
            leftServo.setPower(0);
            rightServo.setPower(0);
            cycleStage = -1;
        }
    }
    */
    // public void setLaunchPower(boolean run) {
    //     double power = 0.8;
    //     if (detectionId == 20 || detectionId == 24) {
    //         power = (1 - MIN_POWER) * (posY / (180.0+48.00)) + MIN_POWER;//Thomas changed
    //     }
    // }
    
    public void moveRobot(double powerX, double powerY, double turnX) {
        moveRobot(clamp(-1, powerX, 1), clamp(-1, powerY, 1), clamp(-1, turnX, 1), 0.4);
    }
    
    public void moveRobot(double powerX, double powerY, double turnX, double maxPower) {
        frontLeftDrive .setPower((powerY + powerX + (turnX * ROTATION_POWER)) * maxPower * 1.0);
        frontRightDrive.setPower((powerY - powerX - (turnX * ROTATION_POWER)) * maxPower * 1.0);
        backLeftDrive  .setPower((powerY - powerX + (turnX * ROTATION_POWER)) * maxPower * 1.0);
        backRightDrive .setPower((powerY + powerX - (turnX * ROTATION_POWER)) * maxPower * 1.0);
        // posX -= powerX * 0.1;
        // posY -= powerY * 0.1;
    }
    
    public void lift() {
        liftStage = 0;
        ascentTimer.reset();
    }
    /*
    public void liftLoop() {
        // runLaunchMotor(0);
        switch (liftStage) {
            case 0:
                // if (ascentTimer.seconds() >= 2) {
                    liftStage++;
                // }
                break;
            case 1:
                double MAX_POWER = 1.0;
                double MIN_VALUE = 0;
                double MAX_VALUE = SLIDE_HEIGHT;
                double height = 1.0;
                double currentLeft = leftSlide.getCurrentPosition();
                double currentRight = rightSlide.getCurrentPosition();
                double targetPosition = (height * (MAX_VALUE - MIN_VALUE)) + MIN_VALUE;
                double powerLeft  = Math.min((targetPosition - currentLeft) / 1000, 1.0);
                double powerRight = Math.min((targetPosition - currentRight) / 1000, 1.0);
                leftSlide .setPower(powerLeft * MAX_POWER * 0.89);
                rightSlide.setPower(powerRight * MAX_POWER);
                break;
        }
    }
    */
    /*
    public void runLaunchMotor(double rpm) {
        double ticksPerSecond = (rpm * TICKS_PER_REV) / 60.0;
        
        launchMotor.setVelocity(ticksPerSecond);
    }
    */
    /*public void setColor(String color) {
        switch (color) {
            case "red":
                prism.insertAndUpdateAnimation(LayerHeight.LAYER_0, redSolid);
                break;
            case "blue":
                prism.insertAndUpdateAnimation(LayerHeight.LAYER_0, blueSolid);
                break;
            case "green":
                prism.insertAndUpdateAnimation(LayerHeight.LAYER_0, greenSolid);
                break;
            case "yellow":
                prism.insertAndUpdateAnimation(LayerHeight.LAYER_0, yellowSolid);
                break;
        }
    }*/
    
    public void launch() {
        launchStage = 0;
        stageTimer.reset();
        lastLaunchTimer.reset();
    }
    
    public void cycle() {
        cycleStage = 0;
        stageTimer.reset();
    }
    
    public int sign(double value) {
        return value >= 0 ? 1 : -1;
    }
    
    public double clamp(double min, double val, double max) {
        return Math.min(max, Math.max(min, val));
    }
    
    public void printTimes() {
        print();
        print("Time elapsed", getElapsedTimeSeconds());
        print("Time remaining", getRemainingTimeSeconds());
    }
    
    public void printStages() {
        print();
        print("Ball Collected", ballsCollected);
        print("Stage Timer (s)", stageTimer.seconds());
        print("Launch Stage", launchStage);
    }
    
    public void printControllerPrevStatuses() {
        print();
        print();
        print("Controller 1");
        print("a",                  controller1Prev.a);
        print("b",                  controller1Prev.b);
        print("x",                  controller1Prev.x);
        print("y",                  controller1Prev.y);
        print("dpad_up",            controller1Prev.dpad_up);
        print("dpad_left",          controller1Prev.dpad_left);
        print("dpad_down",          controller1Prev.dpad_down);
        print("dpad_right",         controller1Prev.dpad_right);
        print("left_stick_x",       controller1Prev.left_stick_x);
        print("left_stick_y",       controller1Prev.left_stick_y);
        print("left_stick_button",  controller1Prev.left_stick_button);
        print("right_stick_x",      controller1Prev.right_stick_x);
        print("right_stick_y",      controller1Prev.right_stick_y);
        print("right_stick_button", controller1Prev.right_stick_button);
        print("left_bumper",        controller1Prev.left_bumper);
        print("right_bumper",       controller1Prev.right_bumper);
        print("right_trigger",      controller1Prev.right_trigger);
        print("left_trigger",       controller1Prev.left_trigger);
        print();
        print();
        print("Controller 2");
        print("a",                  controller2Prev.a);
        print("b",                  controller2Prev.b);
        print("x",                  controller2Prev.x);
        print("y",                  controller2Prev.y);
        print("dpad_up",            controller2Prev.dpad_up);
        print("dpad_left",          controller2Prev.dpad_left);
        print("dpad_down",          controller2Prev.dpad_down);
        print("dpad_right",         controller2Prev.dpad_right);
        print("left_stick_x",       controller2Prev.left_stick_x);
        print("left_stick_y",       controller2Prev.left_stick_y);
        print("left_stick_button",  controller2Prev.left_stick_button);
        print("right_stick_x",      controller2Prev.right_stick_x);
        print("right_stick_y",      controller2Prev.right_stick_y);
        print("right_stick_button", controller2Prev.right_stick_button);
        print("left_bumper",        controller2Prev.left_bumper);
        print("right_bumper",       controller2Prev.right_bumper);
        print("left_trigger",       controller2Prev.left_trigger);
        print("right_trigger",      controller2Prev.right_trigger);
    }
    
    public void printControllerStatuses() {
        print();
        print();
        print("Controller 1");
        print("a",                  controller1.a);
        print("b",                  controller1.b);
        print("x",                  controller1.x);
        print("y",                  controller1.y);
        print("dpad_up",            controller1.dpad_up);
        print("dpad_left",          controller1.dpad_left);
        print("dpad_down",          controller1.dpad_down);
        print("dpad_right",         controller1.dpad_right);
        print("left_stick_x",       controller1.left_stick_x);
        print("left_stick_y",       controller1.left_stick_y);
        print("left_stick_button",  controller1.left_stick_button);
        print("right_stick_x",      controller1.right_stick_x);
        print("right_stick_y",      controller1.right_stick_y);
        print("right_stick_button", controller1.right_stick_button);
        print("left_bumper",        controller1.left_bumper);
        print("right_bumper",       controller1.right_bumper);
        print("right_trigger",      controller1.right_trigger);
        print("left_trigger",       controller1.left_trigger);
        print();
        print();
        print("Controller 2");
        print("a",                  controller2.a);
        print("b",                  controller2.b);
        print("x",                  controller2.x);
        print("y",                  controller2.y);
        print("dpad_up",            controller2.dpad_up);
        print("dpad_left",          controller2.dpad_left);
        print("dpad_down",          controller2.dpad_down);
        print("dpad_right",         controller2.dpad_right);
        print("left_stick_x",       controller2.left_stick_x);
        print("left_stick_y",       controller2.left_stick_y);
        print("left_stick_button",  controller2.left_stick_button);
        print("right_stick_x",      controller2.right_stick_x);
        print("right_stick_y",      controller2.right_stick_y);
        print("right_stick_button", controller2.right_stick_button);
        print("left_bumper",        controller2.left_bumper);
        print("right_bumper",       controller2.right_bumper);
        print("left_trigger",       controller2.left_trigger);
        print("right_trigger",      controller2.right_trigger);
    }
    
    public void vibrateSoft() {
        gamepad1.rumble(30);
        gamepad1.setLedColor(255,0,0,1000);
    }
    
    public void vibrate() {
        gamepad1.rumble(1000);
        gamepad1.setLedColor(255,0,0,1000);
    }
    
    public void vibrateBlips() {
        vibrateBlips(3);
    }
    
    public void vibrateBlips(int blips) {
        gamepad1.rumbleBlips(blips);
    }
    
    public double getElapsedTimeSeconds() {
        return elapsedTime.seconds();
    }
    
    public double getRemainingTimeSeconds() {
        return Math.max((2.0 * 60) - elapsedTime.seconds(), 0);
    }
    //creating print fuctions for easy application
    public void print() {
        print("");
    }
    
    public void print(String message) {
        telemetry.addLine(message);
    }
    
    public void print(String message, Object data) {
        telemetry.addData(message, data);
    }
    
    public void print(String message, Object ...data) {
        telemetry.addData(message, new String(new char[data.length]).replace("\0", "%s "), data);
    }
    
    public void print(String message, String template, Object ...data) {
        telemetry.addData(message, template, data);
    }
}
