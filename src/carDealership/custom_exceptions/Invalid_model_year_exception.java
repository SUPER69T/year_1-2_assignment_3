package carDealership.custom_exceptions;

public class Invalid_model_year_exception extends RuntimeException {
  public Invalid_model_year_exception() {
    super();
  }

  public Invalid_model_year_exception(String message) {
    super(message);
  }

  public Invalid_model_year_exception(String message, Throwable cause) {
    super(message, cause);
  }

  public Invalid_model_year_exception(Throwable cause) {
    super(cause);
  }
}
