package exception.unchecked;

import exception.checked.MyCheckedException;

public class Client {
    public void call() throws MyUncheckedException {
        throw new MyUncheckedException("ex");
    }
}
