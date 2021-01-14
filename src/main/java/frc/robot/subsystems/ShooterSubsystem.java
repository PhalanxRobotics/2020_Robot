/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  SpeedController shooterMotor;
  /**
   * Creates a new ShooterSubsystem.
   */
  public ShooterSubsystem() {
    shooterMotor = new WPI_VictorSPX(Constants.SHOOTER_CAN_ID);

  }

  public void shoot() {
    // Starts Motor
    shooterMotor.set(1.0);
  }
    
  public void stopShooting() {
    // Stops Motor
    shooterMotor.set(0.0);
  }

  public void haloTheme() {
    // Plays the Halo Theme 
    // For the memes
    // Alex is a god for this
    shooterMotor.set(0.4655367);
    shooterMotor.set(0.5225988);
    shooterMotor.set(0.5536723);
    shooterMotor.set(0.5225988);
    shooterMotor.set(0.6214689);
    shooterMotor.set(0.5536723);
    shooterMotor.set(0.4284369);
    shooterMotor.set(0.4655367);
    shooterMotor.set(0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
