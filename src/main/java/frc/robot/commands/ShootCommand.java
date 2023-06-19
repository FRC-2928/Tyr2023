package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.ShooterSolenoid;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ShootCommand extends CommandBase {
	private final ShooterSolenoid m_shooterSolenoid;

	public ShootCommand(ShooterSolenoid ShooterSolenoid) {
		m_shooterSolenoid = ShooterSolenoid;
		addRequirements(m_shooterSolenoid);
	}

	// public ShootCommand(String name) {
	// 	super(name);
	// 	requires(Robot.lifter);
	// }

	// public ShootCommand(double timeout) {
	// 	super(timeout);
	// }

	// public ShootCommand(String name, double timeout) {
	// 	super(name, timeout);
	// }

	 // Called when the command is initially scheduled.
	 @Override
	 public void initialize() {
		m_shooterSolenoid.Shoot();
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
		m_shooterSolenoid.Retract();
	}

	// @Override
	// protected void interrupted() {
	// 	m_lifter.Stop();
	// 	SmartDashboard.putNumber("EncPos",m_lifter.lifterPos());
	// }

}
