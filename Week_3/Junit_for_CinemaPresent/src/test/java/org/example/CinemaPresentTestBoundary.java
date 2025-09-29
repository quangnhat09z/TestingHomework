package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaPresentTestBoundary {
    private CinemaPresent cinemaPresent;

    @BeforeEach
    void setUp() {
        cinemaPresent = new CinemaPresent();
    }

    @Test
    public void testS01() {
        String actual = cinemaPresent.givePresent(4, 7);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }

    @Test
    public void testS02() {
        String actual = cinemaPresent.givePresent(4, 8);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }

    @Test
    public void testS03() {
        String actual = cinemaPresent.givePresent(4, 9);
        String expected = "Notebook";
        assertEquals(expected, actual);
    }


    @Test
    public void testS04() {
        String actual = cinemaPresent.givePresent(4, 7);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }


    @Test
    public void testS05() {
        String actual = cinemaPresent.givePresent(4, 5);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }


    @Test
    public void testS06() {
        String actual = cinemaPresent.givePresent(4, 6);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }

    @Test
    public void testS07() {
        String actual = cinemaPresent.givePresent(4, 4);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }

    @Test
    public void testS08() {
        String actual = cinemaPresent.givePresent(5, 7);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }

    @Test
    public void testS09() {
        String actual = cinemaPresent.givePresent(6, 7);
        String expected = "Notebook+Popcorn+Water";
        assertEquals(expected, actual);
    }

    @Test
    public void testS10() {
        String actual = cinemaPresent.givePresent(3, 7);
        String expected = "Stickers";
        assertEquals(expected, actual);
    }

    @Test
    public void testS11() {
        String actual = cinemaPresent.givePresent(2, 7);
        String expected = "No_Present";
        assertEquals(expected, actual);
    }
}
