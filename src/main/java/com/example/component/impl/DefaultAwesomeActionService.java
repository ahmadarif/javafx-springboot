package com.example.component.impl;

import com.example.component.AwesomeActionService;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Created by ARIF on 26-Apr-17.
 */
@Component
public class DefaultAwesomeActionService implements AwesomeActionService {

    private ResourceBundle bundle = ResourceBundle.getBundle("com.example.view.helloworld");

    @Override
    public String processName(final String name) {
        if (name.equals("Arif")) {
            return MessageFormat.format(bundle.getString("greeting"), name);
        } else {
            return "Hallo Unknown Stranger!";
        }
    }

}