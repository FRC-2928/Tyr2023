package frc.robot.oi;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.oi.DriverOI;

public class DriverOI {
    private XboxController m_controller;
    private Trigger m_shiftButton;

    public DriverOI(XboxController controller) {
        m_controller = controller;

        m_shiftButton = new Trigger(() -> m_controller.getLeftStickButtonPressed());

  
    }

    // ---------------- Intake ----------------------------


    // public Trigger getGroundIntakeButton() {
    //     return new Button(() -> m_controller.getLeftTriggerAxis() > 0.2);
    // }


    // public Trigger getStationIntakeButton() {
    //     return new JoystickButton(m_controller, XboxController.Button.kLeftBumper.value);
    // }

    // public Trigger getToggleIntakeMotorButton(){
    //     return new JoystickButton(m_controller, XboxController.Button.kA.value);
    // }

    // public Trigger getToggleFeederMotorButton(){
    //     return new JoystickButton(m_controller, XboxController.Button.kB.value);
    // }

    // ---------------- Climber ----------------------------


    // public Trigger getClimbTrigger() {
    //     return new JoystickButton(m_controller, XboxController.Axis.kRightTrigger.value);
    // }

    // ---------------- Shooting ----------------------------


    
    // public Trigger getAutoShootingButton() {
    //     return new JoystickButton(m_controller, XboxController.Button.kRightBumper.value);
    // }


    // public Trigger getSetpointShootingButton(){
    //     return new Button(() -> m_controller.getRightTriggerAxis() > 0.2);
    // }


    // public Trigger getFenderShotButton() {
    //     return new Button(() -> m_controller.getPOV() == 180);
    // }


    // public Trigger getInitiationlineShotButton() {
    //     return new Button(() -> m_controller.getPOV() == 0);
    // }


    // public Trigger getShooterDebugButton() {
    //     return new Button(() -> m_controller.getPOV() == 90);
    // }


    // public Trigger getFeedButton() {
    //     return new Button(() -> m_controller.getRightTriggerAxis() > 0.2);
    // }

    // public Trigger getIncrementFlywheelButton(){
    //     return new JoystickButton(m_controller, XboxController.Button.kStart.value);
    // }

    // public Trigger getDecrementFlywheelButton(){
    //     return new JoystickButton(m_controller, XboxController.Button.kBack.value);
    // }

  //  public Trigger getToggleFlywheelButton(){
   //     return new JoystickButton(m_controller, XboxController.Button.kLeftBumper.value);
   // }

    public Trigger getTurnTurretLeftButton(){
        return new Trigger(() -> m_controller.getPOV() == 270);
    }

    public Trigger getTurnTurretRightButton(){
        return new Trigger(() -> m_controller.getPOV() == 90);
    }

    // ---------------- Drivetrain ----------------------------

    // public Trigger getResetEncodersButton() {
    //     return new JoystickButton(m_controller, XboxController.Button.kB.value);
    // }

    public Trigger getShiftLowButton() {
        return new JoystickButton(m_controller, XboxController.Button.kX.value);
    }

    public Trigger getShiftHighButton() {
        return new JoystickButton(m_controller, XboxController.Button.kY.value);
    }
    
    public Trigger getRaiseShooter() {  // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kRightBumper.value);
    }

    public Trigger getLowerShooter(){ // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kLeftBumper.value);
    }

    public Trigger getIntake() { // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kA.value);
    }

    public Trigger getOuttake() { // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kB.value);
    }

    public Trigger getSpinner() { // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kStart.value);
    }

    public Trigger getShoot(){ // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kBack.value);
    }

    public Trigger getLowerTomahawk(){ // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kRightStick.value);
    }

    public Trigger getRaiseTomahawk(){ // new Tyr
        return new JoystickButton(m_controller, XboxController.Button.kLeftStick.value);
    }


    public Trigger getShiftButton() {
        return m_shiftButton;

    }
    
    // public Trigger getTurnTurretToTargetButton() {
     //   return new JoystickButton(m_controller, XboxController.Button.kRightBumper.value);
    // }


    public DoubleSupplier getMoveSupplier() {
        return () -> -m_controller.getLeftY();
    }


    public DoubleSupplier getRotateSupplier() {
        return () -> m_controller.getRightX();
    }
}