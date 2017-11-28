package com.mpp.lab10.prob1;

import java.util.ArrayList;
import java.util.List;

public class TDDPractice {

	public List<String> changeLastCharToUpper(List<String> words) {

		List<String> changedList = new ArrayList<String>();
		for (String string : words) {
			String lastCharacter = String.valueOf(string.charAt(string.length() - 1)).toUpperCase();
			String modifiedWord = string.substring(0, string.length() - 1) + lastCharacter;
			changedList.add(modifiedWord);
		}

		return changedList;

	}

}
