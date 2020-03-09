package model.heroes;

import model.cards.Card;
import model.cards.minions.Minion;

import java.io.IOException;
import java.util.ArrayList;
/**
 *
 *   A class representing a hero. No objects of type Hero can be instantiated.
 *
 * **/
public class Warlock extends Hero {
    public Warlock(String name) {
        super("Gul’dan");
    }
}