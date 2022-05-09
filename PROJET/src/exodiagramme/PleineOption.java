package exodiagramme;

public class PleineOption extends Option {
	
	private Mode mode;
	
	public PleineOption() {
		super(Access.P, "Mode matrice pleine");
		mode = null;
	}

	@Override
	public void executer(String arg) {
		
		try{
			if(arg.equals("P"))
				mode = Mode.PLEINE;
		}catch(Exception e)
		{
			System.out.println("Il faut mettre P comme argument");
		}
		
	}
	
	@Override
	public String toString() {
		return this.access.args + "  " + Mode.PLEINE;
	}


}
