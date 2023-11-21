package frc.robot.subsystems;

// import org.usfirst.frc.team2928.robot.RobotMap;

// import com.ctre.CANTalon;

// import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX; // tyr
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX; // tyr

import frc.robot.Constants;
import frc.robot.Constants.DrivetrainConstants;

public class Lifter extends SubsystemBase {
	private WPI_TalonSRX motor;
	public static int lifterMotor = 4;

	public Lifter() {
		this.motor = new WPI_TalonSRX(lifterMotor);
		
		motor.setSelectedSensorPosition(0);
	
	}

	// public Lifter(String name) {
	// 	super(name);
	// 	// TODO Auto-generated constructor stub
	// }
	
	public void Raise()
	{
		this.motor.set(1);
		
	}
	
	public void Lower()
	{
		this.motor.set(-1);
		
	}
	
	public void RunAtSpeed(double speed)
	{
		// if (speed > .5 || speed < -.5)
		// {
		// 	this.motor.set(0);
		// 	return;
		// }
		this.motor.set(speed);
	}
	public void Stop()
	{
		this.motor.set(0);
	}
	public double sensorPos()
	{
		return motor.getSelectedSensorPosition();
		// System.out.println(">>>>>>Lifter SRX POSITION TBD !!!!!");
		// return 0;
	}
	public double anglePos(){
		return Math.abs(this.sensorPos()/1522);
	}
	// @Override
	// protected void initDefaultCommand() {
	// 	// TODO Auto-generated method stub

	// }

}
