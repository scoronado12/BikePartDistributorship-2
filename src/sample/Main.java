package sample;

import basic.BikePart;
import basic.LoginAccount;
import basic.Warehouse;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class Main extends Application {

    /** WarehouseDB
     *  Keeps track of Warehouses
     */
    public static ObservableList<Warehouse> warehouseDB = FXCollections.observableArrayList();
    public static SalesAssociate SalesAccount = new SalesAssociate();
    public static OfficeManager OffAccount = new OfficeManager();
    public static WhManager WhAccount = new WhManager();
    public static SysAdmin SysAccount = new SysAdmin();


    /**
     * Start(Stage primaryStage) - Gives the JavaFX Window certain properties
     * @param primaryStage - the Window
     * @throws Exception
     */
    
    //Main is to start a login window
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
        primaryStage.setTitle("Bicycle Part Distributorship");
        primaryStage.setScene(new Scene(root, 475, 510));
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> System.out.println("Stage is closing")); //added in later on to handle saving and exiting
    }

    /**Stop() - Overridden method that runs upon exiting
     *
     * @throws IOException
     */

    @Override
    public void stop() throws IOException {
        //primaryStage.close();
    }

    /** main() - Establishes some predefined users to get started
     *
     * @param args
     */


    public static void main(String[] args) {

    	ArrayList<BikePart> empty = new ArrayList<BikePart>();
        //John or Tripp the sales associate
        Warehouse tripSV = new Warehouse("Tripp's SalesVan", empty);
        SalesAssociate saTripp = new SalesAssociate("tripp", "pass", "John", "Evans", tripSV);
        LoginAccount.users.add(saTripp);
        warehouseDB.add(saTripp.getSalesVan()); //salesVan

        //Mitchell the warehouse Manager
        Warehouse MitchSV = new Warehouse("Mitchell's Warehouse", empty);
        WhManager WManMitchell = new WhManager("mitchell", "1234", "Mitchell", "Bisson", MitchSV);
        LoginAccount.users.add(WManMitchell);
        warehouseDB.add(WManMitchell.getWh());

        Warehouse JohnSV = new Warehouse("John Doe's SalesVan", empty);
        WhManager johnDoe = new WhManager("jdoe", "password", "John", "Doe", JohnSV);
        LoginAccount.users.add(johnDoe);
        warehouseDB.add(johnDoe.getWh());

        //Sysadmin Stefano
        SysAdmin SysAdminStefano = new SysAdmin("scoronado", "password", "Stefano","Coronado");
        LoginAccount.users.add(SysAdminStefano);

        //Office manager gusty
        OfficeManager gusty = new OfficeManager("gusty", "bike", "Gusty", "Cooper");
        LoginAccount.users.add(gusty);


        launch(args);
    }

	public static void SysTransfer(SysAdmin sysAccount) {
		SysAccount = sysAccount;
	}
	public static SysAdmin getAdminAcct() {
		return SysAccount;
	}

	
	
	public static void SalesTransfer(SalesAssociate salesAccount) {
		SalesAccount = salesAccount;	
	}
	public static SalesAssociate getSalesAcct() {
		return SalesAccount;
	}

	
	
	public static void WhManTransfer(WhManager whAccount) {
		WhAccount = whAccount;
	}
	public static WhManager getWhManAcct() {
		return WhAccount;
	}

	
	
	public static void OffManTransfer(OfficeManager offAccount) {
		OffAccount = offAccount;	
	}
	public static OfficeManager getOffAcct() {
		return OffAccount;
	}
}
