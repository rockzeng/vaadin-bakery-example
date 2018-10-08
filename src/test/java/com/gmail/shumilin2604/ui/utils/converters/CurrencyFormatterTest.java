/**
 *
 */
package com.gmail.shumilin2604.ui.utils.converters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gmail.shumilin2604.test.FormattingTest;

public class CurrencyFormatterTest extends FormattingTest {

	@Test
	public void formattingShoudBeLocaleIndependent() {
		CurrencyFormatter formatter = new CurrencyFormatter();
		String result = formatter.encode(123456);
		assertEquals("$1,234.56", result);
	}
}
