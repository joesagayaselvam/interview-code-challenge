package com.converter;

import com.data.Numerals;

import static com.constants.CommonConstants.*;

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
        Numerals numerals = new Numerals();
        boolean result;

        for (int inc = 0; inc < romanNumerals.length(); inc++) {
            // validating each Roman numeral.
            if (isValidate(romanNumerals.charAt(inc)) == false ){
                numberValue = 0;
                showResult(numberValue, romanNumerals, INVALID_ROMAN_NUMERAL);
                return -1;
            }

            // Finding value of symbol romanNumerals[inc]
            int currentSymbolValue = numerals.getNumberValue(romanNumerals.charAt(inc));

            // Finding value of symbol romanNumerals[inc + 1]
            if (inc + 1 < romanNumerals.length()) {
                int nextSymbolValue = numerals.getNumberValue(romanNumerals.charAt(inc + 1));

                // Current symbol Value and next Symbol value comparison
                if (currentSymbolValue >= nextSymbolValue) {
                    // Value of current symbol is greater or equal to the next symbol
                    numberValue = numberValue + currentSymbolValue;
                }
                else {
                    // Value of current symbol is less than the next symbol
                    numberValue = numberValue + nextSymbolValue - currentSymbolValue;
                    inc++;
                }
            }
            else {
                numberValue = numberValue + currentSymbolValue;
            }
        }

        if(numberValue > UPPER_LIMIT ) {
            numberValue = 0;
            showResult(numberValue, romanNumerals, GREATER_THAN_UPPER_LIMIT);
        }
        else
            showResult(numberValue, romanNumerals, WITHIN_LIMIT);

        return numberValue;
    }

    private boolean isValidate(char romanNumeral){
        boolean result = false;
        Numerals numerals = new Numerals();
        int currentSymbolValue = numerals.getNumberValue(romanNumeral);

        if (currentSymbolValue != -1){
            result = true;
        }

        return result;
    }

    public static void showResult(int printNum, String roman, String message){
        System.out.println(INPUT_STRING_ROMAN + roman  + OUTPUT_STRING_ROMAN + printNum + " --> " +message);
    }

}