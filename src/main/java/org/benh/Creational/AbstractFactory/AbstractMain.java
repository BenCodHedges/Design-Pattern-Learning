package org.benh.Creational.AbstractFactory;

import org.benh.Creational.AbstractFactory.Systems.iButton;
import org.benh.Creational.AbstractFactory.Systems.iFactory;
import org.benh.Creational.AbstractFactory.Systems.iTextBox;

public class AbstractMain {
    public static void main(String[] args) {
        String osType = "Mac";

        iFactory fact = new GUIAbstractFactory().createFactory(osType); //As we are automatically calling createFactory, it sets the type upon creation
//        iFactory fact = new GUIAbstractFactory(); //JVM make it an empty constuctor of type GUIAbstractFactory
//        fact.createFactory(osType); //When this is called, it doesnt have a type of iFactory

        iButton button = fact.createButton();
        button.press();

        iTextBox textbox = fact.createTextBox();
        textbox.showText();
    }
}
