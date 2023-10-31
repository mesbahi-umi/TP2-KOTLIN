package com.estm.tp2.exercice2;

public class CompteEprange(rib:String,private var taux:Double): Compte(rib){
    fun calculInteret():Double{
        return solde * taux / 100;
    }
    override fun toString():String{
        return "CompteEprange{" +
                "taux=" + taux +
                ", solde=" + solde +
                ", RIB='" + rib + '\'' +
                ", operations=" + operations +
                '}';
    }
}
