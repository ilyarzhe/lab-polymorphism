package models;

import interfaces.IHistoricalSights;

import java.time.LocalDate;

public class Park implements IHistoricalSights {
    private LocalDate foundedIn;
    private int lastYearVisitorCount;
    public Park(LocalDate foundedIn,int lastYearVisitorCount){
        this.foundedIn = foundedIn;
        this.lastYearVisitorCount = lastYearVisitorCount;
    }
    private LocalDate getFoundedIn(){
        return this.foundedIn;
    }
    private int getLastYearVisitorCount(){
        return this.lastYearVisitorCount;
    }
    public String tellHistory(){
        return String.format("This Park was founded in %s and last year it was visited by %s", this.foundedIn,this.lastYearVisitorCount);
    }
}
