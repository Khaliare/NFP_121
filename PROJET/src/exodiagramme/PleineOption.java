package exodiagramme;

public class PleineOption extends Option {
	
	public PleineOption() {
		super(Access.P, "Mode matrice pleine");
	}

	@Override
	public String executer() {
		
		return "" + Mode.PLEINE;
	}
	
	@Override
	public String toString() {
		return this.access.args + "  " + Mode.PLEINE;
	}


}
