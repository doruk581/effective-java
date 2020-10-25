package com.doruk.tutorials.solid.openclosed;

public class SuperCoolGuitarWithFlames extends Guitar{

    private String flameColour;

    public SuperCoolGuitarWithFlames(String make, String model, Integer volume, String flameColour) {
        super(make, model, volume);
        this.flameColour = flameColour;
    }

    public String getFlameColour() {
        return flameColour;
    }

    public void setFlameColour(String flameColour) {
        this.flameColour = flameColour;
    }
}
