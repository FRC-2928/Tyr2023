// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.Lifter;
// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class LifterGoTo extends PIDCommand {
  /** Creates a new ShooterGOto. */
  public LifterGoTo(Lifter lifter, double position) {
    super(
        // The controller that the command will use
        new PIDController(0.2, 0, 0.1),
        // This should return the measurement
        () -> lifter.anglePos(),
        // This should return the setpoint (can also be a constant)
        () -> position,
        // This uses the output
        output -> {

          lifter.RunAtSpeed(output);
        });
    // Use addRequirements() here to declare subsystem dependencies.
    // Configure additional PID options by calling `getController` here.
    getController().setTolerance(500);
    addRequirements(lifter);
    System.out.println(position);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return getController().atSetpoint();

  }
}
