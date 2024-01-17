package com.inanc.model;

public enum PaintColor {
    RED("#000000"),
    YELLOW("#000000"),
    GRAY("#000000"),
    BLACK("#000000"),
    WHITE("#000000");

    private String hexcode;

    PaintColor(String hexcode){
        this.hexcode = hexcode;
    }
}
