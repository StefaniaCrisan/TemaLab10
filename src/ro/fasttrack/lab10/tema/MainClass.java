package ro.fasttrack.lab10.tema;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Basket> fruitBasket = new ArrayList<Basket>();
        Basket fruct1=new Basket("mere");
        Basket fruct2=new Basket("pere");
        Basket fruct3=new Basket("capsuni");
        Basket fruct4=new Basket("cirese");
        Basket fruct5=new Basket("struguri");
        fruitBasket.add(fruct1);
        fruitBasket.add(fruct2);
        fruitBasket.add(fruct3);
        fruitBasket.add(fruct4);
        fruitBasket.add(fruct5);

        System.out.println(fruct1.find("mere"));
        System.out.println(fruct1.find("pere"));

    }

}
