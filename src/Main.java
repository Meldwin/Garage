public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Voiture v1 = new Voiture("peugeot", "308", 2019);
        Moto m1 = new Moto("Suzuki", "je connais pas", 2006);
        VoitureElectrique ve1 = new VoitureElectrique("Tesla", "Cybertruck", 2024);
        garage.ajouterVehicule(v1);
        garage.ajouterVehicule(m1);
        garage.ajouterVehicule(ve1);
        garage.afficherVehicules();

    }
}