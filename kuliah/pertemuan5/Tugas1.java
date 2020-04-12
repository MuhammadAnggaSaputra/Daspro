import java.util.Scanner;

public class Tugas1
{
	double gapok, tunjangan, golongan;
	Scanner scan;
	
	public void run()
	{
		scan = new Scanner(System.in);
		System.out.print("Masukkan Gaji Pokok : \n");
		gapok = scan.nextDouble();
		System.out.print("Masukkan Golongn (1-3) : \n");
		golongan = scan.nextDouble();
		
		if (golongan == 1)
			tunjangan = 0.05 * gapok;
		else 
			if (golongan == 2)
				tunjangan = 0.1 * gapok;
			else
				if
				(golongan == 3)
					tunjangan = 0.15 * gapok;
				else 
					System.out.println("Data tunjangan tidak ditemukan");
		
		System.out.println("Informasi Gaji pegawai :");
		System.out.println("=========================");
		System.out.printf("Gaji Pokok : %.2f \n", gapok);
		System.out.printf("Golongan : %.2f \n", golongan);
		System.out.printf("Tunjangan : %.2f \n", tunjangan);
		System.out.printf("Gaji Total : %.2f \n", (gapok+tunjangan));
		System.out.printf("=========================");
	}
}