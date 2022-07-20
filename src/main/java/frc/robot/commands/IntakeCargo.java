package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Storage;

public class IntakeCargo extends SequentialCommandGroup {

    public IntakeCargo(Storage storage, Intake intake,Shooter shooter) {
        addCommands(
                new ParallelCommandGroup(
                        new MoveStorage(storage),
                        new ActivateIntake(intake)
                ).withInterrupt(storage::getLimit),
                new ParallelCommandGroup(
                        new MoveStorage(storage),
                        new Shoot(shooter)
                ).withInterrupt(shooter::getLimit)
        );
    }

}
