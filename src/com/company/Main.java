package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hoe groot is de zijde: ");
        int zijde = Integer.parseInt(scanner.nextLine());
        Vierkant v = new Vierkant(zijde);
        System.out.printf("De omtrek van een vierkant met zijde %d is %d%n", v.getZijde(), v.getOmtrek());;
        System.out.printf("De oppervlakte van een vierkant met zijde %d is %d%n", v.getZijde(), v.getOppervlakte());
	// write your code here
    }
}
