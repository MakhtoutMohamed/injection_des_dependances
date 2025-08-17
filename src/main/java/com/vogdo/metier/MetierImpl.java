package com.vogdo.metier;

import com.vogdo.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double result = t * 6 * Math.pow(10, -6);
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
