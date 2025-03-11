// Parent class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal;  // Reference of parent class

        animal = new Dog();
        animal.sound();  // Calls Dog's sound() method at runtime

        animal = new Cat();
        animal.sound();  // Calls Cat's sound() method at runtime
    }
}

