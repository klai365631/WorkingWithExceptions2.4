public class ValidatorService {

    private ValidatorService() {

    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            validateParams(login, password, confirmPassword);

            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;

        }
    }

    private static void validateParams(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login == null || login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть меньше или ровна 20");
        }
        if (password == null || confirmPassword == null || password.length() >= 20 || confirmPassword.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать!");
        }
    }
}
