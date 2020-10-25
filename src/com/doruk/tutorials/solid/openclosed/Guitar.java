package com.doruk.tutorials.solid.openclosed;

public class Guitar {

    private String make;
    private String model;
    private Integer volume;

    public Guitar(String make, String model, Integer volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    public Guitar() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
