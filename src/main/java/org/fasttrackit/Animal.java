package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int joynessLevel;
    private String favoriteFood;
    private String favoriteRecreationalActivity;

   @Override
    public String toString() { //am creat-o cu Alt Insert in parantezele metodei --> toString si am selectat toate optiunile. Nu e obligatorie ca sa mearga overridingul, trebuie doar sa avel sub clase si sa suprascriem metoda din clasa principala in acele sub clase
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", joynessLevel=" + joynessLevel +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteRecreationalActivity='" + favoriteRecreationalActivity + '\'' +
                '}';
    }

    public void determineFeelingOfTheAnimal(){

        System.out.println("The animal is moving his eyes");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getJoynessLevel() {
        return joynessLevel;
    }

    public void setJoynessLevel(int joynessLevel) {
        this.joynessLevel = joynessLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(String favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }



    public Animal() {
        this.name = name;
        this.age = age;
    }





}

