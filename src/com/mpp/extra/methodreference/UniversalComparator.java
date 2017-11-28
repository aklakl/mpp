package com.mpp.extra.methodreference;

import java.util.Comparator;

/**
 *
 * @author Santosh
 */
public class UniversalComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Integer) {
			int int1 = (Integer) o1;
			int int2 = (Integer) o2;

			return int1 - int2;

		}
		if ((o1 instanceof String)) {
			String str1 = (String) o1;
			String str2 = (String) o2;
			return str1.compareTo(str2);

		}
		// if (o1 instanceof Double) {
		// double db1 = (Double) o1;
		// double db2 = (Double) o2;
		// return db1 - db2;

		// }
		return -1;
	}

}
