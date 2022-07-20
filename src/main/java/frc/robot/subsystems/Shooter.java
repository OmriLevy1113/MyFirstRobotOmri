package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Shooter extends SubsystemBase {

    private final MotorControllerGroup motors;
    private final DigitalInput limit;

    public Shooter() {
        this.motors = new MotorControllerGroup(
                new WPI_VictorSPX(RobotMap.CAN.SHOOTER_VICTOR_1),
                new WPI_VictorSPX(RobotMap.CAN.SHOOTER_VICTOR_2));
        this.limit = new DigitalInput(RobotMap.DIO.SHOOTER_LIMIT);
    }

    public void shoot(double speed) {
        motors.set(speed);
    }

    public void stopMotors() {
        motors.stopMotor();
    }

    public boolean getLimit() {
        return this.limit.get();
    }
}
