package bismillah_uts;

import java.util.Scanner;

public class soal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukkan nilai akhir kuliah");
		int nilai = sc.nextInt();
		
		if (nilai < 0 || nilai > 100) {
			System.out.println("\nInput nilai antara 0-100");
		}
		
		if (nilai >= 85 && nilai <= 100) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE A");
		} else if (nilai >= 70 && nilai < 85 ) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE B");
		}else if (nilai >= 55 && nilai <70 ) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE C");
		}else if (nilai >= 30 && nilai < 55 ) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE D");
		} else if (nilai >=30 ) {
			System.out.println("\nGAGAL");
			System.out.println("\nGRADE E");
		}
	}
}

