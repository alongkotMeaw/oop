package lap_7_3;

import java.util.Iterator;

public class NameRepository implements Containers {
	String[] names = { "John", "May", "Ryan" };

	public Iterator getIterator() {
		return new Iterator() {
		int index = 0;

		public boolean hasNext() {
			if (index < names.length)
				return true;
			return false;
		}

		public Object next() {
			return names[index++];
			//return null;
		}

		public void remove() {

		}
	};


	}
}
