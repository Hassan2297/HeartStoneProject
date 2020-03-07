package engine;

import model.heroes.Hero;

/**
 *
 *  A class representing the main game class where the whole card game is initialized and
 * monitored.
 *
 * **/
public class Game {
    Hero firstHero;
    Hero secondHero;
    Hero currentHero;
    Hero opponent;

    public Game(Hero p1, Hero p2) {
        this.firstHero = p1;
        this.secondHero = p2;
    }

    public Hero getCurrentHero() {
        return currentHero;
    }

    public Hero getOpponent() {
        return opponent;
    }
}