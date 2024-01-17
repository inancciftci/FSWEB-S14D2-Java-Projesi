package com.inanc.model;

public enum PaintColor {
    RED("#000000"),
    YELLOW,
    GRAY,
    BLACK,
    WHITE;

    private String hexcode;

    PaintColor(String hexcode){
        this.hexcode = hexcode;
    }
}
