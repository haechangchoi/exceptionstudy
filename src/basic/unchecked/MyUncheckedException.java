package basic.unchecked;

public class MyUncheckedException extends RuntimeException {
    MyUncheckedException(String message) {
        super(message);
    }
}
