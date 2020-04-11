package daspro.selasa16.pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrakB2_193040070 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Inputkan nama: ");
		String nama = br.readLine();
		System.out.println("Nama Kamu adalah " + nama);
	}
}
