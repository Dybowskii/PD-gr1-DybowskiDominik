package com.company;

import java.lang.Math;

public class kontobankowe {
        private static double rocznaStopaProcentowa;
        private double saldo;

        public void RachunekBankowy(double capital){

            this.saldo = capital;
        }
        public void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
            this.rocznaStopaProcentowa=rocznaStopaProcentowa;
        }
        public void obliczMiesieczneOdsetki()
        {
            double odsetki=(saldo*(rocznaStopaProcentowa/100))/12;
            saldo=saldo+odsetki;
            System.out.println("Odsetki wynosza: "+odsetki);
            System.out.println("aktualny stan konta wynosi: "+saldo);

        }

}
