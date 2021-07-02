package com.careerDevs;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        DrinkDispenser drinkDispenser = new DrinkDispenser();

        drinkDispenser.addCups(
                new CupHolder("small", 8.0, 25)
        );

        drinkDispenser.addCups(
                new CupHolder("med",16.0, 25)
        );

        drinkDispenser.addCups(
                new CupHolder(
                        "lrg", 32.0, 25
                )
        );

        DrinkDispenser syrup = new DrinkDispenser();

        syrup.addSyrup(
                new Syrup("coke", 25.0)
        );

        syrup.addSyrup(
                new Syrup("dr. pepper", 45.0)
        );

        syrup.addSyrup(
                new Syrup("sprite", 88.0)
        );

        DrinkDispenser flavorShot = new DrinkDispenser();

        flavorShot.addShot(
                new Shot("cherry", 25.0, .50, 8.0)
        );

        flavorShot.addShot(
                new Shot("vanilla", 55.0, 1.0, 16.0)
        );

        flavorShot.addShot(
                new Shot("lime", 53.0, 2.0, 32.0)
        );

        drinkDispenser.displayDrinkMachine();


    }
}
