package daspro.selasa16.pertemuan2;

import java.util.Scanner;

public class PrakB1_193040070 {
	public static void main(String[] args) {
		
		String nama, alamat;
		int usia, gaji ;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("### Pendataan Karyawan PT. Petani kode ###");
		System.out.print("Nama karyawan: ");
		
		nama = keyboard.nextLine();
		System.out.print("Alamat: ");
		alamat = keyboard.nextLine();
		System.out.print("Usia: ");
		usia = keyboard.nextInt();
		System.out.print("Gaji: ");
		gaji = keyboard.nextInt();
		
		System.out.println("---------------");
		System.out.println("Nama Karyawan: " + nama);
		System.out.println("Alamat: " + alamat);
		System.out.println("usia:" + usia + " tahun ");
		System.out.println("Gaji: Rp " + gaji);
	}
}
