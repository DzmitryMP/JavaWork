public class TestReException extends RuntimeException {
    public TestReException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestReException(String message) {
        super(message);
    }
}
