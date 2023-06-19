package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Tomahawk;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TomahawkCommand extends CommandBase {
	private final Tomahawk m_tomahawk;
	private boolean m_raise;

	public TomahawkCommand(Tomahawk Tomahawk, boolean raise) {
		m_tomahawk = Tomahawk;
		m_raise = raise;

		addRequirements(m_tomahawk);
	}

	// public TomahawkCommand(String name) {
	// 	super(name);
	// 	requires(Robot.lifter);
	// }

	// public TomahawkCommand(double timeout) {
	// 	super(timeout);
	// }

	// public TomahawkCommand(String name, double timeout) {
	// 	super(name, timeout);
	// }

	 // Called when the command is initially scheduled.
	 @Override
	 public void initialize() {
		if (m_raise)
		{
			m_tomahawk.Raise();
		} else
		{
			m_tomahawk.Lower();
		}
	 }
   
	 // Called every time the scheduler runs while the command is scheduled.
	 @Override
	 public void execute() {
	}

 	// Returns true when the command should end.
 	@Override
 	public boolean isFinished() {
   		return false;
 	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
	}

	// @Override
	// protected void interrupted() {
	// 	m_lifter.Stop();
	// 	SmartDashboard.putNumber("EncPos",m_lifter.lifterPos());
	// }

}
