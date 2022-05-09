package exodiagramme;

public class CreuseOption extends Option {
	
	private Mode mode;

	public CreuseOption() {
		super(Access.C, "Mode matrice creuse");
		mode = null;
	}

	@Override
	public void executer(String arg) {
		
		try{
			if(arg.equals("C"))
				mode = Mode.PLEINE;
		}catch(Exception e)
		{
			System.out.println("Il faut mettre C comme argument");
		}
		
	}
	
	@Override
	public String toString() {
		return this.access.args + "  " + Mode.CREUSE;
	}

}
