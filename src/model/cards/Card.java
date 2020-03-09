package model.cards;
/**
 *
 * A class representing a game card. No objects of type Card can be instantiated.
 *
 * **/
public abstract class Card {
    String name;
    int manaCost;
    Rarity rarity;

    public Card(String name, int manaCost, Rarity rarity) {
        this.name = name;
        this.manaCost = manaCost;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public Rarity getRarity() {
        return rarity;
    }
}
