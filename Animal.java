package javaOOPAdvanced_V2.Inheritance_Polymorphism;

import java.sql.SQLOutput;

public class Animal {
    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    private String animalName;

    public void animalSound(){
        System.out.print(" questo " + getAnimalName() + " fa : ");
        System.out.println("Roarr!");
    };

    public void animalSound(String intensity){
        if ( intensity == "high"){
            System.out.print(" questo " + getAnimalName() + " fa : ");
            System.out.println("Roarrrrrrrr!");
        } else if (intensity == "low") {
            System.out.print(" questo " + getAnimalName() + " fa : ");
            System.out.println("Roar");
        }else {
            System.out.print(" questo " + getAnimalName() + " fa : ");
            System.out.println("non posso riprodurre il verso");
        }
    }
}
