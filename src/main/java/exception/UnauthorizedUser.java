package exception;

public class UnauthorizedUser extends RuntimeException {
    private static final Integer ERROR_CODE = 401;
    public UnauthorizedUser(String msg) {
        super(msg+ ": " + ERROR_CODE);
    }
}