package EXO1;

class HabitationIndividuelle extends Habitation {
    private int nbPieces;
    private boolean piscine;
    
    
    public HabitationIndividuelle(String proprietaire, String adresse, double surface, int nbPieces, boolean piscine) {
        super(proprietaire, adresse, surface);
        this.nbPieces = nbPieces;
        this.piscine = piscine;
    }
    @Override
    public double impot() {
        double impot = nbPieces * 1000;
        if (piscine) {
            impot += 5000;
        }
        return impot;
    }
    
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Nombre de pièces: " + nbPieces);
        System.out.println("Piscine: " + (piscine ? "Oui" : "Non"));
    }
    
    
}

