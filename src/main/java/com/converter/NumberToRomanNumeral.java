package com.converter;

import com.data.RomanNumerals;
import com.domain.Mappings;

import java.util.List;
import static com.constants.CommonConstants.UPPER_LIMIT;
import static com.constants.CommonConstants.GREATER_THAN_THE_UPPER_LIMIT;
import static com.constants.CommonConstants.ZERO_OR_NEGATIVE;

public class NumberToRomanNumeral {
    /**
     *
     * @param num
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
    public static String conversion(int num)
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        List<Mappings> mappingsList = romanNumerals.getValues();
        StringBuilder roman = new StringBuilder();
        int printNum = num;

        if(num > 0 && num <= UPPER_LIMIT) {
            for (int i = 0; i < mappingsList.size(); i++) {
                while ( mappingsList.get(i).getNumberal() <= num) {
                    num = num - mappingsList.get(i).getNumberal();
                    roman.append( mappingsList.get(i).getRomanNumerals());
                }
            }
            showResult(printNum, roman.toString());
        } else if(num > UPPER_LIMIT){
            roman.append(GREATER_THAN_THE_UPPER_LIMIT);
        } else if (num <= 0){
            roman.append(ZERO_OR_NEGATIVE);
        }

        return roman.toString();
    }

    public static void showResult(int printNum, String roman){
        System.out.println("'"+roman + "' is the Roman numeral for integer numeral : " + printNum );
    }

}
