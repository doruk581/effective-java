package com.doruk.tutorials.solid.liskov.violation;

public class Engine {

    private Integer power;

    void on(){

    }

    void powerOn(Integer power){
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
