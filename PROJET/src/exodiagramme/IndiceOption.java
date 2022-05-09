package exodiagramme;

public class IndiceOption extends Option {

	public IndiceOption(double valeur) {
		super(Access.K, "Valeur de l'indice a calculer", valeur);
	}

	@Override
	public String executer() {
		return "" + this.valeur;
	}

}
