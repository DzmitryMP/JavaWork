package bk.notification.valid;

import java.util.List;

public class ValidateNotificationException extends RuntimeException {
    private final List<String> errorList;

    public ValidateNotificationException(List<String> errorList) {
        this.errorList = errorList;
    }

    public List<String> getErrorList() {
        return errorList;
    }

    @Override
    public String toString() {
        return "ValidateNotificationException{" +
                "errorList=" + errorList +
                '}';
    }
}
