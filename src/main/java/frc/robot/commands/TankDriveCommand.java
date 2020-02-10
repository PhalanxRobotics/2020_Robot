/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;

public class TankDriveCommand extends CommandBase {
  DrivetrainSubsystem m_drivetrain;
  Joystick m_controller;

  /**
   * Creates a new TankDriveCommand.
   */
  public TankDriveCommand(DrivetrainSubsystem drivetrain, Joystick controller) {
    m_drivetrain = drivetrain;
    m_controller  = controller;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.drive(m_controller.getY(Hand.kLeft), m_controller.getX(Hand.kRight));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // STOP MOTORS!!!
    m_drivetrain.drive(0.0, 0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
