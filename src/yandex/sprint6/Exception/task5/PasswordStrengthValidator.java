package yandex.sprint6.Exception.task5;

public class PasswordStrengthValidator implements Validator {

    private boolean hasNumber(final String password) {
        for (int counter = 0; counter < password.length(); counter++) {
            if (Character.isDigit(password.charAt(counter))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasLetter(final String password) {
        for (int counter = 0; counter < password.length(); counter++) {
            if (Character.isLetter(password.charAt(counter))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void validate(final String password) throws ValidateException {
        if (!hasLetter(password) || !hasNumber(password)) {
            throw new ValidatePasswordException("Пароль должен содержать буквы и цифры");
        }
    }
}