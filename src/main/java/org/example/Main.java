package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.depozyt(500);
        System.out.println("Witaj w naszym banku!");
        System.out.println("Podaj swoje imię");
        Scanner scanneruser = new Scanner(System.in);
        String user=scanneruser.nextLine();
        System.out.println("Witaj ! "+user );
        System.out.println("Ile pieniędzy chciałbyś wypłacić ?");
        Scanner scanner = new Scanner(System.in);
        double kasa=scanner.nextDouble();
        boolean isCorrect= bank.bilans - bank.wyplata(kasa) >=0;
        System.out.println("Bilans " + bank.bilans);
        boolean isNotCorrect= bank.bilans - bank.wyplata(kasa) <=0;
        System.out.println("nic z tego :p");
    }
}