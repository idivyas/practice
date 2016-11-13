package org.divya.learning.datastructures.demo;
import org.divya.learning.datastructures.BitString;

/**
 * This program takes a string and tells whether all the characters are unique or not.
 * 
 * @author idivyas
 */
public class UniqueCharacters {
	
	public boolean hasDuplicates(String input) {
		BitString bs = new BitString(26);
		for (int i = 0; i < input.length(); ++i) {
			char ch = input.charAt(i);
			int bitNum = (ch - 'a');
			if (bs.getBit(bitNum)) {
				return true;
			}
			bs.setBit(bitNum, true);
		}
		return false;
	}
}
