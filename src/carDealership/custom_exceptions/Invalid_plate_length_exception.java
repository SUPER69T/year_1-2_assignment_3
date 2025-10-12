package carDealership.custom_exceptions;

public class Invalid_plate_length_exception extends Exception {
    public Invalid_plate_length_exception() {
        super();
    }

    public Invalid_plate_length_exception(String message) {
        super(message);
    }

    public Invalid_plate_length_exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Invalid_plate_length_exception(Throwable cause) {
        super(cause);
    }
}
