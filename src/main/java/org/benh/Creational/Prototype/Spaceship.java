package org.benh.Creational.Prototype;

public class Spaceship implements Prototype{
    private String name;
    private Integer crew;
    private Double fuel;

    public Spaceship(String name, Integer crew, Double fuel) {
        this.name = name;
        this.crew = crew;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getCrew() {
        return crew;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    @Override
    public Prototype createClone() {
        return new Spaceship(name, crew, fuel);
    }
}
