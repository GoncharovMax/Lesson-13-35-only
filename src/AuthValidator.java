public class AuthValidator {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >=20 || login.contains(" ")){
            throw new WrongLoginException("Логин должен быть меньше 20 символов и без пробелов");
        }
        if (password.length() >=20 || password.contains(" ") || !password.matches(".*\\d.*")){
            throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов, не должна оставлять пробел и должена\n" +
                    "содержать хотя бы одну цифру");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают.");
        }
        return true;
    }
}
