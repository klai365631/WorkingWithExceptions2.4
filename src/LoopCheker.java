public class LoopCheker implements Cheker {
    private static final String VALID_SYMBOLS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789";

    @Override
    public void checkLogin(String login) throws WrongLoginException {
        for (int i = 0; i < login.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Логин содержит запрещенный символ" + login.charAt(i));
            }

        }
    }

    ;

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        for (int i = 0; i < password.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException("Пароль содержит запрещенный символ" + password.charAt(i));
            }
        }
    }

    ;
}
