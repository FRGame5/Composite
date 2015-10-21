import java.util.ArrayList;

public class Expression extends Component{
	
	private ArrayList<Component> expression;

	public Expression() {
		expression = new ArrayList<Component>();
	}
	
	public void add(Entier e)
	{
		expression.add(e);
	}
	
	public void add(Expression e)
	{
		expression.add(e);
	}
	
	public int evaluate()
	{
		int retour = 0;
		for (int i = 0; i < expression.size(); i++) {
			retour += expression.get(i).evaluate();
		}
		return retour;
	}

	public ArrayList<Component> getEntier() {
		return expression;
	}

}
