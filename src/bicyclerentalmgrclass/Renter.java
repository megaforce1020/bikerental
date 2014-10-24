/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bicyclerentalmgrclass;

/**
 *
 * @author bus-5170
 */
public class Renter {
    //make your fields privates and your methods public
    //create field for renter's ID
    private int rID;
    //created field for hours requested for renter
    private int hoursRequested;
    
    //This seems like a method name Renter is the same as the class name
    //If I take out public then the package name would be Renter; this is default
    //By making it public any file can access this file with the method called Renter
    //Constructor Renter with defined local variables
    public Renter (int id, int time) {
        //in these constructer lines of code you are matching the fields with the local variables stored in memory
        //this means that someone has given you an input
        //the order is very important
        rID=id;
        hoursRequested=time;
    }
    public Renter(){
        //if there is no input then you should do this
        //no-input constructor meaning there is no local variables defined
        //if you don't write rID=0 it will do so by default anyways
        rID=0;
        hoursRequested=0;
    }
    public Renter(int int1){
        
    }
    
}
