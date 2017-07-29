package com.example;

import com.example.view.HelloWorldView;
import de.roskenet.jfxsupport.test.GuiTest;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ARIF on 26-Apr-17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldViewTest extends GuiTest {

    @PostConstruct
    public void constructView() throws Exception {
        init(HelloWorldView.class);
    }

    @Test
    public void testClickButton_Arif() {
        clickOn("#helloField")
                .write("Arif")
                .clickOn("#helloButton");

        assertThat(labelText(), is("Hallo Arif!"));
    }

    @Test
    public void testClickButton_Ahmad() {
        clickOn("#helloField")
                .write("Berta")
                .clickOn("#helloButton");

        assertThat(labelText(), is("Hallo Unknown Stranger!"));
    }

    private String labelText() {
        return ((Label) find("#helloLabel")).getText();
    }

    @After
    public void resetValues() {
        // You are responsible for cleaning up your Beans!
        Platform.runLater(() -> {
            TextField helloLabel = (TextField) find("#helloField");
            helloLabel.setText("");
        });
    }

}