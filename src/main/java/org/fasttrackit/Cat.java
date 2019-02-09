package org.fasttrackit;

public class Cat extends Animal {

    @Override
    public void determineFeelingOfTheAnimal() {
        super.determineFeelingOfTheAnimal();
        System.out.println("The cat is mewoing");
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
