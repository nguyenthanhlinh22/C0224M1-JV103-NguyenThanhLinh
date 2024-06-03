package src;

public abstract class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public String getInfo() {
        return "Name: " + name + ", Age: " + age + "\n";
    }

}
