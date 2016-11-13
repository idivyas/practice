package org.divya.learning.datastructures.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit-tests for {@link UniqueCharacters}
 * 
 * @author idivyas
 */
public class UniqueCharactersTest {
	@Test
	public void testHasDuplicates() {
		UniqueCharacters unique=new UniqueCharacters();
		assertTrue(unique.hasDuplicates("java"));
		assertFalse(unique.hasDuplicates("divya"));
		assertTrue(unique.hasDuplicates("summer"));
	}


}
