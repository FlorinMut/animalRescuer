package org.fasttrackit;

public class Animal {

    public String name;
    public int age;
    public int healthLevel;
    public int hungerLevel = 10; // tema polimorfism: punem public ca sa putem folosi variabila hungerLevel in clasa Adapter
    public int joynessLevel = 0;
    public String favoriteFood = "Taco Bell";
    public String favoriteRecreationalActivity = "Walk";

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
        System.out.println(getName()+" is moving his eyes");
        //pot sa folosesc getName() fara animal in fata pt ca sunt in clasa animal deja si oricum nu am un animal creat

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

