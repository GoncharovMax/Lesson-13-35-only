public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Неверный пароль");
    }
}
