package com.evie;

/**
 * Created by rmhedge on 8/11/17.
 */
public class Main  {

    public static void main(String[] args) {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();

        System.out.print(rock.beats(scissors));

    }
}


