package net.laichi.pres;

import net.laichi.dao.DaoImpl;
import net.laichi.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl m = new MetierImpl(d);
        //m.setDao(d);
        System.out.println("RES = "+ m.calcul());

    }
}
