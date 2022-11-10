package org.benh.Creational.AbstractFactory.Systems;

public class WinButton implements iButton{
    @Override
    public void press() {
        System.out.println("Win button pressed");
    }
}
