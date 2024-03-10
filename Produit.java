public class Produit {
    int id;
    String ref;
    int qte;

    //exigence de ce constructeur car on a definit un nouveau constructeur
    //on a besoin de ce constructeur si on veut ecrire (new Produit())
    Produit() {
    }

    Produit(int id){
        this.id = id;
    }

    Produit(int id, String ref, int qte) {
        this.id = id;
        this.ref = ref;
        this.qte = qte;
    }
}
