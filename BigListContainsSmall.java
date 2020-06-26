package com.java.JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static boolean containsOrNot(List<String> l1, List<String> l2) {
		List<String> bigList = (l1.size() > l2.size()) ? l1 : l2;
		List<String> smallList = (l1.size() <= l2.size()) ? l1 : l2;
		if (!bigList.containsAll(smallList)) {
			return false;
		} else {
			int start = 0;
			for (int i = 0; i < bigList.size(); i++) {
				if (bigList.get(i).equalsIgnoreCase(smallList.get(start))) {
					start++;
				} else {
					if (start > 0) {
						return false;
					}
				}
				if (start == smallList.size()) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();

		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		l1.add("six");
		l1.add("seven");
		l1.add("eight");
		l1.add("nine");
		l1.add("ten");

		ArrayList<String> l2 = new ArrayList<>();

		l2.add("five");
		l2.add("six");
		l2.add("seven");
		l2.add("eight");

		if (containsOrNot(l1, l2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
