
public class CLIClassique {

	public static Configuration configuration(String... args) {
		
			Configuration config = new Configuration();
			boolean finOptions = false;
			int i = 0;
			while (i < args.length && ! finOptions) {
				String arg = args[i];
				try {
					switch (arg) {
						case "-K": // Valeur de l'indice ÃƒÂ  calculer
							config.indice = Integer.parseInt(args[++i]);
							break;
						case "-E": // Valeur de la prÃƒÂ©cision ÃƒÂ  atteindre
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
						case "-K": // Valeur de l'indice ÃƒÂ  calculer
							System.out.println("l'indice est incorrect "+ error +"");
						case "-E": // Valeur de la prÃƒÂ©cision ÃƒÂ  atteindre
							System.out.println("la précision à atteindre est incorrect "+ error +"");
						case "-A": // Valeur de alpha
							System.out.println("l'alpha est incorrect "+ error +"");
						case "-C": // Mode matrice creuse
							System.out.println("Mode matrice creuse est incorrect "+ error +"");
						case "-P": // Mode matrice pleine
							System.out.println("Mode matrice pleine est incorrect "+ error +"");
					}
				}
				i++;
			}
		return config;
	}

}

