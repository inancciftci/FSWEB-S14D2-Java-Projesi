package com.inanc.model;

public class Lamp {
    private boolean battery;
    private LampType style;
    private int globalRating;

    public Lamp(boolean battery, LampType style, int globRating) {
        this.battery = battery;
        this.style = style;
        this.globalRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public LampType getStyle() {
        return style;
    }

    public void setStyle(LampType style) {
        this.style = style;
    }

    public int getGlobalRating() {
        return globalRating;
    }

    public void setGlobalRating(int globalRating) {
        this.globalRating = globalRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", style=" + style +
                ", globalRating=" + globalRating +
                '}';
    }
}
