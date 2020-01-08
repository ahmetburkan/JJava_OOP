package App.test;

import App.model.Bezoeker;
import App.model.Dier;
import org.junit.Test;

import static org.junit.Assert.*;

public class BezoekerTest {
    Bezoeker gast = new Bezoeker();
    String testnaam = "gozert";
    String  testmetwie = "piet";
    String  testspel = "dansen";

    @Test
    public void setNaam() {
        gast.setNaam(testnaam);
        assertEquals(testnaam, gast.getNaam());
    }

    @Test
    public void getNaam() {
        gast.setNaam(testnaam);
        assertEquals(testnaam, gast.getNaam());
    }

    @Test
    public void setSpel() {
        gast.setSpel(testspel);
        assertEquals(testspel, gast.getSpel());
    }

    @Test
    public void getSpel() {
        gast.setSpel(testspel);
        assertEquals(testspel, gast.getSpel());
    }

    @Test
    public void setMetWie() {
        gast.setMetWie(testmetwie);
        assertEquals(testmetwie, gast.getMetWie());
    }

    @Test
    public void getMetWie() {
        gast.setMetWie(testmetwie);
        assertEquals(testmetwie, gast.getMetWie());
    }

    @Test
    public void aanHetSpelen() {
        gast.setMetWie(testmetwie);
        gast.setSpel(testspel);
        gast.setNaam(testnaam);

        assertEquals(gast.aanHetSpelen(),testnaam + " is aan het " + testspel + " met " + testmetwie);
    }
}