package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.launchcode.java.demos.lsn7interfaces.Case;
import org.launchcode.java.demos.lsn7interfaces.Flavor;
import org.launchcode.java.demos.lsn7interfaces.Cone;

public class Main {
    public static void main(String[] args) {
        //FlavorComparator flavorComparator = new FlavorComparator();
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator comparator1 = new ConeComparator();
        Collections.sort(flavors,comparator);
        Collections.sort(cones,comparator1);

        System.out.println("After:");
        System.out.println();
        for(Flavor flavor:flavors){

          System.out.println(flavor.getName());

        }

        System.out.println();
        System.out.println("After:");
        System.out.println();
         for(Cone cone:cones){
             System.out.println(cone.getName()+": "+cone.getCost());
         }



        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }


}

