package com.example;

import com.example.view.HelloWorldView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJavafxApplication extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launchApp(DemoJavafxApplication.class, HelloWorldView.class, args);
	}
}