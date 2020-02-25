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

public class ConveyorSubsystem extends SubsystemBase {
  SpeedController conveyorMotor;
  /**
   * Creates a new ConveyorSubsystem.
   */
  public ConveyorSubsystem() {
    conveyorMotor = new WPI_VictorSPX(Constants.CONVEYOR_CAN_ID);

  }

  public void pull(){
    conveyorMotor.set(0.50);
  }

  public void endPull(){
    conveyorMotor.set(0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
