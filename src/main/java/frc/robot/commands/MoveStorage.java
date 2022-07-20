package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Storage;

public class MoveStorage extends CommandBase {

    private final Storage storage;

    public MoveStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        storage.on(0.5);
    }

    @Override
    public void end(boolean interrupted) {
        storage.stop();
    }
}
