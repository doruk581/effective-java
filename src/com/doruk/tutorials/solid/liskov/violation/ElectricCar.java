package com.doruk.tutorials.solid.liskov.violation;

public class ElectricCar implements Car{

    @Override
    public void turnOnEngine() {
        // Electric car has no engine, so it violates the Liskov Substution principle
    }

    @Override
    public void accelerate() {

    }
}
