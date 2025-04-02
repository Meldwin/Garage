package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculeTest {
    @Test
    public void testVehiculeCreation(){
        Vehicule v = new Vehicule("renault","Clio", 2017);

        /* verification des données retournées */
        Assertions.assertEquals("Renault", v.getMarque());
        Assertions.assertEquals("Clio", v.getModele());
        Assertions.assertEquals(2015, v.getAnnee());
    }
    @Test
    public void testToString() {
        Vehicule v = new Vehicule("Tesla", "Model 3", 2022);

        // check si l'affichage correspond à "Tesla Model 3 (2022)"
        Assertions.assertEquals("Tesla Model 3 (2022)", v.toString());
    }
}
