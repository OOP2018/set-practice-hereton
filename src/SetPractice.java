import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * 
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Collection<String> set, String[] values) {
		System.out.println(set.getClass().toString());
		for (String value : values) {
			System.out.println(" Adding: " + value);
			set.add(value);
		}
		System.out.println();
	}

	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Collection<String> set) {
		Iterator<String> setIterator = set.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		System.out.println();
	}

	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer() {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		TreeSet<String> set = new TreeSet<>();
		String[] animals = { "dog", "cat", "bird", "elephant", "A", "B", "Z" };
		addAll(set, animals);

		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do
		// it.
		print(set);

		// 3. are the elements printed in same order than you added them?
		// What does this tell you about Sets?
		System.out.println("Sets ordered by Aa-Zz\n");
		System.out.println("TreeSets ordered by A-Za-z\n");

		// 4. Remove all the elements from the set, using a method that
		// defined in Set (and Collection). What is the method to use?
		System.out.println("Clear\n");
		set.clear();

		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		String[] animalsShuffle = { "cat", "elephant", "bird", "ant", "dog", "Tu" };
		addAll(set, animalsShuffle);
		// 6. Print the elements in the set. Is the order same as before?
		print(set);
		// 7. Add duplicate elements to the set. Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		set.add(new String("cat"));
		set.add(new String("dog"));
		System.out.println("Add duplicate items to the set ");

		// 8. Print the elements in set. Are there any duplicates?
		print(set);
		// What property of Set does this demonstrate?
		System.out.println("Set contains: Objects that's no duplicates object orderdin by alphabets");
		System.out.println("TreeSet contains: Objects that's no duplicates object orderdin by alphabets");

		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		// What is different when you use TreeSet?

		// Hint: Use Polymorphism. Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!

		// 10. Repeat again using TreeSet with a Comparator.
	}

	public static void main(String[] args) {
		setExplorer();

	}
}
