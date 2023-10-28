package com.domain;

public class Mappings {

    private int numberal;
    private String romanNumerals;

    public Mappings(int numberal, String romanNumerals) {
        this.numberal = numberal;
        this.romanNumerals = romanNumerals;
    }


    public int getNumberal() {
        return numberal;
    }

    public void setNumberal(int numberal) {
        this.numberal = numberal;
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
                "numberal=" + numberal +
                ", romanNumerals='" + romanNumerals + '\'' +
                '}';
    }
}
