package com.sharabaddin;

/**
 * Created by Futurist on 17.03.2017.
 * @author general1308@gmail.com
 */
public class Human {

    public void openDoor(Door door) {
        door.open();
    }

    public void closeDoor(Door door) {
        door.close();
    }

    public void check(Door door) {
        if(door.isOpen()){
            System.out.println("Door is open");
        } else {
            System.out.println("Door is close");
        }

    }
}
