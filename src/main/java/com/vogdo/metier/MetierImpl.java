package com.vogdo.metier;

import com.vogdo.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    //@Qualifier("dao2")
    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    //public MetierImpl() {}

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
