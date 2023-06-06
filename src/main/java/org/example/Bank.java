package org.example;

public class Bank {

    public double bilans = 0;
    public double getBilans(){
        return bilans;
    }
    public double depozyt(double wplata){
        return bilans = bilans + wplata ;
    }
    public double wyplata(double kasa){
        if (bilans < kasa){
            System.out.println("nic z tego :p");
        }
        else {
             bilans = bilans - kasa;

        }
        return bilans;
    }
}