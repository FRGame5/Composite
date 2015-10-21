import java.util.ArrayList;


public class ExpressionPlus extends Expression{
	
	public ExpressionPlus() {
		super();
	}
	

	public int evaluate()
	{
		int result = 0;
		for (int i = 0; i < super.getEntier().size(); i++) {
			result += super.getEntier().get(i).evaluate();
		}
		return result;
	}
	

}
