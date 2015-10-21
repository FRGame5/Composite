import java.util.ArrayList;


public class ExpressionMult extends Expression{

	public ExpressionMult() {
		super();
	}
	

	public int evaluate()
	{
		int result = super.getEntier().get(0).evaluate();
		if (super.getEntier().size() > 1) {
			for (int i = 1; i < super.getEntier().size(); i++) {
				result *= super.getEntier().get(i).evaluate();
			}
		}
		return result;
	}

}
