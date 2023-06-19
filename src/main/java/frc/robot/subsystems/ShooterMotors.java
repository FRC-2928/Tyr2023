package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterMotors extends SubsystemBase {
	public static int leftShootMotor = 0;
	public static int rightShootMotor = 1;

	PWMTalonSRX leftShoot;
	PWMTalonSRX rightShoot;
	public ShooterMotors() {
		// TODO Auto-generated constructor stub
		this.leftShoot = new PWMTalonSRX(leftShootMotor);
		this.rightShoot = new PWMTalonSRX(rightShootMotor);
	}
	public void Outtake() {
		leftShoot.set(1.0);
		rightShoot.set(1.0);
	}
	
	
	public void Stop()
	{
		leftShoot.set(0);
		rightShoot.set(0);
	}
	
	public void Intake()
	{
		leftShoot.set(-.85);
		rightShoot.set(-.85);
	}

	// @Override
	//protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	//}

}
