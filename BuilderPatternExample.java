package builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new ConcreteStudentBuilder();

        Student student = studentBuilder.
                setName("Md. Mohacel Hosen")
                .setAddress("Dhaka Uttara -1230")
                .setAge(23)
                .build();
        System.out.println(student);
    }
}
