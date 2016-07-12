package org.muzir.book.solution.HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Exercise5 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> pets = new ArrayList<Integer>(7);
		for(int i=0;i<7;i++){
			pets.add(new Integer(i));
		}
		System.out.println("1: " + pets);
		Integer h = new Integer(1);
		pets.add(h); // Automatically resizes
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains(h));
		pets.remove(h); // Remove by object
		Integer p = pets.get(2);
		System.out.println("4: " + p + " " + pets.indexOf(p));
		Integer cymric = new Integer(2);
		System.out.println("5: " + pets.indexOf(cymric));
		System.out.println("6: " + pets.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + pets.remove(p));
		System.out.println("8: " + pets);
		pets.add(3, new Integer(3)); // Insert at an index
		System.out.println("9: " + pets);
		List<Integer> sub = pets.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + pets.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + pets.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + pets.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(pets);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(pets); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, new Integer(4)); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + pets.isEmpty());
		pets.clear(); // Remove all elements
		System.out.println("19: " + pets);
		System.out.println("20: " + pets.isEmpty());
		pets.addAll(new ArrayList<Integer>(4));
		for(int i=0;i<4;i++){
			pets.add(new Integer(i));
		}
		System.out.println("21: " + pets);
		Object[] o = pets.toArray();
		System.out.println("22: " + o[3]);
		Integer[] pa = pets.toArray(new Integer[0]);
		System.out.println("23: " + pa[3]);
	}
}