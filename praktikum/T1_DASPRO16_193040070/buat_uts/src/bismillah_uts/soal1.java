package bismillah_uts;

import java.util.Scanner;

public class soal1 {
	public static void main(String[] args) {
		
		int s,v,t;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nilai kecepatan Per KM: ");
		v = input.nextInt();
		System.out.print("Masukkan Waktu yang Ditempuh per Jam: ");
		t = input.nextInt();
		s = v * t;
		System.out.printf("kecepatan adalah: %d", s);
		
	}
}



