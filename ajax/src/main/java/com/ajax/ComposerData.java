package com.ajax;

import java.util.HashMap;

public class ComposerData {
    
    private HashMap composers = new HashMap();

    public HashMap getComposers() {
        return composers;
    }

    public ComposerData() {

        composers.put("1", new Composer("1", "Mpho", "Sebata", "Normal"));
        composers.put("2", new Composer("2", "Masentle", "Khopolo", "Normal"));
        composers.put("3", new Composer("3", "Thabang", "Lebza", "Normal"));
        composers.put("4", new Composer("4", "Nteboheleng", "Makoanyane", "Normal"));
        composers.put("5", new Composer("5", "Teboho", "Ntahli", "Normal"));
        composers.put("6", new Composer("6", "Tau", "Hlalele", "Normal"));
        composers.put("7", new Composer("7", "Lebesa", "Lijong", "Normal"));

        composers.put("8", new Composer("8", "Majase", "Lipolelo", "Classical"));
        composers.put("9", new Composer("9", "Moletsane", "Sefeane", "Classical"));
        composers.put("10", new Composer("10", "Molemahang", "Katleho", "Classical"));
        composers.put("11", new Composer("11", "Thapelo", "Seutloali", "Classical"));
        composers.put("12", new Composer("12", "Seotlo", "Thabelo", "Classical"));
        composers.put("13", new Composer("13", "Malefu Soetsane", "Sebueng", "Classical"));
        composers.put("14", new Composer("14", "Hlephe", "Khahliso", "Classical"));
        composers.put("15", new Composer("15", "Notsi", "Khasu", "Classical"));
        composers.put("16", new Composer("16", "Ntebo", "Sehlabo", "Classical"));
        composers.put("17", new Composer("17", "Phethisi", "Marameng", "Classical"));
        composers.put("18", new Composer("18", "Mejaele", "Phera", "Classical"));
        composers.put("19", new Composer("19", "Kokoma", "Belebesi", "Classical"));

 
        composers.put("41", new Composer("41", "Khotso", "Motheo", "Post-Romantic"));
        composers.put("42", new Composer("42", "Seisa", "Tsoseletso", "Post-Romantic"));
        composers.put("43", new Composer("43", "Moseme", "Mpolokeng", "Post-Romantic"));
        composers.put("44", new Composer("44", "Sello", "Nyatheli", "Post-Romantic"));
        composers.put("45", new Composer("45", "Letlafuru", "Lethuela", "Post-Romantic"));
        composers.put("46", new Composer("46", "Topollo", "Mpho", "Post-Romantic"));
        composers.put("47", new Composer("47", "Seutloali", "Moyeng", "Post-Romantic"));
        composers.put("48", new Composer("48", "Fito", "Lerapo", "Post-Romantic"));
        composers.put("49", new Composer("49", "Sents'o", "Lewela", "Post-Romantic"));
        composers.put("50", new Composer("50", "Lebe", "Lerumo", "Post-Romantic"));
        
         composers.put("51", new Composer("51", "Rabohlabuli", "Sjava", "Romantic"));
        composers.put("52", new Composer("52", "Makata", "Khotle", "Romantic"));
        composers.put("53", new Composer("53", "Salae", "Moebu", "Romantic"));
        composers.put("54", new Composer("54", "Lebe", "Letlotlo", "Romantic"));
        composers.put("55", new Composer("55", "Sesebe", "Jonase", "Romantic"));
        composers.put("56", new Composer("56", "Clicks", "Thoolo", "Romantic"));
        composers.put("57", new Composer("57", "Nthabeleng", "Neo", "Romantic"));
        composers.put("58", new Composer("58", "Sefula", "Ramashamole", "Romantic"));
        composers.put("59", new Composer("59", "Kepi", "Bobeng", "Romantic"));
        composers.put("60", new Composer("60", "Leula", "Serethe", "Romantic"));

    }
    
}
