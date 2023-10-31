package com.data;

public class Numerals {

    /**
     * Find the numeral value for the Roman numeral.
     *
     * @param romanChar
     * @return numeral
     */
    public int getNumberValue(char romanChar)
    {
        if (romanChar == 'I') return 1;
        if (romanChar == 'V') return 5;
        if (romanChar == 'X') return 10;
        if (romanChar == 'L') return 50;
        if (romanChar == 'C') return 100;
        if (romanChar == 'D') return 500;
        if (romanChar == 'M') return 1000;
        return -1;
    }

}
