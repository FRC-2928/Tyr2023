package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Spinner extends SubsystemBase {

	public static int spinnerMotor = 2;

	PWMTalonSRX motor;
	public Spinner() {
		this.motor = new PWMTalonSRX(spinnerMotor);
	}

	public void On()
	{
		this.motor.set(-0.60);
	}
	
	public void Off()
	{
		this.motor.set(0);
	}

	// public Spinner(String name) {
	//	super(name);
		// TODO Auto-generated constructor stub
	// }

	// @Override
	// protected void initDefaultCommand() {
	// 	// TODO Auto-generated method stub

	// }

}
