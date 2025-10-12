package carDealership;

public class Car {
    private String plate;
    private int year_model;
    private double price;
    private double Kilometrage;
    private String manufacturer;
    public Car(String plate, int year_model, double price, double Kilometrage, String manufacturer) {
        boolean error = false;
        if (!(4 < plate.length() && plate.length() < 7)) error = true; System.out.println("Invalid plate length.");
        if (!(year_model > 2017)) error = true; System.out.println("Too old of a model.");
        if (!(price >= 0)) error = true; System.out.println("Invalid price.");
        if (!(Kilometrage >= 0)) error = true; System.out.println("Invalid Kilometrage.");
        if (manufacturer.isEmpty()) error = true; System.out.println("Empty manufacturer name.");
        if (error) {
            this.plate = plate;
            this.year_model = year_model;
            this.price = price;
            this.Kilometrage = Kilometrage;
            this.manufacturer = manufacturer;
        }

    }
}
