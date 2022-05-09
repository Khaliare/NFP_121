package exodiagramme;

public class PrecisionOption extends Option {

	public PrecisionOption(double valeur) {
		super(Access.E, "Valeur de la précision à atteindre", valeur);
	}

	@Override
	public void executer(String arg) {
		try {
			this.valeur = Integer.parseInt(arg);
		}catch(NumberFormatException e) {
			System.out.println("Il y a un soucis avec le format de l'argument");
		}
	}

}
