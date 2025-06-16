public class Task1 {
    public static void main(String[] args) {
        try{
            int[] num = {1, 2, 3};
            System.out.println(num[4]);
            int a = 10/0;
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Исключение " + e);
        }
    }
}
