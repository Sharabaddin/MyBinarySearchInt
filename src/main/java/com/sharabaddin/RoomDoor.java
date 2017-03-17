package com.sharabaddin;

/**
 * Created by Futurist on 17.03.2017.
 * @author  general1308@gmail.com
 */
public class RoomDoor extends Door {
    private boolean doorHandle = false;

    @Override
    public boolean open() {
            if (!doorHandle) {
                doorHandle = true;
                return super.open();
            } else {
                return false;
            }
    }

    @Override
    public boolean close() {
        if (doorHandle) {
            doorHandle = false;
            return super.close();
        } else {
            return false;
        }
    }
}
