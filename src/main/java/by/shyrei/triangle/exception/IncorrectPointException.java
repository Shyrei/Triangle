package by.shyrei.triangle.exception;

/**
 * Project Triangle
 * Created on 29.05.2017.
 * author Uladzimir
 */
public class IncorrectPointException extends Exception {

    public IncorrectPointException() {
    }

    public IncorrectPointException(Throwable cause) {
        super(cause);
    }

    public IncorrectPointException(String msg) {
        super(msg);
    }

    public IncorrectPointException(String msg, Throwable e) {
        super(msg, e);
    }
}
