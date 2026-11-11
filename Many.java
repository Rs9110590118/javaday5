
abstract class Animal {

    void color() {
        System.out.println("Animal color is White");
    }

    abstract void sounds();

    abstract void behaviour();
}

class Dog extends Animal {

    // Constructor
    Dog() {
        System.out.println("Dog is barking");
    }

    void sounds() {
        System.out.println("Dog barks");
    }

    void behaviour() {
        System.out.println("Dog is loyal and friendly");
    }

    void color() {
        System.out.println("Dog color is Black");
    }
}

public class Many {
    public static void main(String[] args) {
      Dog d = new Dog();
        d.color();
        d.sounds();
        d.behaviour();
    }
}
