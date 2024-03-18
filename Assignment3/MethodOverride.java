package Assignment3;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    // Method overloading
    void makeSound(String sound) {
        System.out.println("Dog makes " + sound);
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks

        // Method overloading demonstration
        dog.makeSound("woof"); // Output: Dog makes woof
    }
}


