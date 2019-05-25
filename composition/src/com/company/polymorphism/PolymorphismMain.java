package com.company.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismMain {

    public static void main(String[] args) {
        Animal animal = new Fish();
        animal.move();

        Animal animal1 = new Dog();
        animal1.move();

        List<Animal> animalList= new ArrayList<>();
        animalList.add(new Fish());

    }

}


