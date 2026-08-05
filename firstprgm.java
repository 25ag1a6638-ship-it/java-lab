class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class DogMethod {
    public static void main(String[] args) {
        Animal mypet = new Dog();
        Animal mypet1 = new Animal();
        mypet.sound();
        mypet1.sound();
    }
}
