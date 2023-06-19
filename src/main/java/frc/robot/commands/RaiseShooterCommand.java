package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Lifter;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RaiseShooterCommand extends CommandBase {
	private final Lifter m_lifter;

	public RaiseShooterCommand(Lifter lifter) {
		m_lifter = lifter;
		addRequirements(m_lifter);
	}

	// public RaiseShooterCommand(String name) {
	// 	super(name);
	// 	requires(Robot.lifter);
	// }

	// public RaiseShooterCommand(double timeout) {
	// 	super(timeout);
	// }

	// public RaiseShooterCommand(String name, double timeout) {
	// 	super(name, timeout);
	// }

	 // Called when the command is initially scheduled.
	 @Override
	 public void initialize() {}
   
	 // Called every time the scheduler runs while the command is scheduled.
	 @Override
	 public void execute() {
		m_lifter.Raise();
		SmartDashboard.putNumber("EncPos", m_lifter.lifterPos());
	}

 	// Returns true when the command should end.
 	@Override
 	public boolean isFinished() {
   		return false;
 	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		m_lifter.Stop();
		SmartDashboard.putNumber("EncPos", m_lifter.lifterPos());
	}

	// @Override
	// protected void interrupted() {
	// 	m_lifter.Stop();
	// 	SmartDashboard.putNumber("EncPos",m_lifter.lifterPos());
	// }

}
