import java.util.ArrayList;


public class ExpressionDiv {
	private ArrayList<Entier> division;

	public ExpressionDiv() {
		division = new ArrayList<Entier>();
	}
	
	public void add(Entier e)
	{
		division.add(e);
	}
	
	public int evaluate()
	{
		int result = division.get(0).evaluate();
		if (division.size() > 1) {
			for (int i = 1; i < division.size(); i++) {
				result /= division.get(i).evaluate();
			}
		}
		return result;
	}
}
