package App.model;

import java.util.ArrayList;

public class ObjLijst {

    public ArrayList<Handeling> lijst;

    ObjLijst() {
        lijst = new ArrayList<Handeling>();
    }

    private static ObjLijst instance;

    public static ObjLijst getInstance() {
        if (instance == null) instance = new ObjLijst();
        return instance;
    }
}
