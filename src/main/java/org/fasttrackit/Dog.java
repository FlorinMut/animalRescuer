package org.fasttrackit;

public class Dog extends Animal {

public String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void determineFeelingOfTheAnimal() {
        System.out.println(getName()+" is happy");
    }
}
