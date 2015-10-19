import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ExpressionPlusTest {
	
	
	@Test
	public void testExpressionPlus() {
		
		ExpressionPlus e1 = new ExpressionPlus();
		ExpressionPlus e2 = new ExpressionPlus();
		ExpressionPlus e3 = new ExpressionPlus();
		
		e1.add(new Entier(1));
		e2.add(new Entier(5));
		e2.add(new Entier(7));
		e3.add(new Entier(1));
		e3.add(new Entier(2));
		e3.add(new Entier(-3));
		
		assertEquals(1, e1.evaluate());
		assertEquals(12, e2.evaluate());
		assertEquals(0, e3.evaluate());
	}
	

}
