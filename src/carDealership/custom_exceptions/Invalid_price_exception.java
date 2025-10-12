package carDealership.custom_exceptions;

public class Invalid_price_exception extends RuntimeException {
    public Invalid_price_exception() {
        super();
    }

    public Invalid_price_exception(String message) {
        super(message);
    }

    public Invalid_price_exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Invalid_price_exception(Throwable cause) {
        super(cause);
    }
}
