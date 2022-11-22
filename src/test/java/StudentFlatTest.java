import models.StudentFlat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentFlatTest {
   private StudentFlat studentFlat;
   @BeforeEach
    public void setStudentFlat(){
       studentFlat = new StudentFlat(15, LocalDate.of(2015,5,12),31,100);
   }
   @Test
    public void checkHostParty(){
       studentFlat.hostParty();
       studentFlat.hostParty();
       assertEquals(102,studentFlat.getNumberOfPartiesHosted());

   }
   @Test
    public void isOverPopulated__true(){
       assertTrue(studentFlat.isOverPopulated());

   }
   @Test
    public void tellHistoryTest(){
       assertThat(studentFlat.tellHistory()).isEqualTo("This good old building was built in 2015 and hosted exactly 100 parties");
   }
}
