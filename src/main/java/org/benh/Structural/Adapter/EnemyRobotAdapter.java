package org.benh.Structural.Adapter;

public class EnemyRobotAdapter implements EnemyAttacker{
    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        this.theRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHumans(driverName);
    }
}
