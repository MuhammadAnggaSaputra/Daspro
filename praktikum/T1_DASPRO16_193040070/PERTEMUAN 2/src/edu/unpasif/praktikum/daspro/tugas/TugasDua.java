package edu.unpasif.praktikum.daspro.tugas;

import java.util.Scanner;

public class TugasDua {
	public static void main(String[] args) {
		double Berat, Tinggi, Body;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Berat Badan = ");
		Berat = scan.nextDouble();
		
		System.out.print("Masukkan Tinggi Badan = ");
		Tinggi = scan.nextDouble();
		
		Body = Berat / (Tinggi * Tinggi);
		System.out.printf("Body Mass Index = %f \n", Body);
	}
}
