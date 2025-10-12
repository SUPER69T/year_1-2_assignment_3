package carDealership.custom_exceptions;

public class Invalid_discount_pricing extends RuntimeException {
    public Invalid_discount_pricing() {
        super();
    }

    public Invalid_discount_pricing(String message) {
        super(message);
    }

    public Invalid_discount_pricing(String message, Throwable cause) {
        super(message, cause);
    }

    public Invalid_discount_pricing(Throwable cause) {
        super(cause);
    }
}
