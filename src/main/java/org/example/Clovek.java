package org.example;

public class Clovek {
    private String jmeno;
    private String prijmeni;
    private int vek;

    public Clovek(){
        jmeno="";
        prijmeni="";
        vek=0;
    }

    public Clovek(String jm,String pjm,int vek){
        jmeno=jm;
        prijmeni=pjm;
        this.vek=vek;

    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;

    }
    public String jmenoPrijmeni(){
        return jmeno+" "+prijmeni;
    }

    public boolean dospelost(){
        if (vek>=18)
            return true;

        else
            return false;
    }
}