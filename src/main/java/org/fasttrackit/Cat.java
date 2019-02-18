package org.fasttrackit;

public class Cat extends Animal {

    @Override
    public void determineFeelingOfTheAnimal() {
        System.out.println(getName()+" is mewoing");
    }

    private String eyeColor;

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Cat() {
        this.eyeColor = eyeColor;
    }
}
