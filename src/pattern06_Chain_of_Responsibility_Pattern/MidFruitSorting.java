package pattern06_Chain_of_Responsibility_Pattern;

public class MidFruitSorting extends AbstractFruitSort {

	public MidFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	void pushBox(String fruit) {
		fruitBox.add("Ë®¹û¹ÞÍ·: " + fruit);
	}

}
