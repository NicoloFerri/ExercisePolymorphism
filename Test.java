package javaOOPAdvanced_V2.Inheritance_Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Animal("Lion");
        dog.animalSound();
        dog.animalSound("low");
    }
}
