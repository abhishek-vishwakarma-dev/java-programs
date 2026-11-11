public class abstrns {
    public static void main(String[] args) {
        Animal a = new Dog("Happy");
        a.makeSound();
        a.sleep();
    }

}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("making sound");
    }

    final void sleep() {
        System.out.println("Sleeping");
    }

}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Making barking sound");
    }
}
