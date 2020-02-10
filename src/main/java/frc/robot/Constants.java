/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // CAN IDs
    public final static int FL_DRIVE_CAN_ID = 1;
    public final static int RL_DRIVE_CAN_ID = 2;
    public final static int FR_DRIVE_CAN_ID = 0;
    public final static int RR_DRIVE_CAN_ID = 3;
    public final static int SHOOTER_CAN_ID = 000;
    public final static int CONVEYOR_CAN_ID = 00;
    public final static int LEFT_BUMPER = 4; // index 

    //Joystick port IDS
    public static final int CONTROLLER_USB_ID = 0;

}