package models;

import java.time.LocalDate;

public abstract class Building {
    protected int numberOfRooms;
    protected LocalDate dateOfConstruction;
    protected int numberOfOccupants;
    public Building(int numberOfRooms,LocalDate dateOfConstruction, int numberOfOccupants){
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
        this.numberOfOccupants = numberOfOccupants;
    }
    public int getNumberOfRooms(){
        return this.numberOfRooms;
    }
    public LocalDate getDateOfConstruction(){
        return this.dateOfConstruction;
    }
    public int getNumberOfOccupants(){
        return this.numberOfOccupants;
    }
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = this.numberOfRooms;
    }
    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }
    public void setDateOfConstruction(LocalDate date){
        this.dateOfConstruction = date;
    }
    public void addOccpuants(int amount){
        this.numberOfOccupants+=amount;
    }
    public boolean isOverPopulated(){
        return this.numberOfOccupants>this.numberOfRooms;
    }
    public boolean isOverPopulated(int scaleFactor){
        return this.numberOfOccupants>(this.numberOfRooms*scaleFactor);
    }
    public abstract boolean isOld();

}
