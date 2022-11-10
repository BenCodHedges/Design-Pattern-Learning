package org.benh.Creational.AbstractFactory.Systems;

public class MacFactory implements iFactory{
    @Override
    public iButton createButton() {
        return new MacButton();
    }

    @Override
    public iTextBox createTextBox() {
        return new MacTextBox();
    }
}
