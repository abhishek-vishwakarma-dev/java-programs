public class Demo2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Sound();

        Animal a1 = new Dog();
        a1.Sound();

        Animal a2 = new Cat();
        a2.Sound();

    }

}

class Animal {
    void Sound() {
        System.out.println("Animals making sound");
    }
}

class Dog extends Animal {
    @Override
    void Sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void Sound() {
        System.out.println("Cat meows");
    }
}
