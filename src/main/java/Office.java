import java.time.LocalDate;

public class Office extends Building{
    private String companyName;
    private  double monthlyLease;
    public Office(int numberOfRooms, LocalDate dateOfConstruction, int numberOfOccupants,String companyName, double monthlyLease){
        super(numberOfRooms,dateOfConstruction,numberOfOccupants);
        this.companyName = companyName;
        this.monthlyLease = monthlyLease;
    }
    public String getCompanyName(){
        return this.companyName;
    }
    public double getMonthlyLease(){
        return this.monthlyLease;
    }
    public void setCompanyName(String name){
        this.companyName = name;
    }
    public void setMonthlyLease(double amount){
        this.monthlyLease = amount;
    }
}
