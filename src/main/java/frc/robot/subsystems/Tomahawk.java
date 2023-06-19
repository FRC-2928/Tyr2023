package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Tomahawk extends SubsystemBase {
	Solenoid solen;
	public static int tomahawkSolenoid = 1; // Tyr

	public Tomahawk() {
		this.solen = new Solenoid(PneumaticsModuleType.CTREPCM, tomahawkSolenoid);
	}
	
	public void Raise()
	{
		if (!this.solen.get())
		{
			this.solen.set(true);
		}
	}
	
	public void Lower()
	{
		if (this.solen.get())
		{
			this.solen.set(false);
		}
	}
	
/* 	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
 */
}
