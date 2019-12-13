package App.model;

import java.lang.reflect.Array;
import java.util.List;

public class Bezoeker implements Handeling {
    private String gastnaam;
    private String gastspel;
    private String metwie;

    @Override
    public void setNaam(String naam) {
        try {
            this.gastnaam = naam;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    @Override
    public String getNaam() {
        return this.gastnaam;
    }

    @Override
    public void setSpel(String spel) {
        try {
            this.gastspel = spel;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    @Override
    public String getSpel() {
        return this.gastspel;
    }

    @Override
    public void setMetWie(String metwie) {
        try {
            this.metwie = metwie;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    @Override
    public String getMetWie() {
        return this.metwie;
    }

    @Override
    public String aanHetSpelen() {
        return gastnaam + " is aan het " + gastspel + " met " + metwie;
    }
}
