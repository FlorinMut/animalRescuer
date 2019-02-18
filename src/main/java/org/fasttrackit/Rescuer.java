package org.fasttrackit;


public class Rescuer {

    private String name;
    private int budget;


    public void feedAnimal (Animal animal, AnimalFood animalFood){ //declararea metodei 1 din tema//

       System.out.println("Gigi just gave some "+ animalFood.getFoodName()+ " to "+ animal.getName()); //trebie sa creezi si un adaptor//

       animal.hungerLevel--;
       System.out.println(animal.hungerLevel);




       //if(animal.getFavoriteFood()=animalFood.getFoodName()){
          //// animal.joynessLevel++;
          // System.out.println(animal.joynessLevel);

    }


   public void walkAnimal (Animal animal, RecreationalActivity recreationalActivity){      //declararea metodei 2 din tema//

       System.out.println("Gigi take " + animal.getName()+ " for a " + recreationalActivity.getActivityName()); //treb sa faci la fel pt a 2-a metoda//

       animal.joynessLevel++;
       System.out.println(animal.joynessLevel);

   }

   public void searchVeterinarian (Rescuer rescuer, Veterinarian firstVeterinarian, AnimalFood animalFood, Animal animal){

       System.out.println(rescuer.getName() + " goes to " + firstVeterinarian.getName() + " in order to ask him if " + animalFood.getFoodName() + " is the best food for " + animal.getName() + ".");

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

    public Rescuer(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }




}
