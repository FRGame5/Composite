import static org.junit.Assert.*;

import org.junit.Test;


public class ExpressionDivTest {

	@Test
	public void test() {
		ExpressionDiv e1 = new ExpressionDiv();
		ExpressionDiv e2 = new ExpressionDiv();
		ExpressionDiv e3 = new ExpressionDiv();
		
		e1.add(new Entier(1));
		e2.add(new Entier(15));
		e2.add(new Entier(5));
		e3.add(new Entier(24));
		e3.add(new Entier(2));
		e3.add(new Entier(-3));
		
		assertEquals(1, e1.evaluate());
		assertEquals(3, e2.evaluate());
		assertEquals(-4, e3.evaluate());
	}

}
