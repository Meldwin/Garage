public class VoitureElectrique extends Voiture implements Electrique {
public VoitureElectrique(String marque, String modele, int annee) {
    super(marque, modele, annee);
}
@Override
    public void recharge(){
    System.out.println(getMarque()+ " " + getModele() + " " + "en charge");
}
}