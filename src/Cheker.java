public interface Cheker {

    void checkLogin(String login) throws WrongLoginException;

    void checkPassword(String password);
}
