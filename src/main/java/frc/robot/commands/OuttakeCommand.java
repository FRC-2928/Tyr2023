package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.ShooterMotors;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OuttakeCommand extends CommandBase {
	private final ShooterMotors m_shooterMotors;

	public OuttakeCommand(ShooterMotors shooterMotors) {
		m_shooterMotors = shooterMotors;
		addRequirements(m_shooterMotors);
	}

	// public OuttakeCommand(String name) {
	// 	super(name);
	// 	requires(Robot.lifter);
	// }

	// public OuttakeCommand(double timeout) {
	// 	super(timeout);
	// }

	// public OuttakeCommand(String name, double timeout) {
	// 	super(name, timeout);
	// }

	 // Called when the command is initially scheduled.
	 @Override
	 public void initialize() {}
   
	 // Called every time the scheduler runs while the command is scheduled.
	 @Override
	 public void execute() {
		m_shooterMotors.Outtake();
	}

 	// Returns true when the command should end.
 	@Override
 	public boolean isFinished() {
   		return false;
 	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		m_shooterMotors.Stop();
	}

	// @Override
	// protected void interrupted() {
	// 	m_lifter.Stop();
	// 	SmartDashboard.putNumber("EncPos",m_lifter.lifterPos());
	// }

}
