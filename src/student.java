public class student {
    private String name;
    private String age;
    private String adress;

    public student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
