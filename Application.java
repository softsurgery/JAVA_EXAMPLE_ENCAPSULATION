public class Application {
    public static void main(String[] args) {
        Produit p = new Produit(12, "Smartphone", 8,15.2f);
        p.setRef("Abcdef");
        System.out.println(p);
    }
}