package org.benh.Creational.Factory;

import org.benh.Creational.Factory.Systems.Android;
import org.benh.Creational.Factory.Systems.IOS;
import org.benh.Creational.Factory.Systems.OS;
import org.benh.Creational.Factory.Systems.Windows;

public class OperatingSystemFactory {
    public OS getInstance(String str){
        switch (str){
            case "open":
                return new Android();
            case "closed":
                return new IOS();
            default:
                return new Windows();
        }

    }
}
