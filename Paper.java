package com.evie;

/**
 * Created by rmhedge on 8/11/17.
 */
public class Paper implements GameObject{

    @Override
    public boolean beats(Rock rock) {
        return true;
    }

    @Override
    public boolean beats(Paper paper) {
        return false;
    }

    @Override
    public boolean beats(Scissors scissors) {
        return false;
    }
}
