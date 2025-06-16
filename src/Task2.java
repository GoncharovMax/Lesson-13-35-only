public class Task2 {
    public static void main(String[] args) {
    try {
        Person p1 = new Person("Максим",16);
        System.out.println(p1);
    }catch (AgeException e) {
        System.out.println("Не подходит по возрасту p1" +e.getMessage());
    }
    try {
        Person p2 = new Person("Андрей", 21);
        System.out.println("Подходит во возрасту " + p2 );
    }catch (AgeException e) {
        System.out.println("Не подходит по возрасту " +e.getMessage());
    }
    }
}
