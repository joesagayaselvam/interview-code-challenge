package com.converter;

import org.junit.jupiter.api.Test;

import static com.constants.CommonConstants.GREATER_THAN_THE_UPPER_LIMIT;
import static com.constants.CommonConstants.ZERO_OR_NEGATIVE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToRomanNumeralTest {

    /**
     * This test is to validate the numerals between 1 and 3000 only
     *
     */
    @Test
    public void testRomanNumerals_BetweenOneAndThreeThousand() {

        String converedRomanLetter = "";
        NumberToRomanNumeral numberToRomanNumeral = new NumberToRomanNumeral();

        converedRomanLetter = numberToRomanNumeral.conversion(3000);
        assertEquals("MMM", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(2345);
        assertEquals("MMCCCXLV", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(1987);
        assertEquals("MCMLXXXVII", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(1003);
        assertEquals("MIII", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(999);
        assertEquals("CMXCIX", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(807);
        assertEquals("DCCCVII", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(104);
        assertEquals("CIV", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(78);
        assertEquals("LXXVIII", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(41);
        assertEquals("XLI", converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(1);
        assertEquals("I", converedRomanLetter);


    }

    /**
     * This test is to validate the numerals greater than 3000
     *
     */
    @Test
    public void testRomanNumerals_MoreThanThreeThousand() {

        String converedRomanLetter = "";
        NumberToRomanNumeral numberToRomanNumeral = new NumberToRomanNumeral();

        converedRomanLetter = numberToRomanNumeral.conversion(3001);
        assertEquals(GREATER_THAN_THE_UPPER_LIMIT, converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(4000);
        assertEquals(GREATER_THAN_THE_UPPER_LIMIT, converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(5000);
        assertEquals(GREATER_THAN_THE_UPPER_LIMIT, converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(1354654649);
        assertEquals(GREATER_THAN_THE_UPPER_LIMIT, converedRomanLetter);
    }

    /**
     * This test is to validate the numerals Zero or negative numbers
     */
    @Test
    public void testRomanNumerals_NegativeNumbers() {

        String converedRomanLetter = "";
        NumberToRomanNumeral numberToRomanNumeral = new NumberToRomanNumeral();

        converedRomanLetter = numberToRomanNumeral.conversion(0);
        assertEquals(ZERO_OR_NEGATIVE, converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(-1);
        assertEquals(ZERO_OR_NEGATIVE, converedRomanLetter);

        converedRomanLetter = numberToRomanNumeral.conversion(-2999);
        assertEquals(ZERO_OR_NEGATIVE, converedRomanLetter);
    }

}
