package exception;

public class InvalidCredentials extends RuntimeException {
    private static final Integer ERROR_CODE = 400;

    public InvalidCredentials(String msg) {
        super(msg + ": " + ERROR_CODE);
    }
}