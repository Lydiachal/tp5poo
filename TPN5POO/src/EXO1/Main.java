package EXO1;

public class Main {

	public static void main(String[] args) {
		
	Habitation h1 = new HabitationIndividuelle("Jon snow", "123 Rue de la Paix", 150.5, 5, true);
	Habitation h2 = new HabitationProfessionnelle("ragnar", "456 Avenue des Champs", 300.75, 35);
	
	double impotH1 = h1.impot();
    double impotH2 = h2.impot();
    
    System.out.println("Habitation individuelle:");
    h1.afficher();
    System.out.println("Impôt à payer: " + impotH1 + " DA");

    System.out.println("\nHabitation professionnelle:");
    h2.afficher();
    System.out.println("Impôt à payer: " + impotH2 + " DA");

	}

}
