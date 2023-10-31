package com.data;

import com.domain.Mappings;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

    /**
     * Setting the values in mappingsList ArrayList
     * @return mappingsList
     */
    public List<Mappings> getValues(){

        ArrayList<Mappings> mappingsList = new ArrayList<Mappings>();
        mappingsList.add( new Mappings(4000, "¯IV") );
        mappingsList.add( new Mappings(1000, "M") );
        mappingsList.add( new Mappings(900, "CM") );
        mappingsList.add( new Mappings(500, "D") );
        mappingsList.add( new Mappings(400, "CD") );
        mappingsList.add( new Mappings(100, "C") );
        mappingsList.add( new Mappings(90, "XC") );
        mappingsList.add( new Mappings(50, "L") );
        mappingsList.add( new Mappings(40, "XL") );
        mappingsList.add( new Mappings(10, "X") );
        mappingsList.add( new Mappings(9, "IX") );
        mappingsList.add( new Mappings(5, "V") );
        mappingsList.add( new Mappings(4, "IV") );
        mappingsList.add( new Mappings(1, "I") );

        return mappingsList;
    }

}
