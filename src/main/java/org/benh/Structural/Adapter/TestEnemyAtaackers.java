package org.benh.Structural.Adapter;

public class TestEnemyAtaackers {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
        System.out.println("The robot");

        robot.reactToHumans("Paul");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("The enemy tank");

        tank.assignDriver("Frank");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println("Robot with adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
