package App.model;

import java.util.ArrayList;

public class DierenLijst {

    public ArrayList<String> lijst;

    DierenLijst() {
        lijst = new ArrayList<String>();
    }

    private static DierenLijst instance;

    public static DierenLijst getInstance() {
        if (instance == null) instance = new DierenLijst();
        return instance;
    }
}
