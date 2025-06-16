public class VerniyTask1 {
    public static void main(String[] args) {
        String login = "Goncharov95";
        String password = "Goncharov95456789";
        String confirmPassword = "Goncharov95456789";
        try {
            boolean isValid = AuthValidator.validate(login, password, confirmPassword);
            System.out.println("Регистрация прошла успешно : " + isValid);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка регистрации : " + e.getMessage());
        }
    }
}
