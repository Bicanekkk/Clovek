package org.example;

public class Listek {
    private int cdosp;
    private int cdite;

    public Listek() {
        cdosp = 300;
        cdite = 200;
    }
    public int getcdosp() {
        return cdosp;
    }

    public int getcdite() {
        return cdite;
    }

    public int getCena(Clovek cl) {
        if(cl.dospelost())
            return cdosp;
        else
            return cdite;
        }
    }

