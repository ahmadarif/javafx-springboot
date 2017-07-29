package com.example.controller;

import com.example.component.AwesomeActionService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ARIF on 26-Apr-17.
 */
@FXMLController
public class HelloWorldController {

    @FXML
    private Label helloLabel;

    @FXML
    private TextField helloField;

    @FXML
    public Button helloButton;

    @Autowired
    private AwesomeActionService actionService;

    @FXML
    private void setHelloText() {
        final String textToBeShown = actionService.processName(helloField.getText());
        helloLabel.setText(textToBeShown);
    }

}