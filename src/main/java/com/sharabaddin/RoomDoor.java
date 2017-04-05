package com.sharabaddin;

/**
 * Created by Futurist on 17.03.2017.
 * @author  general1308@gmail.com
 */
public class RoomDoor extends Door {
    private boolean doorHandle = false;


    private int angleOpen = 0;
    private static final int MAX_OPEN_ANGLE = 90;
    private static final int MIN_OPEN_ANGLE = 0;
    private static final int STEP_OPEN = 10;
    private static final int STEP_CLOSE = 10;

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
//        if (doorHandle) {
//            doorHandle = false;
//            return super.close();
//        } else {
//            return false;
//        }
//    }
        if (angleOpen >= MIN_OPEN_ANGLE) {
            angleOpen -= STEP_CLOSE;
            return true;
        } else {
            return false;
        }
}
