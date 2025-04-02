import java.util.ArrayList;
import java.util.List;


public class Garage {
        private List<Vehicule> vehicules;

        public Garage() {
            vehicules = new ArrayList<>();
        }
        public void ajouterVehicule(Vehicule v) {
            vehicules.add(v);
        }
        public void afficherVehicules() {
            for (Vehicule v : vehicules) {
                System.out.println(v.toString());
                if (v instanceof Electrique) {
                    ((Electrique) v).recharge();
                }
            }
        }
    }
