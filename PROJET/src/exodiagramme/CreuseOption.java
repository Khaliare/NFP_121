package exodiagramme;

public class CreuseOption extends Option {

	public CreuseOption() {
		super(Access.C, "Mode matrice creuse");
	}

	@Override
	public String executer() {
		return "" + Mode.CREUSE;
	}
	
	@Override
	public String toString() {
		return this.access.args + "  " + Mode.CREUSE;
	}

}
