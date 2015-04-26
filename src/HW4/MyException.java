package HW4;

/**
 * Created by pc on 07.04.2015.
 */
public class MyException extends Exception {
    private final String errorCode;

    public MyException(String errorCode) {
        this.errorCode = errorCode;

    }

    public String getErrorCode() {
        return errorCode;
    }
}
