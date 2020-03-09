package model.cards.minions;

import model.cards.Minion;
import model.cards.Rarity;

/**
 *
 * A subclass of Card representing a minion card.
 *
 * **/
public class Icehowl extends Minion {

    int attack;
    int maxHP;
    int currentHP;
    boolean taunt;
    boolean divine;
    boolean sleeping;
    boolean attacked;

    public Icehowl(){
        super("Icehowl", 9, Rarity.LEGENDARY);
        this.attack = 10;
        this.maxHP = 10;
        this.currentHP = currentHP;
        this.taunt = taunt;
        this.divine = divine;
        this.sleeping = sleeping;
        this.attacked = attacked;
    }
}