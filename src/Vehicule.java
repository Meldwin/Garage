public class Vehicule {
    String marque;
    String modele;
    int annee;
    public Vehicule (String marque, String modele,int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }
    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }
    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        return marque + " " + modele + "(" + annee +")";
    }
}