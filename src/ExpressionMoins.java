import java.util.ArrayList;

public class ExpressionMoins {
	private ArrayList<Entier> soustraction;

	public ExpressionMoins() {
		soustraction = new ArrayList<Entier>();
	}

	public void add(Entier e) {
		soustraction.add(e);
	}

	public int evaluate() {
		int result = soustraction.get(0).evaluate();
		if (soustraction.size() > 1) {
			for (int i = 1; i < soustraction.size(); i++) {
				result -= soustraction.get(i).evaluate();
			}
		}
		return result;
	}

}