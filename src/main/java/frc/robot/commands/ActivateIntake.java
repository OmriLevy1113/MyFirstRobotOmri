package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class ActivateIntake extends CommandBase {

    private final Intake intake;

    public ActivateIntake(Intake intake) {
        this.intake = intake;
    }

    @Override
    public void execute() {
        intake.take(0.5);
    }

    @Override
    public void end(boolean interrupted) {
        intake.stopMotor();
    }
}
