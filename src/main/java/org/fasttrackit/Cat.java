package org.fasttrackit;

public class Cat extends Animal {

    private String eyeColor;

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
