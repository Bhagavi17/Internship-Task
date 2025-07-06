// Base class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another derived class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class OOPDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound(); // Calls method from Animal
        myDog.sound();    // Calls overridden method from Dog
        myCat.sound();    // Calls overridden method from Cat
    }
}
