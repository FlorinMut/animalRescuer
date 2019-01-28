package org.fasttrackit;

public class Adopter {

    private String name;
    private int budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Adopter(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }




}
