package model.cards.minions;

import model.cards.Card;
import model.cards.Rarity;

/**
 *
 * A subclass of Card representing a minion card.
 *
 * **/
public class Minion extends Card {
    protected int attack;
    protected int maxHP;
    protected int currentHP;
    protected boolean taunt;
    protected boolean divine;
    protected boolean sleeping;
    protected boolean attacked;

    public Minion(String name, int manaCost, Rarity rarity, int attack, int maxHP, int currentHP, boolean taunt, boolean divine, boolean sleeping, boolean attacked) {
        super(name, manaCost, rarity);
        this.attack = attack;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.taunt = taunt;
        this.divine = divine;
        this.sleeping = sleeping;
        this.attacked = attacked;
    }

    public Minion(String icehowl, int i, Rarity legendary) {
        super(icehowl,i,legendary);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public boolean isTaunt() {
        return taunt;
    }

    public void setTaunt(boolean taunt) {
        this.taunt = taunt;
    }

    public boolean isDivine() {
        return divine;
    }

    public void setDivine(boolean divine) {
        this.divine = divine;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public boolean isAttacked() {
        return attacked;
    }

    public void setAttacked(boolean attacked) {
        this.attacked = attacked;
    }
}
