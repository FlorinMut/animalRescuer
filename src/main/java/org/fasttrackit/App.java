package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {

        Adopter adopter = new Adopter("Gigi",2400); // facem o referinta pentru a putea folosi metoda create in alta clasa//

        adopter.feedAnimal("Gigi","Chappie"); //apelarea metodei 1. Insa fiindca metoda nu se afla in clasa curenta, va trebui sa creem si aici unul mai sus//

        adopter.walkAnimal(); //apelarea metodei 2//

        System.out.println( "Hello, World!" );


    }




}
