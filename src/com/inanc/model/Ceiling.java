package com.inanc.model;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create(){
        System.out.println("Ceiling's height is " + this.height + " and the color of Ceiling is " + this.paintedColor);
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", paintedColor=" + paintedColor +
                '}';
    }
}
