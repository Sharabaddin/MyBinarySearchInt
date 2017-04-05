package com.sharabaddin;

/**
 * Created by Futurist on 17.03.2017.
 * @author  general1308@gmail.com
 */
public class HouseDoor extends Door {

    private int angleOpen = 0;
    private static final int MAX_OPEN_ANGLE = 90;
    private static final int MIN_OPEN_ANGLE = 0;
    private static final int STEP_OPEN = 10;
    private static final int STEP_CLOSE = 10;

    @Override
    public boolean open() {
        if (angleOpen < MAX_OPEN_ANGLE) {
            angleOpen += STEP_OPEN;
            return true;
        } else {
            return false;
        }
        //return putCode(1234) && super.open();
    }


    private boolean putCode(int code) {
        // Do something its example
        return code == 1234;
    }
}
