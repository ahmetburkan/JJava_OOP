package App;

class Bezoeker implements Handeling{

    String voedsel;
    String spelen;
    String naam;

    public Bezoeker(String naam) {
        this.naam = naam;

    }

    @Override
    public void Eten(String voedsel) {

    }

    @Override
    public void Interactie(String spelen) {
        this.spelen = spelen;

    }

}
