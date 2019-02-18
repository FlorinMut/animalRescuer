package org.fasttrackit;


public class App // sa am tot timpul grija sa am APP in main//
{
    public static void main( String[] args ) {

        /* Animal animal = new Animal();
        animal.setName("Bull");
        animal.setAge(3);
        animal.setHealthLevel(10);
        animal.setJoynessLevel(10);
        animal.setFavoriteFood("Chappie");
        animal.setFavoriteRecreationalActivity("Eating");

        Adopter adopter = new Adopter("Gigi",100); //dupa creare constructor adapter, are deja nume aici, mai punem sau le stergem cele de jos?
        adopter.setName("Gigi");
        adopter.setBudget(1500);

        Cat cat = new Cat("Blue");



        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Johnny");
        veterinarian.setSpecialization("Surgeon");

        AnimalFood animalFood = new AnimalFood("beef");
        animalFood.setFoodAvailability(true);

        RecreationalActivity recreationalActivity = new RecreationalActivity("walking");
        recreationalActivity.setActivityName("Walking"); */

        Animal animal = new Animal();
        animal.setName("Bull");

        AnimalFood animalFood = new AnimalFood("Chappie");

        RecreationalActivity recreationalActivity = new RecreationalActivity("Walk");

        Rescuer rescuer = new Rescuer("Gigi",2400); // facem o referinta pentru a putea folosi metoda create in alta clasa//

        Veterinarian firstVeterinarian = new Veterinarian();
        firstVeterinarian.setName("Tim");

            Animal dog1 = new Dog();
            dog1.setName("Max"); //aici setam nume pt ei ca sa il ia getName cand apeleaza metoda mai jos

            Animal cat = new Cat();
            cat.setName("Maxxie");  //aici setam nume pt ei ca sa il ia getName cand apeleaza metoda mai jos


        rescuer.feedAnimal(animal,animalFood); //apelarea metodei 1. Insa fiindca metoda nu se afla in clasa curenta, va trebui sa creem si aici unul mai sus//



        rescuer.walkAnimal(animal,recreationalActivity); //apelarea metodei 2//

        //rescuer.searchVeterinarian(rescuer,firstVeterinarian,animalFood,animal);


        //System.out.println(animal.toString());

        animal.determineFeelingOfTheAnimal();
        dog1.determineFeelingOfTheAnimal(); //cand apelam aceasta metoda se va apela prima data si metoda determine feeling din Animal, pt ca e suprascrisa (overriding) in sub-clasele clasei Animal
        cat.determineFeelingOfTheAnimal(); //la fel





    }




}
