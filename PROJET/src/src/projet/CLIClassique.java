package src.projet;

public class CLIClassique {

	public static Configuration configuration(String... args) {
		
			Configuration config = new Configuration();
			boolean finOptions = false;
			int i = 0;
			while (i < args.length && ! finOptions) {
				String arg = args[i];
				try {
					switch (arg) {
						case "-K": // Valeur de l'indice a calculer
							config.indice = Integer.parseInt(args[++i]);
							break;
						case "-E": // Valeur de la precision a atteindre
							config.epsilon = Double.parseDouble(args[++i]);
							break;
						case "-A": // Valeur de alpha
							config.alpha = Double.parseDouble(args[++i]);
							break;
						case "-C": // Mode matrice creuse
							config.mode = Mode.CREUSE;
							break;
						case "-P": // Mode matrice pleine
							config.mode = Mode.PLEINE;
							break;
						default:
							finOptions = arg.length() == 0 || arg.charAt(0) != '-';
							if (! finOptions) {
								System.out.println("Option inconnue : " + arg);
							}
					}
				}catch(NumberFormatException error) {
					switch (arg) {
						case "-K": // Valeur de l'indice a calculer
							System.out.println("l'indice est incorrect "+ arg +"");
							break;
						case "-E": // Valeur de la precision a atteindre
							System.out.println("la precision a atteindre est incorrect "+ arg +"");
							break;
						case "-A": // Valeur de alpha
							System.out.println("l'alpha est incorrect "+ arg +"");
							break;
						case "-C": // Mode matrice creuse
							System.out.println("Mode matrice creuse est incorrect "+ arg +"");
							break;
						case "-P": // Mode matrice pleine
							System.out.println("Mode matrice pleine est incorrect "+ arg +"");
							break;
						default:
							System.out.println("une option inconnue est incorrect " + arg +"");
							break;
					}
				}
				i++;
			}
		return config;
	}

}

