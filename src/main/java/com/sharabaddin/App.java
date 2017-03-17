package com.sharabaddin;

/**
 * Enter point.
 * Jacob is a Human which open and close the door and check close or open now.
 * Its project use polymorphism.
 * @author general1308@gmail.com
 */
public class App {
    public static void main(String[] args) {
        Human jacob = new Human();

        HouseDoor firstDoor = new HouseDoor();
        RoomDoor secondDoor = new RoomDoor();

        // Use the first door.
        jacob.openDoor(firstDoor);
        jacob.check(firstDoor);

        jacob.closeDoor(firstDoor);
        jacob.check(firstDoor);

        // Use the second door.
        jacob.openDoor(secondDoor);
        jacob.check(secondDoor);

        jacob.closeDoor(secondDoor);
        jacob.check(secondDoor);
    }
}
