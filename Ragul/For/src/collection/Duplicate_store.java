package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_store {

	public static void main(String[] args) {
		List<Character> l = Arrays.asList('R', 'a', 'g', 'u', 'l', 'R', 'a', 'm');
		Set<Character> duplicate = new HashSet<>();
		Set<Character> n = new HashSet<>();
		for (Character i : l) {
			if (n.contains(i)) {
				duplicate.add(i);
			} else {
				n.add(i);
			}
		}
		System.out.println("first element :\n" + l);
		System.out.println("non duplicate element:\n" + n);
		System.out.println("duplicate element:\n" + duplicate);

	}

}
