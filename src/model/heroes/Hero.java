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
public abstract class Hero {
    private String name;
    private int currentHP;
    private boolean heroPowerUsed;
    private int totalManaCrystals;
    private int currentManaCrystals;
    private ArrayList<Card> deck;
    private ArrayList<Minion> field;
    private ArrayList<Card> hand;
    private int fatigueDamage;

    public Hero(String name) {
        this.name = name;
        this.currentHP = 30;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public boolean isHeroPowerUsed() {
        return heroPowerUsed;
    }

    public void setHeroPowerUsed(boolean heroPowerUsed) {
        this.heroPowerUsed = heroPowerUsed;
    }

    public int getTotalManaCrystals() {
        return totalManaCrystals;
    }

    public void setTotalManaCrystals(int totalManaCrystals) {
        this.totalManaCrystals = totalManaCrystals;
    }

    public int getCurrentManaCrystals() {
        return currentManaCrystals;
    }

    public void setCurrentManaCrystals(int currentManaCrystals) {
        this.currentManaCrystals = currentManaCrystals;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Minion> getField() {
        return field;
    }

    public void setField(ArrayList<Minion> field) {
        this.field = field;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public static ArrayList<Minion> getAllNeutralMinions(String filePath) throws IOException{

        return null;
    }
    public static ArrayList<Minion> getNeutralMinions(ArrayList<Minion> minions,int count){

        return minions;
    }
    public void buildDeck() throws IOException{

    }
}
