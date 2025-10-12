package employee;

import carDealership.Car;

import java.nio.file.Path;

public class employee implements Comparable<employee>{
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

    public void sell_vehicle(Car car, Path path){

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
}
