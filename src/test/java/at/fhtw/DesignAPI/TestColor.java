package at.fhtw.DesignAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestColor {
    @Test
    void findCapitalTrue(){
    assertEquals("Red",Color.findColor("Green"));
    }

    @Test
    void findCapitalFalse(){
        assertNotEquals("Green",Color.findColor("Blue"));
    }
}
