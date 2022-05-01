package ro.fasttrack.lab10.tema;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private String fruct;

    public Basket(String fruct) {
        this.fruct = fruct;
    }

    public String getFruct() {
        return fruct;
    }

    public boolean find(String fruct) {
        if (this.fruct == fruct) {
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(String fruct) {
        if(this.fruct==fruct) {
            this.fruct=null;
            return true;
        } else {
            return false;
        }
    }
}
