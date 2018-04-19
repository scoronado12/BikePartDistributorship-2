package sample;
import basic.BikePart;
import basic.LoginAccount;
import basic.Warehouse;

public class WhManager extends LoginAccount {


    /**
     * Warehouse Manager Constructor
     *
     * @param username  ; username for the account
     * @param password  ; password for the account
     * @param firstName ; creates a first name for the person
     * @param lastName  ; creates a last name for the person
     * @param Warehouse; The maintained warehouse of the user
     */
    protected Warehouse wh = new Warehouse();
/**
 * WhManager Object
 * @param username ; username for account
 * @param password ; password for account
 * @param firstName ; user's first name
 * @param lastName ; user's last name
 * @param warehouseName ; name of the warehouse user is manageing
 */
    public WhManager(String username, String password, String firstName, String lastName, String warehouseName) {
        super(username, password, firstName, lastName);
        wh.setName(warehouseName);
    }

    public void displayInventory(){
    	wh.printAll();
    }
    //needs to take in a text file
    public void transferInventory(Warehouse source, Warehouse destinationWh, BikePart bp, int quantityToMove){

        //if (source.findBp(bp.getPartNumber()) == bp ){ //if found in source
        if (source.BikePartList.contains(bp)){
            //then remove that amount







        } else {
            System.out.println("BikePart does not exist in " + source.toString());
        }

    	
    }
    //needs to take in a text file
    public void updateInventory(){

    }

    /**
     * toString - prints out the object instance as a String
     * @return
     */
    public String toString() { return "Warehouse Manager: " + firstName + " " + lastName + " " + username; }



}
