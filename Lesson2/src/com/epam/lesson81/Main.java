package com.epam.lesson81;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();
        Robot[] robots = {
                robot, coffeRobot, robotDancer, robotCoocker
        };
        for (Robot elem : robots) {
            elem.work();
        }
    }
}
