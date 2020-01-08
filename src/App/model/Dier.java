package App.model;

public abstract class Dier implements Handeling {
    private String diernaam;
    private String dierspel;
    private String metwie;


    @Override
    public void setNaam(String naam) {
        try {
            this.diernaam = naam;

            ObjLijst.getInstance().lijst.add(this);

        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    @Override
    public String getNaam() {
        return this.diernaam;
    }

    @Override
    public void setSpel(String spel) {
        try {
            this.dierspel = spel;
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    @Override
    public String getSpel() {
        return this.dierspel;
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
        return diernaam + " is aan het " + dierspel + " met " + metwie;
    }

    private String aanHetEten() {
        return "is aan het eten";
    }
}
