package myprogs.ExceptionHandling;

import java.util.List;

public class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
