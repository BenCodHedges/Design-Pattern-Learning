package org.benh.Creational.AbstractFactory.Systems;

public class MacButton implements iButton{
    @Override
    public void press() {
        System.out.println("Mac button pressed");
    }
}
