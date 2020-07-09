package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Flavor extends org.launchcode.java.demos.lsn7interfaces.Ingredient {
     private String name;

    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
         this.name=aName;
    }




    public String getName() {

        return name;

    }
}
