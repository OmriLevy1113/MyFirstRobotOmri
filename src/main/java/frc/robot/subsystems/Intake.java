package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase {

    private final WPI_VictorSPX motor;

    public Intake() {
        this.motor = new WPI_VictorSPX(RobotMap.CAN.INTAKE_VICTOR);
    }

    public void take(double speed) {
        motor.set(speed);
    }

    public void stopMotor() {
        motor.stopMotor();
    }
}
