package exodiagramme;

public class AlphaOption extends Option {

	public AlphaOption(double valeur) {
		super(Access.A, "Valeur de alpha", valeur);
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
