package carDealership.custom_exceptions;

public class Invalid_manufacturer_exception extends RuntimeException {
  public Invalid_manufacturer_exception() {
    super();
  }

  public Invalid_manufacturer_exception(String message) {
    super(message);
  }

  public Invalid_manufacturer_exception(String message, Throwable cause) {
    super(message, cause);
  }

  public Invalid_manufacturer_exception(Throwable cause) {
    super(cause);
  }
}
