package carDealership.custom_exceptions;

public class Invalid_Kilometrage_exception extends RuntimeException {
  public Invalid_Kilometrage_exception() {
    super();
  }

  public Invalid_Kilometrage_exception(String message) {
    super(message);
  }

  public Invalid_Kilometrage_exception(String message, Throwable cause) {
    super(message, cause);
  }

  public Invalid_Kilometrage_exception(Throwable cause) {
    super(cause);
  }
}
