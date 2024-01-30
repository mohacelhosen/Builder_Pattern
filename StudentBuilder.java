package builder;

// Builder interface
public interface StudentBuilder {
    StudentBuilder setName(String name);
    StudentBuilder setAge(int age);
    StudentBuilder setAddress(String address);
    Student build();
}
