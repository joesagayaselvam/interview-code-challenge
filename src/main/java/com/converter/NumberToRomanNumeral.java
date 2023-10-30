package com.converter;

import com.data.RomanNumerals;
import com.domain.Mappings;

import java.util.List;

import static com.constants.CommonConstants.*;

public class NumberToRomanNumeral {
    /**
     *
     * @param numeral
     * @return
     *
     * Upper limit is 3000 for this program
     * Equalant numberal values of Roman numbers are set in RomanNumerals
     *
     * Negative numbers or zero are not permitted in roman numerals
     *
     * Converts the numeral value to roman numerals between 1 and 3000
     * Checks the given number is falling in the range
     * Iterates the dataset to find the highest roman numeral for available numeral in the dataset
     * Subtracts the values from the given numeral.
     * Again checks the next maximum roman value for the remaining numeral then find the roman numeral
     * Subtracts the values from the given numeral.
     * The steps are repeated until the numeral is lesser than the least roman value in the dataset
     *
     */
    public static String conversion(int numeral)
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        List<Mappings> mappingsList = romanNumerals.getValues();
        StringBuilder roman = new StringBuilder();
        String printNum = String.valueOf(numeral);

        if(validate(numeral).equalsIgnoreCase(WITHIN_LIMIT) ) {
            for (Mappings map : mappingsList) {
                while ( map.getNumeral() <= numeral) {
                    numeral = numeral - map.getNumeral();
                    roman.append( map.getRomanNumerals());
                }
            }
            showResult(printNum, roman, WITHIN_LIMIT);
        }else{
            roman.append(validate(numeral));
            showResultInvalid(printNum, validate(numeral));
        }

        return roman.toString();
    }

    private static String validate(int numeral){
        String result = "";
        if(numeral > 0 && numeral <= UPPER_LIMIT) {
            result = WITHIN_LIMIT;
        } else if(numeral > UPPER_LIMIT){
            result = GREATER_THAN_UPPER_LIMIT;
        } else if (numeral <= 0){
            result = ZERO_OR_NEGATIVE;
        }

        return result;
    }

    public static void showResult(String printNum, StringBuilder roman, String message){
        System.out.println(INPUT_STRING_INT + printNum + OUTPUT_STRING_INT + roman.toString() + " --> " + message);
    }

    public static void showResultInvalid(String printNum,  String message){
        System.out.println(INPUT_STRING_INT + printNum + OUTPUT_STRING_INT + " NULL  --> " + message);
    }

}
