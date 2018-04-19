/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Tripp
 */
public class OfficeManagerController implements Initializable {

    @FXML
    private TextArea checkStockTextArea;
    @FXML
    private TextField findUnitsTextField;
    @FXML
    private Button locateLessButton;
    @FXML
    private TextField manInvStartTextField;
    @FXML
    private TextField manInvEndTextField;
    @FXML
    private Font x1;
    @FXML
    private TextField clientNameTextField;
    @FXML
    private Button SearchInvButton;
    @FXML
    private TextArea ManageInvTextArea;
    @FXML
    private TextField salesAssoTextField;
    @FXML
    private TextField commStartTextField;
    @FXML
    private TextField commEndTextField;
    @FXML
    private Button genPaycheckButton;
    @FXML
    private TextArea paycheckTextArea;
    @FXML
    private MenuButton menuSSA;
    @FXML
    private MenuItem nameSearch;
    @FXML
    private MenuItem numSearch;
    @FXML
    private TextArea searchTextArea;
    @FXML
    private TextField findPartTextField;
    @FXML
    private Label partNumLabel;
    @FXML
    private Label partNameLabel;
    @FXML
    private Button buttonSearch;
    @FXML
    private Label databaseLabel;
    @FXML
    private ComboBox<?> warehousesComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void HandleCheckStockButton(ActionEvent event) {
    }

    @FXML
    private void HandleSearchInvoicesButton(ActionEvent event) {
    }

    @FXML
    private void HandleGeneratePaycheck(ActionEvent event) {
    }

    @FXML
    private void HandleNameSearch(ActionEvent event) {
    }

    @FXML
    private void HandleNumSearch(ActionEvent event) {
    }

    @FXML
    private void HandleSearchButtonAction(ActionEvent event) {
    }
    
}
