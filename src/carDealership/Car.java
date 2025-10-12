package carDealership;

import carDealership.custom_exceptions.*;

public class Car {
    private String plate;
    private int model_year;
    private double price;
    private double Kilometrage;
    private String manufacturer;
    public Car(String plate, int model_year, double price, double Kilometrage, String manufacturer) throws Invalid_manufacturer_exception, Invalid_Kilometrage_exception, Invalid_model_year_exception, Invalid_price_exception, Invalid_plate_length_exception {  //תאכלס חוץ מטיפה תרגול כל ה-exceptions הן מיותרות לגמרי.
        boolean exception_thrown = check_plate(plate);
        exception_thrown = check_model_year(model_year);
        exception_thrown = check_price(price);
        exception_thrown = check_Kilometrage(Kilometrage);
        exception_thrown = check_manufacturer(manufacturer);

        if (!exception_thrown) {
            this.plate = plate;
            this.model_year = model_year;
            this.price = price;
            this.Kilometrage = Kilometrage;
            this.manufacturer = manufacturer;
            }
    }

    //exception_checks:
     public boolean check_plate(String plate) throws Invalid_plate_length_exception{
         if (!(4 < plate.length() && plate.length() < 7)) {throw new Invalid_plate_length_exception("Invalid plate length.");}
         return true;
     }
     public boolean check_model_year(int model_year) throws Invalid_model_year_exception{
         if (!(model_year > 2017)) {throw new Invalid_model_year_exception("Too old of a model.");}
         return true;
     }
     public boolean check_price(double price) throws Invalid_price_exception{
         if (!(price >= 0)) {throw new Invalid_price_exception("Invalid price.");}
         return true;
     }
     public boolean check_Kilometrage(double kilometrage) throws Invalid_Kilometrage_exception{
         if (!(kilometrage >= 0)) {throw new Invalid_Kilometrage_exception("Invalid Kilometrage.");}
         return true;
     }
     public boolean check_manufacturer(String manufacturer) throws Invalid_manufacturer_exception{
         if (manufacturer.isEmpty()) {throw new Invalid_manufacturer_exception("Empty manufacturer name.");}
         return true;
     }
    //

    //getters:
    public String getPlate() {return plate;}
    public int getModel_year() {return model_year;}
    public double getPrice() {return price;}
    public double getKilometrage() {return Kilometrage;}
    public String getManufacturer() {return manufacturer;}
    //

    //setters:
    public void setPlate(String plate) throws Invalid_plate_length_exception {
        if(check_plate(plate)){
            this.plate = plate;
        }
    }
    public void setModel_year(int model_year) throws Invalid_model_year_exception {
        if(check_model_year(model_year)){
            this.model_year = model_year;
        }
    }
    public void setPrice(double price) throws Invalid_price_exception {
        if(check_price(price)) {
            this.price = price;
        }
    }
    public void setKilometrage(double kilometrage) throws Invalid_Kilometrage_exception {
        if(check_Kilometrage(kilometrage)){
            this.Kilometrage = kilometrage;
        }
    }
    public void setManufacturer(String manufacturer) throws Invalid_manufacturer_exception {
        if(check_manufacturer(manufacturer)){
            this.manufacturer = manufacturer;
        }
    }
    //

    @Override
    public String toString() {
        return String.format(plate, model_year, price, Kilometrage, manufacturer);
    }
}
