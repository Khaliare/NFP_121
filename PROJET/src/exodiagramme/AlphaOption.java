package exodiagramme;

public class AlphaOption extends Option {

	public AlphaOption(double valeur) {
		super(Access.A, "Valeur de alpha", valeur);
	}

	@Override
	public String executer() {
		return "" + this.valeur;
	}

}
