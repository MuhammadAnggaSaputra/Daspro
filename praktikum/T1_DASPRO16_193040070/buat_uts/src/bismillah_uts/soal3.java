package bismillah_uts;

import java.util.Scanner;

public class soal3 {
	    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int gaji1=2000000, 
			gaji2=2500000, 
			gaji3=3000000, 
			gaji4=4000000,
			gaji5=5000000;
		double tun1 = (int) (gaji1*2/100), tun2 = (int) (gaji2*5.5/100), tun3 = (int) (gaji3*7/100), tun4 = (int) (gaji4*10.5/100), tun5 = (int) (gaji5*15/100);
		String gol1 = "A", gol2 = "B", gol3 = "C", gol4 = "D", gol5 = "E";
		
		System.out.print("Golongan (A-E) : ");
		String pilihan = s.next();
		
		switch(pilihan) {
		case "A":
			System.out.println("Informasi Gaji : ");
			System.out.println("========================");
			System.out.println("Gaji Pokok : "+gaji1);
			System.out.println("Golongan   : "+gol1);
			System.out.println("Tunjangan  : "+tun1);
			System.out.println("Gaji Total : "+(gaji1+tun1));
			System.out.println("=======================");
			break;
		case "B":
			System.out.println("Informasi Gaji : ");
			System.out.println("========================");
			System.out.println("Gaji Pokok : "+gaji2);
			System.out.println("Golongan   : "+gol2);
			System.out.println("Tunjangan  : "+tun2);
			System.out.println("Gaji Total : "+(gaji2+tun2));
			System.out.println("=======================");
			break;
		case "C":
			System.out.println("Informasi Gaji : ");
			System.out.println("========================");
			System.out.println("Gaji Pokok : "+gaji3);
			System.out.println("Golongan   : "+gol3);
			System.out.println("Tunjangan  : "+tun3);
			System.out.println("Gaji Total : "+(gaji3+tun3));
			System.out.println("=======================");
			break;
		case "D":
			System.out.println("Informasi Gaji : ");
			System.out.println("========================");
			System.out.println("Gaji Pokok : "+gaji4);
			System.out.println("Golongan   : "+gol4);
			System.out.println("Tunjangan  : "+tun4);
			System.out.println("Gaji Total : "+(gaji4+tun4));
			System.out.println("=======================");
		case "E":
			System.out.println("Informasi Gaji : ");
			System.out.println("========================");
			System.out.println("Gaji Pokok : "+gaji5);
			System.out.println("Golongan   : "+gol5);
			System.out.println("Tunjangan  : "+tun5);
			System.out.println("Gaji Total : "+(gaji5+tun5));
			System.out.println("=======================");
			break;
		default:
			System.out.println("Golongan tidak diketahui");
		}
	}
}
