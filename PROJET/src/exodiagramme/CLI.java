package exodiagramme;
import java.util.ArrayList;
import java.util.List;

public class CLI {
	List<Option> options;
	
	public CLI(){
		this.options = new ArrayList<>();
	}
	
	public void addOption(Option option) {
		this.options.add(option);
	}
	
	public List<Option> analyseOption() {
		return this.options;
	}
	
	public static void main(String[] args) {
		CLI cli = new CLI();
		IndiceOption i = new IndiceOption(10);
		PrecisionOption pre = new PrecisionOption(10);
		AlphaOption a = new AlphaOption(10);
		CreuseOption c = new CreuseOption();
		PleineOption p = new PleineOption();
		cli.addOption(i);
		cli.addOption(pre);
		cli.addOption(a);
		cli.addOption(c);
		cli.addOption(p);
		System.out.println(cli.analyseOption());
	}

}
