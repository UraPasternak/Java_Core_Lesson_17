package ua.lviv.lgs.hw17;

public class Main {
	public static void main(String[] args) {
		Integer[] array = { 5, 10, 146, 15, -156, 3, 325, -34, 42, 8 };

		Collection collection = new Collection(array);

		Iterator iteratorForward = collection.createForward();

		System.out.println("Завдання 1:");
		while (iteratorForward.hasNext()) {
			int temp = (int) iteratorForward.next();
			if (temp % 2 == 0) {
				System.out.println(temp);
			} else {
				System.out.println(0);
			}
		}

		System.out.println("======================");
		System.out.println("Завдання 2:");

		Iterator iteratorBackWard = collection.createBackward();

		while (iteratorBackWard.hasNext()) {
			System.out.println(iteratorBackWard.next());
		}

	}
}
