package com.mpp.lab9.prob9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Book {
	private List<BookCopy> copies = new ArrayList<BookCopy>();
	private String title;

	public Book(String title, int numCopies) {
		if (numCopies < 1)
			throw new IllegalArgumentException("NumCopies must be positive");
		this.title = title;
		for (int i = 0; i < numCopies; ++i) {
			addCopy();
		}
	}

	public List<BookCopy> getCopies() {
		return copies;
	}

	public void addCopy() {
		BookCopy copy = new BookCopy(this, copies.size() + 1, true);
		copies.add(copy);
	}

	public boolean isAvailable() {
		boolean is = copies.stream().filter(x -> x.isAvailable()).collect(Collectors.counting()) > 0;
		return is;
	}
}
