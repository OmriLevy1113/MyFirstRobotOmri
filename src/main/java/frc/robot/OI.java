package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveForward;
import frc.robot.commands.IntakeCargo;
import frc.robot.commands.ReleaseCargo;
import frc.robot.commands.Rotate;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Storage;

public class OI /*GEVALD*/ {

    public OI(Drivetrain drivetrain, Shooter shooter, Storage storage, Intake intake) {
        XboxController xbox = new XboxController(2);
        JoystickButton B = new JoystickButton(xbox, XboxController.Button.kB.value);
        JoystickButton A = new JoystickButton(xbox, XboxController.Button.kA.value);
        JoystickButton X = new JoystickButton(xbox, XboxController.Button.kX.value);
        JoystickButton RB = new JoystickButton(xbox, XboxController.Button.kRightBumper.value);
        B.whileHeld(new DriveForward(drivetrain));
        X.whileHeld(new Rotate(drivetrain));
        RB.whileHeld(new ReleaseCargo(shooter, storage));
        A.whenPressed(new IntakeCargo(storage, intake, shooter));
    }
}
