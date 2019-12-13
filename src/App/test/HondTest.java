package App.test;

import App.model.Dier;
import App.model.Hond;
import org.junit.Test;

import static org.junit.Assert.*;

public class HondTest extends Dier {
    Hond hondje = new Hond();
    String  testnaam = "gozert";
    String  testmetwie = "piet";
    String  testspel = "dansen";


    @Test
    public void testSetNaam() {
        hondje.setNaam(testnaam);
        assertEquals(testnaam, hondje.getNaam());
    }

    @Test
    public void testGetNaam() {
        hondje.setNaam(testnaam);
        assertEquals(testnaam, hondje.getNaam());
    }

    @Test
    public void testSetSpel() {
        hondje.setSpel(testspel);
        assertEquals(testspel, hondje.getSpel());
    }

    @Test
    public void testGetSpel() {
        hondje.setSpel(testspel);
        assertEquals(testspel, hondje.getSpel());
    }

    @Test
    public void testSetMetWie() {
        hondje.setMetWie(testmetwie);
        assertEquals(testmetwie, hondje.getMetWie());
    }

    @Test
    public void testGetMetWie() {
        hondje.setMetWie(testmetwie);
        assertEquals(testmetwie, hondje.getMetWie());
    }

    @Test
    public void testAanHetSpelen() {
        hondje.setMetWie(testmetwie);
        hondje.setSpel(testspel);
        hondje.setNaam(testnaam);

        assertEquals(hondje.aanHetSpelen(),testnaam + " is aan het " + testspel + " met " + testmetwie);

    }
}