package src.projet;

import exodiagramme.AlphaOption;
import exodiagramme.CLI;
import exodiagramme.CreuseOption;
import exodiagramme.IndiceOption;
import exodiagramme.PleineOption;
import exodiagramme.PrecisionOption;

public class PageRank extends CLI {
	public static void main(String[] args) {
		PageRank pagerank = new PageRank();
		IndiceOption indice = new IndiceOption(10);
		PrecisionOption precision = new PrecisionOption(10);
		AlphaOption alpha = new AlphaOption(10);
		CreuseOption creuse = new CreuseOption();
		PleineOption pleine = new PleineOption();
		
		pagerank.addOption(indice);
		pagerank.addOption(precision);
		pagerank.addOption(alpha);
		pagerank.addOption(creuse);
		pagerank.addOption(pleine);
		
		System.out.println(pagerank.analyseOption());
		
	}

}
