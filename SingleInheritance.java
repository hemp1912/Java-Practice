class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student1 extends Person {
    String studentId;

    Student1(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Alice", 20, "S12345");
        s1.displayStudentInfo();
    }
}
 
    

