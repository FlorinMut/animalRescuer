package org.fasttrackit;

public class Dog extends Animal {

private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void determineFeelingOfTheAnimal() {
        super.determineFeelingOfTheAnimal();
        System.out.println("The dog is happy");
    }
}
