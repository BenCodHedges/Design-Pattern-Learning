package org.benh.Creational.AbstractFactory.Systems;

public class WinFactory implements iFactory{
    @Override
    public iButton createButton() {
        return new WinButton();
    }

    @Override
    public iTextBox createTextBox() {
        return new WinTextBox();
    }
}
