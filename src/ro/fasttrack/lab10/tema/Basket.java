package ro.fasttrack.lab10.tema;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private String fruct;

    public Basket(String fruct) {
        this.fruct = fruct;
    }

//    public static void main(String[] args) {
//        List fruitBasket = new ArrayList<String>();
//        fruitBasket.add("mere");
//        fruitBasket.add("pere");
//        fruitBasket.add("capsuni");
//        fruitBasket.add("cirese");
//        fruitBasket.add("struguri");
//
////        find("mere");
//    }

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

//    public int position(String fruct){
//
//    }

}
