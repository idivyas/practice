package org.divya.learning.datastructures;

/**
 * Represents a string of bits of provided length. 
 * Indexing starts at 0.
 * 
 * @author idivyas
 */
public class BitString {

	private final int numBits;
	private byte[] array;
	
	public BitString(int numBits) {
		this.numBits = numBits;
		int arrayLength = numBits / 8;
		if (numBits % 8 != 0) {
			arrayLength++;
		}
		this.array = new byte[arrayLength];
	}
	
	/**
	 * Sets the bit at given index to the given value.
	 * Returns old value.
	 */
	public boolean setBit(int index, boolean newValue) {
		if (index >= numBits) {
			throw new IndexOutOfBoundsException();
		}
		
		// Find the byte index into which this index falls.
		int byteNum = index / 8;
		
		// Find the bit that represents this index.
		int bitNum = index % 8;
		int reverseBitNum = 7 - bitNum;
		
		// Form an appropriate mask.
		int mask = 1 << reverseBitNum;
		
		// Find the value at the index.
		byte currentByte = array[byteNum];
		int maskedValue = currentByte & mask;
		boolean currentValue = maskedValue > 0;
		
		// Set the value at the index.
		if (newValue) {
			array[byteNum] = (byte) (currentByte | mask);
		} else {
			mask = ~mask;
			array[byteNum] = (byte) (currentByte & mask);
		}
		
		return currentValue;
	}

	/**
	 * Returns the value at the index.
	 */
	public boolean getBit(int index) {
		if (index >= numBits) {
			throw new IndexOutOfBoundsException();
		}
		
		// Find the byte into which this index falls.
		int byteNum = index / 8;
		
		// Find the bit that represents this index.
		int bitNum = index % 8;
		int reverseBitNum = 7 - bitNum;
		
		// Form an appropriate mask.
		int mask = 1 << reverseBitNum;
		
		// Find the value at the index.
		byte currentByte = array[byteNum];
		int maskedValue = currentByte & mask;
		return maskedValue > 0;
	}

	int getNumBits() {
		return numBits;
	}
}
