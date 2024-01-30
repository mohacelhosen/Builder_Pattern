package builder;

// Student class
public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address =address;
    }

    public String toString() {
        return "Person { Name: " + name + ", Age: " + age + ", Address: " + address + " }";
    }
}
