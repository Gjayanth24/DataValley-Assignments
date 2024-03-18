package Assignment3;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    
    void makeSound(String sound) {
        System.out.println("Dog makes " + sound);
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); 

        Dog dog = new Dog();
        dog.makeSound(); 

        
        dog.makeSound("woof"); 
    }
}

