package com.company;

public class Main {

    public static void main(String[] args) {
	 kontobankowe saver1 = new kontobankowe();
	 saver1.RachunekBankowy(2000);
	 saver1.setRocznaStopaProcentowa(4);
	 saver1.obliczMiesieczneOdsetki();
	 kontobankowe saver2 = new kontobankowe();
	 saver2.RachunekBankowy(3000);
	 saver2.setRocznaStopaProcentowa(5);
	 saver2.obliczMiesieczneOdsetki();
	 boolean[] tab = new  boolean[100];

    }
}
