class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Polymorphism
        Animal a2 = new Cat();

        a1.sound(); // Output: Dog barks
        a2.sound(); // Output: Cat meows
    }
}
