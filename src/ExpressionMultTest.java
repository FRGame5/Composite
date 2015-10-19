import static org.junit.Assert.*;

import org.junit.Test;


public class ExpressionMultTest {

	@Test
	public void test() {
		ExpressionMult e1 = new ExpressionMult();
		ExpressionMult e2 = new ExpressionMult();
		ExpressionMult e3 = new ExpressionMult();
		
		e1.add(new Entier(1));
		e2.add(new Entier(5));
		e2.add(new Entier(7));
		e3.add(new Entier(1));
		e3.add(new Entier(2));
		e3.add(new Entier(-3));
		
		assertEquals(1, e1.evaluate());
		assertEquals(35, e2.evaluate());
		assertEquals(-6, e3.evaluate());
	}

}
