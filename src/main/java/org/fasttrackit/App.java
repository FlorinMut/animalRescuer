package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App // sa am tot timpul grija sa am APP in main//
{
    public static void main( String[] args ) {

        Animal animal = new Animal();
        animal.setName("Bull");

        AnimalFood animalFood = new AnimalFood("Chappie");

        RecreationalActivity recreationalActivity = new RecreationalActivity("Walk");



        Adopter adopter = new Adopter("Gigi",2400); // facem o referinta pentru a putea folosi metoda create in alta clasa//

        adopter.feedAnimal(animal,animalFood); //apelarea metodei 1. Insa fiindca metoda nu se afla in clasa curenta, va trebui sa creem si aici unul mai sus//

        adopter.walkAnimal(animal,recreationalActivity); //apelarea metodei 2//

        System.out.println( "Hello, World!" );


    }




}
