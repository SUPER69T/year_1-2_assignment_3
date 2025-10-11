package employee;

public record PayrollRecord(int ID, double salary, double bonus, double tax) {
    public String calc_Overall_Salary() {
        double Net_salary = salary + bonus - tax;
        return String.format("%.2f", Net_salary);

    }

    @Override
    public String toString(){
        return "ID: " + ID + ", Net salary: " + calc_Overall_Salary() + ".";
    }
}
