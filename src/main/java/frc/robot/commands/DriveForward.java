package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DriveForward extends CommandBase {

    private final Drivetrain drivetrain;

    public DriveForward(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    @Override
    public void execute() {
        drivetrain.move(0.5, 0.5);

    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.stopMotors();
    }
}
