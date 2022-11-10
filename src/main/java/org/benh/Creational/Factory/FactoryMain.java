package org.benh.Creational.Factory;

import org.benh.Creational.Factory.Systems.OS;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("open");
        obj.spec();
    }
}
