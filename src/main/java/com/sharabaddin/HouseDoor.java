package com.sharabaddin;

/**
 * Created by Futurist on 17.03.2017.
 * @author  general1308@gmail.com
 */
public class HouseDoor extends Door {
    @Override
    public boolean open() {
        return putCode(1234) && super.open();
    }

    private boolean putCode(int code) {
        // Do something its example
        return code == 1234;
    }
}
