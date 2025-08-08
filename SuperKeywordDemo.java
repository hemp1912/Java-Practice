class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }

    void showMessage() {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor called");
    }

    void showMessage() {
        super.showMessage();
        System.out.println("Message from Child class");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMessage();
    }
}

