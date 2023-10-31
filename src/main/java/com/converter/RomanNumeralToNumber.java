package com.converter;

import com.data.Numerals;

import static com.constants.CommonConstants.*;

public class RomanNumeralToNumber {

    /**
     * Find the decimal value of the given Roman numeral
     * @param romanNumerals
     * @return convertedNumber
     *
     * Validate the roman numbers of the input.
     * Return -1, if char of the roman numeral is invalid.
     * Prints the message.
     * Find the integer value for the roman, if char of the roman numeral.
     * Finding value of Roman numeral romanNumerals[inc]
     * Finding value of Roman numeral romanNumerals[inc]+1]
     * Current Roman numeral Value and next Roman numeral value comparison
     * In case of Value of current Roman numeral is greater or equal to the next Roman numeral - Eg: 1xs / 5xs
     * Add the current Roman numeral value
     * In case of Value of current Roman numeral is less than the next Roman numeral - Eg: 1xs value is prefix to 4xs / 9xs
     * Subtract the current Roman numeral value from the number value
     * Prints the message.
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

            // Finding value of Roman numeral romanNumerals[inc]
            int currentSymbolValue = numerals.getNumberValue(romanNumerals.charAt(inc));

            // Finding value of Roman numeral romanNumerals[inc + 1]
            if (inc + 1 < romanNumerals.length()) {
                int nextSymbolValue = numerals.getNumberValue(romanNumerals.charAt(inc + 1));

                // Current Roman numeral Value and next Roman numeral value comparison
                if (currentSymbolValue >= nextSymbolValue) {
                    // Value of current Roman numeral is greater or equal to the next Roman numeral - Eg: 1xs / 5xs
                    numberValue = numberValue + currentSymbolValue;
                }
                else {
                    // Value of current Roman numeral is less than the next Roman numeral - Eg: 1xs value is prefix to 4xs / 9xs
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

    /**
     * Validation of the roman numeral
     * @param romanNumeral
     * @return
     */
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