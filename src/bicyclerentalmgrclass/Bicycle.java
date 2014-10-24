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
public class Bicycle {
    //defined global variables
    private int bID;
    //false because a bike has not been rented yet
    private boolean isRented= false;
    private BikeType bType;
    //This is composition
    Renter currRenter;
    private int hourOfReturn=-1;
    //This is a dynamic Array
    //the data type is <Renter>
    //<> is a diamond
    //in the new java version you do not have to have Renter on the right side
    //define Renter object for the ArrayList
    ArrayList<Renter> rentalHistory = new ArrayList<>();
    ArrayList<Renter> waitList = new ArrayList<>();
    private int totalWaitListers=0;
    private static int numberOfBicycles=0;
    //this is just in case solution that the default should be this
    public Bicycle(){
        numberOfBicycles++;
        bID= numberOfBicycles;
        bType= BikeType.roadbike;
        
    }
    //define constructor to make people do this
    //You want people to enter these information
    public Bicycle(int bID, BikeType bType){
        this.bID= bID;
        this.bType =bType;
    }
    // some getter methods - return the value of private fields
    public int getHourOfReturn() {
        return hourOfReturn;
    }
    public int getTotalWaitListers(){ 
        return totalWaitListers;
    }
    public int getTotalRenters(){ 
        return rentalHistory.size();
    }
    public Renter getCurrRenter() {
        return currRenter;
    }
    public ArrayList<Renter> getRenterList(){  // point out generics
        return rentalHistory;
    }
    public BikeType getType() {
        return bType;
    }
    public ArrayList<Renter> getwaitList() {
        return waitList;
    }
    public static int getNumBicycles() {
        return numberOfBicycles;
    }
}
