package general_task_for_oop.task2;

import inheritance.exercise1.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Elephant();
        Animal animal2 = new Monkey();
        Animal animal3 = new Lion();

        animalSound(animal);
        animalSound(animal2);
        animalSound(animal3);
    }

    public static void animalSound(Animal animal) {
        animal.makeSound();
    }
}
