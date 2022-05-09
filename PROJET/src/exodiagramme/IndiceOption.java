package exodiagramme;

public class IndiceOption extends Option {

	public IndiceOption(double valeur) {
		super(Access.K, "Valeur de l'indice a calculer", valeur);
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
