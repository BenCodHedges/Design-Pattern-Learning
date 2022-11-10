package org.benh.Creational.AbstractFactory;

import org.benh.Creational.AbstractFactory.Systems.MacFactory;
import org.benh.Creational.AbstractFactory.Systems.WinFactory;
import org.benh.Creational.AbstractFactory.Systems.iFactory;

public class GUIAbstractFactory {

    public iFactory createFactory(String os){
        switch (os){
            case "Win":
                return new WinFactory();
            case "Mac":
                return new MacFactory();
            default:
                return new WinFactory();
        }
    }
}
