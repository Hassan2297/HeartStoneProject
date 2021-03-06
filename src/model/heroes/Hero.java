package model.heroes;

import model.cards.Card;
import model.cards.minions.Minion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

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
    protected ArrayList<Card> deck;
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
        if(currentHP <= 30){
            this.currentHP = currentHP;
        }
        else {
            this.currentHP = 30;
        }

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
        if(totalManaCrystals <= 10 && totalManaCrystals > 0){
            this.totalManaCrystals = totalManaCrystals;
        }else{
            this.totalManaCrystals = 10;
        }

    }

    public int getCurrentManaCrystals() {
        return currentManaCrystals;
    }

    public void setCurrentManaCrystals(int currentManaCrystals) {
        if(currentManaCrystals <= 10){
            this.currentManaCrystals = currentManaCrystals;
        }
        else
        {
            this.currentManaCrystals = 10;
        }

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

    public static final ArrayList<Minion> getAllNeutralMinions(String filePath) throws IOException{

        return null;
    }
    public static final ArrayList<Minion> getNeutralMinions(ArrayList<Minion> minions,int count){
        int min = Math.abs(count - minions.size());
        ArrayList<Minion> toReturn = minions;
        if(min != 0){
            for(int i=0;i<min;i++){
                Random r = new Random();
                int re = r.nextInt(min);
                toReturn.add(toReturn.get(re));
            }
        }
        return toReturn;
    }
    public void buildDeck() throws IOException{

    }
}
