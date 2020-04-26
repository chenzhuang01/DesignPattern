package pattern06_Chain_of_Responsibility_Pattern;

public class SmallFruitSorting extends AbstractFruitSort {

	public SmallFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	void pushBox(String fruit) {
		fruitBox.add("´ò¹ûÖ­: " + fruit);
	}

}
