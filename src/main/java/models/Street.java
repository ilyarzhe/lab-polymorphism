package models;

import interfaces.IHistoricalSights;

import java.util.ArrayList;

public class Street {
    private ArrayList<Building> buildings;
    private ArrayList<IHistoricalSights> sights;
    public Street(){
        this.buildings = new ArrayList<>();
        this.sights = new ArrayList<>();
    }
    public ArrayList<Building> getBuildings(){
        return this.buildings;
    }
    public void addBuilding(Building building){
        this.buildings.add(building);
    }
    public ArrayList<IHistoricalSights> getSights(){
        return this.sights;
    }
    public void addHistoricalSight(IHistoricalSights sight){
        this.sights.add(sight);
    }
    public ArrayList<String> tellStory(){
        ArrayList<String> stories = new ArrayList<>();
        for (IHistoricalSights sight:
             this.sights) {
            stories.add(sight.tellHistory());
        }
        return stories;
    }
}
