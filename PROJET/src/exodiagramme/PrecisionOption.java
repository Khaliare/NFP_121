package exodiagramme;

public class PrecisionOption extends Option {

	public PrecisionOption(double valeur) {
		super(Access.E, "Valeur de la pr�cision � atteindre", valeur);
	}

	@Override
	public String executer() {
		return "" + this.valeur;
	}

}
