import java.util.ArrayList;

public class Street {
    private ArrayList<Building> buildings;
    public Street(){
        this.buildings = new ArrayList<>();
    }
    public ArrayList<Building> getBuildings(){
        return this.buildings;
    }
    public void addBuilding(Building building){
        this.buildings.add(building);
    }
}
