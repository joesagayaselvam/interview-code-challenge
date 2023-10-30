package com.domain;

public class Mappings {

    private int numeral;
    private String romanNumerals;

    public Mappings(int numberal, String romanNumerals) {
        this.numeral = numberal;
        this.romanNumerals = romanNumerals;
    }
    public int getNumeral() {
        return numeral;
    }

    public void setNumeral(int numeral) {
        this.numeral = numeral;
    }

    public String getRomanNumerals() {
        return romanNumerals;
    }

    public void setRomanNumerals(String romanNumerals) {
        this.romanNumerals = romanNumerals;
    }

    @Override
    public String toString() {
        return "Mappings{" +
                "numberal=" + numeral +
                ", romanNumerals='" + romanNumerals + '\'' +
                '}';
    }
}
