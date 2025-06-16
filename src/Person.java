public class Person {
    private String name;
    private int age;
    public Person(String name, int age) throws AgeException {
        if (age < 18) {
            throw new AgeException(" Слишком молод, возраст должен быть 18 или больше.");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
