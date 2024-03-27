package EXO1;

abstract class Habitation {
    protected String proprietaire;
    protected String adresse;
    protected double surface;

    
    public Habitation(String proprietaire, String adresse, double surface) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }
        public abstract double impot();
        
        public void afficher() {
            System.out.println("Propriétaire: " + proprietaire);
            System.out.println("Adresse: " + adresse);
            System.out.println("Surface: " + surface + " m²");
        }
        
        
        
        
    
}