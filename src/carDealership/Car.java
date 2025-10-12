package carDealership;

import carDealership.custom_exceptions.*;  //.* עושה אימפורט לכל המחלקות בתיקיה.
import employee.EmployeeRecord;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Car {
    private String plate;
    private int model_year;
    private double price;
    private double Kilometrage;
    private String manufacturer;
    public Car(String plate, int model_year, double price, double Kilometrage, String manufacturer) throws Invalid_plate_length_exception, Invalid_model_year_exception, Invalid_price_exception, Invalid_Kilometrage_exception, Invalid_manufacturer_exception {
        if (!check_plate(plate) || !check_model_year(model_year) || !check_price(price) || !check_Kilometrage(Kilometrage) || !check_manufacturer(manufacturer)) {
            this.plate = plate;
            this.model_year = model_year;
            this.price = price;
            this.Kilometrage = Kilometrage;
            this.manufacturer = manufacturer;
        }
    }

    //exception_checks:  //אלו הן יותר מדי - exceptions :(..
     public boolean check_plate(String plate) throws Invalid_plate_length_exception {
         if (!(4 < plate.length() && plate.length() < 7)) {throw new Invalid_plate_length_exception("The plate length must be between either 5 or 6.");}
         return true;
     }
     public boolean check_model_year(int model_year) throws Invalid_model_year_exception {
         if (!(model_year > 2017)) {throw new Invalid_model_year_exception("The model year must be 2017 and newer.");}
         return true;
     }
     public boolean check_price(double price) throws Invalid_price_exception {
         if (!(price >= 0)) {throw new Invalid_price_exception("The price must be a positive number.");}
         return true;
     }
     public boolean check_Kilometrage(double kilometrage) throws Invalid_Kilometrage_exception {
         if (!(kilometrage >= 0)) {throw new Invalid_Kilometrage_exception("The kilometrage must be a positive number.");}
         return true;
     }
     public boolean check_manufacturer(String manufacturer) throws Invalid_manufacturer_exception {
         if (manufacturer.isEmpty()) {throw new Invalid_manufacturer_exception("The manufacturer's name cannot be empty.");}
         return true;
     }
     public boolean check_discount_diff(double difference) throws Invalid_discount_pricing {
        if (difference > 5000) {throw new Invalid_discount_pricing("The discount cannot be greater than 5000.");}
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

    public void vehicle_discount(double discount_Percentage){
        if (check_discount_diff(getPrice() * discount_Percentage)) return;
        else {
            setPrice(getPrice() - getPrice() * discount_Percentage);
        }
    }

    public void selling_Vehicle() throws IOException {
        //creating/updating the sold_vehicles logs file:
        try {
            String this_dir = Objects.requireNonNull(Car.class.getResource("")).getPath();  //"" מוצאת את כתובת הדיירקטורי הנוכחי של Car-כלומר את carDealership.
            //כתיבה כזאת אינה מומלצת לשמירת הקובץ עצמו בין הבניות אבל זה לא משנה לעבודה הזאת וביקשו לשים את כל הקבצים בתוך carDealership וזה כבר נמצא ב-root directory אז...
            String resources_path = this_dir + "/sold_vehicles.txt";
            File file = new File(resources_path);

            //checking weather the file exists:
            boolean file_exists = false;
            if (file.createNewFile()) {
                System.out.println("File created at: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }

            // write into the file
            try (FileWriter writer = new FileWriter(file, true)) {  // סוגר את writer אוטומטית, גם בודק exception בעצמו.
                if (!file_exists) {
                    writer.write("sold vehicles log:\n\n");
                }

                writer.write(this.toString());
                writer.write("\n------------------------------\n");
                System.out.println("Sale recorded successfully!");
            }

        } catch (IOException e) {
            e.printStackTrace();  // מדפיס report על השגיאה.
        }
        //
    }




    @Override
    public String toString() {
        return String.format("%s %d %f %f %s.", plate, model_year, price, Kilometrage, manufacturer);
    }
}
