package org.fasttrackit;

public class Adopter {

    private String name;
    private int budget;

   public void feedAnimal (String name, String foodName){ //declararea metodei 1 din tema//

       System.out.println("Gigi just gave some Chappie food to Bull");

   }

   public void walkAnimal (){      //declararea metodei 2 din tema//

       System.out.println("Gigi take Bull for a Walk");

   }

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
