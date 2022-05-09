package exodiagramme;
 public abstract class Option {
	
	protected Access access;
	
	private String description;
	
	protected double valeur;
	
	protected Option(Access access, String description,double valeur) {
		this.access = access;
		this.description = description;
		this.valeur = valeur;
	}
	
	protected Option(Access access, String description) {
		this.access = access;
		this.description = description;
	}

	public Access getAccess() {
		return this.access;
	}

	public void setAccess(Access access) {
		this.access = access;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValeur() {
		return this.valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	
	public abstract String executer();

	@Override
	public String toString() {
		return this.access.args + "  " + this.valeur;
	}

}
