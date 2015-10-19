import static org.junit.Assert.*;

import org.junit.Test;


public class ExpressionMoinsTest {

	@Test
	public void test() {
		ExpressionMoins e1 = new ExpressionMoins();
		ExpressionMoins e2 = new ExpressionMoins();
		ExpressionMoins e3 = new ExpressionMoins();
		
		e1.add(new Entier(1));
		e2.add(new Entier(5));
		e2.add(new Entier(7));
		e3.add(new Entier(1));
		e3.add(new Entier(2));
		e3.add(new Entier(-3));
		
		assertEquals(1, e1.evaluate());
		assertEquals(-2, e2.evaluate());
		assertEquals(2, e3.evaluate());
	}

}
