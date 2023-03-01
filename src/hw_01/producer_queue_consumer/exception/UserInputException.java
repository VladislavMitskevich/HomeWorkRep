package hw_01.producer_queue_consumer.exception;

import java.util.InputMismatchException;

public class UserInputException extends InputMismatchException {
    public UserInputException(String message) {
        super(message);
    }
}
