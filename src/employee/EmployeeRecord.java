package employee;

public record EmployeeRecord( int ID, String name, int age, String department, String designation) {
    @Override
    public String toString(){
        return "ID: " + ID + "name: " + name + "age: " + age + "department: " + department + "designation: " + designation + ".";
    }
}
