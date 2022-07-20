package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Drivetrain extends SubsystemBase {
    private final MotorControllerGroup left;
    private final MotorControllerGroup right;

    public Drivetrain() {
        this.left = new MotorControllerGroup(
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_1),
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_LEFT_TALON_2)
        );
        this.right = new MotorControllerGroup(
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_1),
                new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_RIGHT_TALON_2)
        );
        right.setInverted(true);
    }

    public void move(double speedLeft, double speedRight) {
        left.set(speedLeft);
        right.set(speedRight);
    }

    public void stopMotors() {
        left.stopMotor();
        right.stopMotor();
    }
}



