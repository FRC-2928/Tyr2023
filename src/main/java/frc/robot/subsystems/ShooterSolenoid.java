package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSolenoid extends SubsystemBase {
	Solenoid solen;
	public static int shooterSolenoid = 7; // Tyr

	public ShooterSolenoid() {
		this.solen = new Solenoid(PneumaticsModuleType.CTREPCM, shooterSolenoid);
	}
	
	public void Shoot()
	{
		solen.set(true);
	}
	
	public void Retract()
	{
		solen.set(false);
	}
	
	// public ShooterSolenoid(String name) {
	// 	super(name);
	// 	// TODO Auto-generated constructor stub
	// }

	// @Override
	// protected void initDefaultCommand() {
	// 	// TODO Auto-generated method stub

	// }

}
