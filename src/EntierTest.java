import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EntierTest {

	

	@Test
	public void testEntier() {
		Entier e1 = new Entier(7);
		Entier e2 = new Entier(0);
		Entier e3 = new Entier(-7);
		
		assertEquals(7, e1.evaluate());
		assertEquals(0, e2.evaluate());
		assertEquals(-7, e3.evaluate());
		
	}

}
