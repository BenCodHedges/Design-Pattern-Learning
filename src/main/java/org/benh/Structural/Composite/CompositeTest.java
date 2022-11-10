package org.benh.Structural.Composite;

public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf("Hard Drive", 80);
        Component mouse = new Leaf("Mouse", 25);
        Component monitor = new Leaf("Monitor", 150);
        Component ram = new Leaf("Ram", 78);
        Component cpu = new Leaf("cpu", 140);

        Composite peripheral = new Composite("Periphal");
        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(motherboard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

//        ram.showPrice();
//        peripheral.showPrice();
        computer.showPrice();
    }
}
