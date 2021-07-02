package com.careerDevs;
import java.util.*;


public class DrinkDispenser {

    List<CupHolder> cups = new ArrayList<>();
    List<Syrup> drinkSyrup = new ArrayList<>();
    List<Shot> flavorShot = new ArrayList<>();

    public void addCups(CupHolder cup) {
        cups.add(cup);
    }

    public void addSyrup(Syrup drink) {
        drinkSyrup.add(drink);
    }

    public void addShot(Shot flavor){
        flavorShot.add(flavor);
    }

    public void displayDrinkMachine() {

        for (CupHolder cup : cups){
            System.out.println(cup.size);
        }

    }
}
