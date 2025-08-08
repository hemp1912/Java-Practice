class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dogs d = new Dogs();
        d.sound();

        Animal ad = new Dogs();
        ad.sound();
    }
}

