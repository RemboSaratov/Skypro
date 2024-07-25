package course_2.hw_5;

public class main {

    public static void main(String[] args) {
        try {
            DataChecking.check("urtyui12", "Hkjlkjh123", "Hkjlkjh123");
            System.out.println("Работает");
        } catch (WrongLoginException e) {
            System.err.println("В поле логин введен запрешенный символ");
        } catch (WrongPasswordException e) {
            System.err.println("В поле пароль введен запрещенный символ или пароль не совпадает с подтвержденным");
        } finally {
            System.out.println("Чтото там");
        }
    }
}
