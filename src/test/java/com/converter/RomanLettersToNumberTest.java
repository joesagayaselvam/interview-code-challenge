package com.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanLettersToNumberTest {

    /**
     * Testing the numeral value for the roman numerals
     * Used few randomly picked roman numbers for unit testing within the limit
     *
     */
    @Test
    public void testNumerals_BetweenOneAndThreeThousand() {

        int conversionNumber = 0;
        RomanNumeralToNumber romanNumeralToNumber = new RomanNumeralToNumber();
        conversionNumber = romanNumeralToNumber.conversion("MMM");
        assertEquals(3000, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("MMCMXCIX");
        assertEquals(2999, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("MCXI");
        assertEquals(1111, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("MX");
        assertEquals(1010, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("CCC");
        assertEquals(300, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("C");
        assertEquals(100, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("LC");
        assertEquals(50, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("X");
        assertEquals(10, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("I");
        assertEquals(1, conversionNumber);


    }

    /**
     * Testing the numeral value of roman numerals
     * Used few randomly picked roman numbers those are beyond the limits
     *
     */
    @Test
    public void testNumerals_GreaterThanThreeThousand() {

        int conversionNumber = 0;
        RomanNumeralToNumber romanNumeralToNumber = new RomanNumeralToNumber();

        conversionNumber = romanNumeralToNumber.conversion("MMMI");
        assertEquals(0, conversionNumber);

        conversionNumber = romanNumeralToNumber.conversion("MMMXVI");
        assertEquals(0, conversionNumber);

    }

}
