import models.Office;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OfficeTest {
    private Office office;
    @BeforeEach
    public void setUp(){
        office = new Office(10, LocalDate.of(1998,10,11),15,"Harrods",12_000_002);
    }
    @Test
    public void isOld__true(){
        assertTrue(office.isOld());
    }
    @Test
    public void isOld__false(){
        office.setDateOfConstruction(LocalDate.of(2021,12,5));
        assertFalse(office.isOld());
    }

}
