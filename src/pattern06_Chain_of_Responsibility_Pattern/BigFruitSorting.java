package pattern06_Chain_of_Responsibility_Pattern;

public class BigFruitSorting extends AbstractFruitSort {

	public BigFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	void pushBox(String fruit) {
		fruitBox.add("³¬ÊÐ: " + fruit);
	}

}
