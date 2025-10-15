package employee;

import carDealership.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class employee implements Comparable<employee> {
    private String f_name;
    private String ID;
    private int sells;
    public employee(String f_name, String ID, int sells) {
        if(f_name == null || !is_only_letters(f_name)) throw new IllegalArgumentException("Name must be only letters.");
        if(ID == null || ID.length() < 9) throw new IllegalArgumentException("ID must be at least 9 characters.");
        if(sells < 0) throw new IllegalArgumentException("Sales cannot be negative.");
        this.f_name = f_name;
        this.ID = ID;
        this.sells = sells;
    }

    //getters;
    public String getF_name() {return f_name;}
    public String getID() {return ID;}
    public int getSells() {return sells;}
    //

    //setters;
     public void setName(String f_name) {this.f_name = f_name;}
    public void setID(String ID) {this.ID = ID;}
    public void setSells(int sells) {this.sells = sells;}
    //
    public void sell_vehicle(Car car, Path path) {
        File sales_log = path.toFile();
        if (sales_log.isDirectory()) {
            throw new IllegalArgumentException("The given path points to a directory, not a file.");
        }
        try (FileWriter writer = new FileWriter(sales_log, true)) {
            if (sales_log.length() == 0) {
                writer.write("sold vehicles / employee - log:\n\n");
            }
            writer.write(car.toString() + "  /  " + this.toString());
            writer.write("\n------------------------------\n");
            setSells(this.getSells() + 1);
            car.sell_Vehicle();
        } catch (IOException e) {
            throw new IllegalStateException("Failed to write to sales log.", e);
        }
    }

    public boolean is_only_letters(String f_name) {
        for(int i = 0; i < f_name.length(); i++) {
            if(!Character.isLetter(f_name.charAt(i))) return false;
        }
        return true;
    }

    @Override
    public int compareTo(employee o) {
        return this.f_name.compareTo(o.f_name);
    }

    @Override
    public String toString() {
        return this.f_name + " " + this.ID + " " + this.sells;
    }
}
