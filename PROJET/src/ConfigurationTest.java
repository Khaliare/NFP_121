import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConfigurationTest {

	private Configuration c;

	@Before
	public void setUp() {
		 c = CLIClassique.configuration("-K 10 -A .90 -K 20 -P -K 30 -C".split(" "));
	}

	@After
	public void tearDown() {
		c = null;
	}

	@Test
   public void mainTest() {
        assertEquals(c.toString(), "alpha=0.9, epsilon=-1.0, indice=30, mode=CREUSE");
    }

}
