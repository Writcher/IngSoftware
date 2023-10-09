import static org.junit.Assert.*;
import org.junit.Test;

public class JavaTestIntegracion {
    @Test
    public void testIntegracionAPIConvetidor(){
        try{
            ConvertirUSD convertidor = new ConvertirUSD();
            double cantPesos = 1000;
            double cantUSD = convertidor.convertirARSaUSD(cantPesos);
            assertTrue(cantUSD > 0);
            
        }catch (Exception e){ 
            e.printStackTrace();
        }
    }
}
