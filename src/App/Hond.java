package App;

public class Hond extends Dier {

    String naam;
    String spel;

    public Hond(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void spelen(String spel) {
        this.spel = spel;
    }

    public String getSpelen() {
        return  spel;
    }
}
