package com.vogdo.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        double t = 1;
        return t;
    }
}
