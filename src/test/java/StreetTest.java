import models.Office;
import models.Park;
import models.Street;
import models.StudentFlat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class StreetTest {
    private Street oxfordStreet;
    private Park coalDropsYard;
    private StudentFlat neroHouse3;
    private Office metaHeadquarters;
    @BeforeEach
    public void setOxfordStreet(){
        oxfordStreet = new Street();
        coalDropsYard = new Park(LocalDate.of(2012,12,15),1500);
        neroHouse3 = new StudentFlat(150,LocalDate.of(1999,10,11),150,5000);
        metaHeadquarters = new Office(1000,LocalDate.now(),5000,"Meta",12_000_000);
        oxfordStreet.addHistoricalSight(coalDropsYard);
        oxfordStreet.addBuilding(neroHouse3);
        oxfordStreet.addBuilding(metaHeadquarters);
        oxfordStreet.addHistoricalSight(neroHouse3);
    }
    @Test
    public void checkBuildings(){
        System.out.println(oxfordStreet.getBuildings());
    }
    @Test
    public void checkHistoricalSights(){
        System.out.println(oxfordStreet.getSights());
    }
    @Test
    public void tellHistory(){
        System.out.println(oxfordStreet.tellStory());
    }
}
