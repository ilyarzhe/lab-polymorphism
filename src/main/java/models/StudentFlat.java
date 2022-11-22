package models;

import interfaces.IHistoricalSights;

import java.time.LocalDate;

public class StudentFlat extends Building implements IHistoricalSights {
    private long numberOfPartiesHosted;
    public StudentFlat(int numberOfRooms, LocalDate dateOfConstruction, int numberOfOccupants,int numberOfPartiesHosted){
        super(numberOfRooms,dateOfConstruction,numberOfOccupants);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }
    public long getNumberOfPartiesHosted(){
        return this.numberOfPartiesHosted;
    }
    public void setNumberOfPartiesHosted(int amount){
        this.numberOfPartiesHosted = amount;
    }
    public void hostParty(){
        this.numberOfPartiesHosted+=1;
    }
    @Override
    public boolean isOverPopulated(){
        return (2*this.numberOfOccupants)>this.numberOfRooms;
    }
    public boolean isOld(){
        return (LocalDate.now().getYear() - this.getDateOfConstruction().getYear())>10;
    }
    public String tellHistory(){
        return String.format("This good old building was built in %s and hosted exactly %s parties",this.dateOfConstruction.getYear(),this.numberOfPartiesHosted);
    }
}
