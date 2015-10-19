import java.util.ArrayList;


public class ExpressionPlus {
	private ArrayList<Entier> addition;

	public ExpressionPlus() {
		addition = new ArrayList<Entier>();
	}
	
	public void add(Entier e)
	{
		addition.add(e);
	}
	
	public int evaluate()
	{
		int result = 0;
		for (int i = 0; i < addition.size(); i++) {
			result += addition.get(i).evaluate();
		}
		return result;
	}
	

}
