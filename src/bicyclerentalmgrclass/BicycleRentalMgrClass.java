/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bicyclerentalmgrclass;

import java.util.ArrayList;

/**
 *
 * @author bus-5170
 */
public class BicycleRentalMgrClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //defined an object called b
        Bicycle b;
        ArrayList<Bicycle> theBikes = new ArrayList<>();
        //created two objects, gave them an ID and identified what bike type
        //the ID are for
        b = new Bicycle(101,BikeType.mountainbike);
        //now add the variable b to the ArrayList
        theBikes.add(b);
        //now I can use the memory spot b again
        //double referencing
        b = new Bicycle(102,BikeType.roadbike);
        theBikes.add(b);
        
        Renter r1 = new Renter(101, 6);
        
        
        
        
        
    }
    
}
