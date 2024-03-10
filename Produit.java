public class Produit {
    int id;
    private String ref;
    private float prixUnitaire;
    int qte;

    //exigence de ce constructeur car on a definit un nouveau constructeur
    //on a besoin de ce constructeur si on veut ecrire (new Produit())
    Produit() {
    }

    Produit(int id){
        this.id = id;
    }

    Produit(int id, String ref, int qte, float prixUnitaire) {
        this.id = id;
        this.ref = ref;
        this.qte = qte;
        this.prixUnitaire = prixUnitaire;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        if(ref.length() >= 5) this.ref = ref;
    }

    private float calculerStock(){
        return qte * prixUnitaire;
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", ref=" + ref + ", qte=" + qte + "] Prix de stock = " + calculerStock();
    }



    
}
