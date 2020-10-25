package com.doruk.tutorials.solid.liskov.violation;

public class MotorCar implements Car{

    private Engine engine;

    @Override
    public void turnOnEngine() {
        // turn on the engine
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}
