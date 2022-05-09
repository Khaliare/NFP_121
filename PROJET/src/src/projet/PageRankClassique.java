package src.projet;

public class PageRankClassique {

	public static void main(String... args) {
		Configuration configuration = CLIClassique.configuration("-K 10 -A .90 -K 20 -P -K 30 -C".split(" "));
		System.out.println(configuration);
		// Le reste du programme... Omis.
	}
}
