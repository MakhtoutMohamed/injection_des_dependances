package com.vogdo.pres;

import com.vogdo.dao.DaoImpl;
import com.vogdo.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl m = new MetierImpl();
        m.setDao(dao);
        System.out.println("Resultat : " + m.calcul());
    }
}
