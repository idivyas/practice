package org.divya.learning.other;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link GivenNumberInExcelSheet}
 * 
 * @author idivyas
 */
public class GivenNumberInExcelSheetTest {
	
	@Test
	public void testcolumnName1()
	{
		GivenNumberInExcelSheet g=new GivenNumberInExcelSheet();
		assertEquals("ABB",g.columnName(730));
	}

	@Test
	public void testcolumnName2()
	{
		GivenNumberInExcelSheet g=new GivenNumberInExcelSheet();
		assertEquals("AZ",g.columnName(52));
	}

}
