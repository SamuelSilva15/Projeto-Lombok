package org.gs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() throws MalformedURLException {
        movie = new Movie();
        movie.setTitle("The lord of the rings");
        movie.setDescripton("In the second age of Middle-earth");
        movie.setCountry("New Zeland - United States");
        movie.setLanguage("English");
        movie.setRating(8);
        movie.setOfficialSite(new URL("https://lordoftherings.com/"));
        movie.setId(1L);
    }

    @Test
    void getId(){
        assertNotNull(movie);
        assertEquals(1L, movie.getId());
    }

    @Test
    void setId(){}

    @Test
    void getTitle(){
        assertNotNull(movie);
        assertEquals("The lord of the rings", movie.getTitle());
    }

    @Test
    void setTitle(){}

    @Test
    void getDescription(){
        assertNotNull(movie);
        assertEquals("In the second age of Middle-earth", movie.getDescripton());
    }

    @Test
    void setDescription(){}

    @Test
    void getCountry(){
        assertNotNull(movie);
        assertEquals("New Zeland - United States", movie.getCountry());
    }

    @Test
    void setCountry(){}

    @Test
    void getLanguage(){
        assertNotNull(movie);
        assertEquals("English", movie.getLanguage());
    }

    @Test
    void setLanguage(){}

    @Test
    void getRating(){
        assertNotNull(movie);
        assertEquals(8L, movie.getRating());
    }

    @Test
    void setRating(){}

    @Test
    void getOfficialSite() throws MalformedURLException {
        assertNotNull(movie);
        assertEquals(new URL("https://lordoftherings.com/"), movie.getOfficialSite());
    }

    @Test
    void setOfficialSite(){}

    @Test
    void getGetMinutes(){
        int minutesPlusx = movie.getMinutesPlus(1);
        assertEquals(121, minutesPlusx);
    }
}
