import java.util.ArrayList;


public class ExpressionMult {
	private ArrayList<Entier> multiplication;

	public ExpressionMult() {
		multiplication = new ArrayList<Entier>();
	}
	
	public void add(Entier e)
	{
		multiplication.add(e);
	}
	
	public int evaluate()
	{
		int result = multiplication.get(0).evaluate();
		if (multiplication.size() > 1) {
			for (int i = 1; i < multiplication.size(); i++) {
				result *= multiplication.get(i).evaluate();
			}
		}
		return result;
	}

}
