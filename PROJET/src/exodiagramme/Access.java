package exodiagramme;
public enum Access {
	
	A("Alpha","-A"),
	K("Indice","-K"), 
	E("Precision","-E"), 
	P("matrice pleine","-P"),
	C("matrice creuse","-C");
	
	public final String label;
	
	public final String args;
	
	private Access(String label, String args) {
		this.label = label;
		this.args = args;
	}
	
	@Override 
	public String toString() { 
	    return this.label; 
	}

}
