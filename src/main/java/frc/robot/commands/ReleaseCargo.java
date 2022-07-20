package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Storage;

public class ReleaseCargo extends ParallelCommandGroup {

    public ReleaseCargo(Shooter shooter, Storage storage) {
        addCommands(new MoveStorage(storage), new Shoot(shooter));
    }

//    private final Shooter shooter;
//    private final Storage storage;
//
//    public ReleaseCargo(Shooter shooter, Storage storage) {
//        this.shooter = shooter;
//        this.storage = storage;
//    }
//
//    @Override
//    public void execute() {
//        shooter.shoot(0.5);
//        storage.on(0.5);
//    }
//
//    @Override
//    public void end(boolean interrupted) {
//        shooter.stopMotors();
//        storage.stop();
//    }
}


