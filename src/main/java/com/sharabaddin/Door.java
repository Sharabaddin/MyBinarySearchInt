package com.sharabaddin;

/**
 * Created by Futurist on 17.03.2017.
 * @author  general1308@gmail.com
 */
public class Door {
    private int angleOpen = 0;
    private static final int MAX_OPEN_ANGLE = 90;
    private static final int MIN_OPEN_ANGLE = 0;
    private static final int STEP_OPEN = 10;
    private static final int STEP_CLOSE = 10;

    /**
     * Open the door.
     */
    public boolean open() {
        if (angleOpen < MAX_OPEN_ANGLE) {
            angleOpen += STEP_OPEN;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Close the door.
     */
    public boolean close() {
        if (angleOpen >= MIN_OPEN_ANGLE) {
            angleOpen -= STEP_CLOSE;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check status the door(true - open, false close).
     */
    public boolean isOpen() {
        return (angleOpen > 0);
    }
}
