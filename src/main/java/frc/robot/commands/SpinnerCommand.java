package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Spinner;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SpinnerCommand extends CommandBase {
	private final Spinner m_Spinner;

	public SpinnerCommand(Spinner spinner) {
		m_Spinner = spinner;
		addRequirements(m_Spinner);
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
		m_Spinner.On();
	}

 	// Returns true when the command should end.
 	@Override
 	public boolean isFinished() {
   		return false;
 	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		m_Spinner.Off();
	}

	// @Override
	// protected void interrupted() {
	// 	m_lifter.Stop();
	// 	SmartDashboard.putNumber("EncPos",m_lifter.lifterPos());
	// }

}
