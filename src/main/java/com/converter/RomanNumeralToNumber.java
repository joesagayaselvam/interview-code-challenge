package com.converter;

import com.data.Numerals;

public class RomanNumeralToNumber {

    /**
     * Find the decimal value of the given Roman numeral
     * @param romanNumerals
     * @return convertedNumber
     *
     * Finding value of symbol romanNumerals[i]
     * Finding value of symbol romanNumerals[i]+1]
     * Current symbol Value and next Symbol value comparison
     * In case of Value of current symbol is greater or equal to the next symbol
     * Add the current symbol value
     * In case of Value of current symbol is less than the next symbol
     * Subtract the current symbol value from the number value
     *
     */
    public int conversion(String romanNumerals)
    {
        int numberValue = 0;
        Numerals  numerals = new Numerals();

        for (int i = 0; i < romanNumerals.length(); i++) {
            // Finding value of symbol romanNumerals[i]
            int currentSymbolValue = numerals.getNumberValue(romanNumerals.charAt(i));

            // Finding value of symbol romanNumerals[i+1]
            if (i + 1 < romanNumerals.length()) {
                int nextSymbolValue = numerals.getNumberValue(romanNumerals.charAt(i + 1));

                // Current symbol Value and next Symbol value comparison
                if (currentSymbolValue >= nextSymbolValue) {
                    // Value of current symbol is greater or equal to the next symbol
                    numberValue = numberValue + currentSymbolValue;
                }
                else {
                    // Value of current symbol is less than the next symbol
                    numberValue = numberValue + nextSymbolValue - currentSymbolValue;
                    i++;
                }
            }
            else {
                numberValue = numberValue + currentSymbolValue;
            }
        }

        if(numberValue > 3000 )
            numberValue = 0;
        else
            showResult(numberValue, romanNumerals);

        return numberValue;
    }

    public static void showResult(int printNum, String roman){
        System.out.println("Input - Roman numeral = " + roman + ".  Output - Integer  = " + printNum );
    }

}