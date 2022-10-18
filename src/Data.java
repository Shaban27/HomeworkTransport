public class Data {
    private static final String VALID = "abcdefghijklmnopqrstuvwxyz1234567890_";

    private Data() {
    }

    public static boolean right(String login, String password, String confirmPassword) {
        try {
            checkD(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkD(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!right(password)) {
            throw new WrongPasswordException("Пароль правильный");
        }
        if (!right(login)) {
            throw new WrongLoginException("Логин не правильный");
        }
        if (password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли совпадают");
        }}
    static boolean right(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;

    }
}

