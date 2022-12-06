package at.fhtw.DesignAPI;

import static at.fhtw.DesignAPI.model.Model.color;

public class Color {
    public static String findColor(String colors){
        String getColor = color.get(colors);
        return getColor;
    }

}
