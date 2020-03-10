package ua.lviv.lgs.hw17;

public class Collection {
	private static Number[] array;

	public Collection(Number[] array1) {
		array = array1;
	}

	public class Forward implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < array.length;
		}

		@Override
		public Object next() {
			return array[count++];
		}
	}

	public Forward createForward() {
		return new Forward();
	}

	public class Backward implements Iterator {

		private int count = array.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public Object next() {
			int temp = count;
			count -= 2;
			return array[temp];
		}
	}

	public Backward createBackward() {
		return new Backward();
	}

}
