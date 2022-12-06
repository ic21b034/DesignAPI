package at.fhtw.DesignAPI;

import static at.fhtw.DesignAPI.model.Model.color;

public class Color {
    public static String findCapital(String colors){
        String capital = color.get(colors.toLowerCase());
        return capital;
    }

}
