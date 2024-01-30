package builder;

public class ConcreteStudentBuilder implements StudentBuilder{
    private String name;
    private int age;
    private String address;


    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Student build() {
        return new Student(name,age,address);
    }
}
