package iterator;

import iterator.Collection.Second;

public class Main {

	public static void main(String[] args) {
		Object[] array = new Object[5];
		Collection collection = new Collection(array);
//		First first = collection.new First();
		Second second = collection.new Second();
	}

}
