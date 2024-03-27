package EXO1;

class HabitationProfessionnelle extends Habitation {
    private int nbEmployes;
    
    public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int nbEmployes) {
        super(proprietaire, adresse, surface);
        this.nbEmployes = nbEmployes;
    }
    @Override
    public double impot() {
    return (Math.ceil(surface / 10) * 1000) + (nbEmployes / 10 * 1000);}
        
     @Override
     public void afficher() {
     super.afficher();
            System.out.println("Nombre d'employés: " + nbEmployes);
        }
    
        
    

}