package bk.notification.valid;

import java.util.List;

public class ValidationResult {
    private final Boolean result;
    private List<String> errorList;

    public ValidationResult(Boolean result, List<String> errorList) {
        this.result = result;
        this.errorList = errorList;
    }

    public ValidationResult(Boolean result) {
        this.result = result;
    }

    public Boolean isValid() {
        return result;
    }

    public List<String> getErrorList() {
        return errorList;
    }
}
