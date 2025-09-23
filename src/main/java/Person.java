public class Person {

    public final int age;

    public Person(int age) {
        this.age = age;
    }
}

class Employee extends Person {

    public final String name;

    // Constructors don't need to call super() as the first statement in java 25
    public Employee(int age, String name) {
        if (age < 18 || age > 65) {
            throw new IllegalArgumentException("Age must be between 18 and 65");
        }

        super(age);
        this.name = name;
    }
}
