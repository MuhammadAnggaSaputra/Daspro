package edu.unpasif.praktikum.daspro.tugas;

import java.util.Scanner;

public class TugasSatu {
	public static void main(String[] args) {
		
		final double PHI = 3.14;
		double radius, luas;
	
			Scanner scan = new Scanner(System.in);
			System.out.printf("Masukkan Nilai r = ");
			radius = scan.nextDouble();
			luas = PHI * radius * radius;
			System.out.printf("Luas Lingkaran = %.2f\n", luas);
	
		
	}
}
