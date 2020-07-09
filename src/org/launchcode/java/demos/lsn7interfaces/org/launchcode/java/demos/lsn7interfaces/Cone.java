package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import org.launchcode.java.demos.lsn7interfaces.Ingredient;

public class Cone extends Ingredient {
     private double cost;
    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
        this.cost=aCost;
    }


    public double getCost() {
        return cost;
    }
}
